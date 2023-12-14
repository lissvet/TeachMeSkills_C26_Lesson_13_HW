package com.teachmeskills.lesson13.validator;

import com.teachmeskills.lesson13.castom_exeption.WrongLoginException;
import com.teachmeskills.lesson13.castom_exeption.WrongPasswordException;
import com.teachmeskills.lesson13.utils.IConst;

import java.util.Arrays;

public class AccountValuesValidator2 {

    public static boolean checkValidAccountValues2 (String login, String password, String confirmPassword)
            throws WrongLoginException,
            WrongPasswordException {
        //Login check
        char[] log = login.toCharArray();
        if (log.length > IConst.MAX_LOGIN_SYMBOL) {
            throw new WrongLoginException("You entered an incorrect login");
        }
        for(char i : log){
            if (i == ' '){
                throw new WrongLoginException("You entered an incorrect login");
            }
        }
        //Password check
        char[] pass = password.toCharArray();
        boolean numberInPassword = false;
        for(char i : pass){
            if (i == ' '){
                throw new WrongPasswordException("You entered an incorrect password " +
                        "(The password must be no more than " + IConst.MAX_PASSWORD_SYMBOL + " characters without spaces and contain at least 1 digit)");
            }
            if(i >=1 && i <= 9){
                numberInPassword = true;
            }
        }
        if (!numberInPassword){
            throw new WrongPasswordException("You entered an incorrect password " +
                    "(The password must be no more than " + IConst.MAX_PASSWORD_SYMBOL + " characters without spaces and contain at least 1 digit)");
        }
        if(pass.length > IConst.MAX_PASSWORD_SYMBOL){
            throw new WrongPasswordException("You entered an incorrect password " +
                    "(The password must be no more than " + IConst.MAX_PASSWORD_SYMBOL + " characters without spaces and contain at least 1 digit)");
        }
        //Password re-entry check
        char[] confPass = confirmPassword.toCharArray();
        if (!Arrays.equals(confPass, pass)){
            throw new WrongPasswordException("You repeated the password incorrectly");
        }

        return true;
    }

}
