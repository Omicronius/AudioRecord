package com.epam.audiorecord.entity;

public enum Format {
    MP3, WAV, FLAC, AAC, OGG, WMA;

    public static Format stringToEnum(String str) {
        return Format.valueOf(str);
    }
}
