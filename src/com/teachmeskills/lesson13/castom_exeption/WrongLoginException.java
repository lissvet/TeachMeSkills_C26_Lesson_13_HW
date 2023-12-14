package com.teachmeskills.lesson13.castom_exeption;

public class WrongLoginException extends Exception{

    public WrongLoginException() {
    }

    public WrongLoginException(String message) {
        super(message);
    }

}
