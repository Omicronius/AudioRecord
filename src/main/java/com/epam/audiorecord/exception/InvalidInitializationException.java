package com.epam.audiorecord.exception;

public class InvalidInitializationException extends Throwable {
    public InvalidInitializationException() {
    }

    public InvalidInitializationException(String message) {
        super(message);
    }

    public InvalidInitializationException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidInitializationException(Throwable cause) {
        super(cause);
    }
}
