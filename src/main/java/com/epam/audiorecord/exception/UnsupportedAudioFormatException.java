package com.epam.audiorecord.exception;

public class UnsupportedAudioFormatException extends Throwable {
    public UnsupportedAudioFormatException() {
    }

    public UnsupportedAudioFormatException(String message) {
        super(message);
    }

    public UnsupportedAudioFormatException(String message, Throwable cause) {
        super(message, cause);
    }

    public UnsupportedAudioFormatException(Throwable cause) {
        super(cause);
    }
}
