package com.epam.audiorecord.entity;

import com.epam.audiorecord.exception.UnsupportedAudioFormatException;

public enum Format {
    MP3, WAV, FLAC, AAC, OGG, WMA,;

    public Format stringToEnum(String str) {
        return Format.valueOf(str);
    }
}
