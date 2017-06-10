package com.epam.audiorecord.entity;

public enum Style {
    CLASSIC, JAZZ, BLUES, POP, DISCO, ROCK, TECHNO, TRANCE;

    public Style stringToEnum(String str) {
        return Style.valueOf(str);
    }
}
