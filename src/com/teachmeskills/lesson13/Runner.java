package com.teachmeskills.lesson13;

import com.teachmeskills.lesson13.castom_exeption.WrongLoginException;
import com.teachmeskills.lesson13.castom_exeption.WrongPasswordException;
import com.teachmeskills.lesson13.utils.IConst;
import com.teachmeskills.lesson13.validator.AccountValuesValidator;
import com.teachmeskills.lesson13.validator.AccountValuesValidator2;

import java.util.Scanner;
/** Create a class that contains a static method.
 * This method takes three parameters as input:
    Login
    Password
    confirmPassword
 *All fields have the data type String.
 * The length of login must be less than 20 characters and must not contain spaces.
 * If login does not meet these requirements, a WrongLoginException must be thrown.
 * Password must be less than 20 characters long, must not contain spaces, and must contain at least one digit.
 * Also password and confirmPassword must be equal. If password does not meet these requirements, a WrongPasswordException must be thrown.
 * The WrongPasswordException and WrongLoginException exception classes are custom exception classes with two constructors
    (one is the default, the second one takes an exception message and passes it to the Exception class constructor).
 * The method returns true if the values are valid or false otherwise.
 * Arrange the classes into packages: the class for validating values should be in its own separate package, the classes for exceptions - in its own package.
 * Create a Runner class to test this class.
 * Try to solve the problem in two ways:
    1. using methods of the String class "out of the box", e.g. the contains method
    2. by breaking the string into an array of char's (string toCharArray()) and make a traversal and check the array.*/
public class Runner {

    public static void main(String[] args){
        System.out.println("Start.");

        //Collecting account login information.
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your login:");
        String log = scan.nextLine();
        System.out.println("Enter your password:");
        String pass = scan.nextLine();
        System.out.println("Confirm your password:");
        String confPass = scan.nextLine();

        //First method verification using out-of-the-box methods
        System.out.println("First examination:");
        try {
            boolean result = AccountValuesValidator.checkValidAccountValues(log, pass, confPass);
            if(result){
                System.out.println("First login check successful");
            }
        } catch (WrongLoginException e) {
            System.out.println("You enter wrong login, it should contain no more than " + IConst.MAX_LOGIN_SYMBOL + " symbols without spaces");
        } catch (WrongPasswordException e) {
            System.out.println("Password error: " + e.getMessage());
        } catch (Exception e){
            System.out.println("Error");
        }

        //checking with the second method by converting strings to an array of chars
        System.out.println("Second examination:");
        try {
            boolean result2 = AccountValuesValidator2.checkValidAccountValues2(log, pass, confPass);
            if(result2){
                System.out.println("First login check successful");
            }
        } catch (WrongLoginException e) {
            System.out.println("You enter wrong login, it should contain no more than " + IConst.MAX_LOGIN_SYMBOL + " symbols without spaces");
        } catch (WrongPasswordException e) {
            System.out.println("Password error: " + e.getMessage());
        } catch (Exception e){
            System.out.println("Error");
        }

        System.out.println("End.");
    }

}
