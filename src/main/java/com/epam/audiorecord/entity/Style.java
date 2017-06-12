package com.epam.audiorecord.entity;

public enum Style {
    CLASSIC, JAZZ, BLUES, POP, DISCO, ROCK, TECHNO, TRANCE, UNKNOWN;

    public Style stringToEnum(String str) {
        Style style;
        try {
            style = Style.valueOf(str.toUpperCase());
        } catch (IllegalArgumentException e) {
            style = UNKNOWN;
        }
        return style;
    }
}
