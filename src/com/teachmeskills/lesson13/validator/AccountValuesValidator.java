package com.teachmeskills.lesson13.validator;

import com.teachmeskills.lesson13.castom_exeption.WrongLoginException;
import com.teachmeskills.lesson13.castom_exeption.WrongPasswordException;
import com.teachmeskills.lesson13.utils.IConst;

public class AccountValuesValidator {

    public static boolean CheckValidAccountValues (String login, String password, String confirmPassword)
            throws WrongLoginException,
                   WrongPasswordException {
        //Login check
        if(login.length() > IConst.MAX_LOGIN_SYMBOL || login.contains(" ")){
            throw new WrongLoginException("You entered an incorrect login");
        }
        //Password check
        if(password.isEmpty() || password.length() > IConst.MAX_PASSWORD_SYMBOL || password.contains(" ") || !password.matches(".*\\\\d.*")){
            throw new WrongPasswordException("You entered an incorrect password " +
                    "(The password must be no more than " + IConst.MAX_PASSWORD_SYMBOL + " characters without spaces and contain at least 1 digit)");
        }
        //Password re-entry check
        if(!confirmPassword.equals(password)){
            throw new WrongPasswordException("You repeated the password incorrectly");
        }

        return true;
    }

}
