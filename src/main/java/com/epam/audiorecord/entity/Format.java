package com.epam.audiorecord.entity;

import com.epam.audiorecord.exception.UnsupportedAudioFormatException;

public enum Format {
    MP3, WAV, FLAC, AAC, OGG, WMA;

    public static Format stringToEnum(String format) throws UnsupportedAudioFormatException {
        switch (format.toUpperCase()) {
            case "MP3":
                return MP3;
            case "WAV":
                return WAV;
            case "FLAC":
                return FLAC;
            case "AAC":
                return AAC;
            case "OGG":
                return OGG;
            case "WMA":
                return WMA;
            default:
                throw new UnsupportedAudioFormatException();
        }
    }
}
