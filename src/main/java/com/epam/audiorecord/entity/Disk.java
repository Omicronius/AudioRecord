package com.epam.audiorecord.entity;

public class Disk extends Storage {
    private static final int DATA_CAPABILITY = 8000;

    public Disk() {
        super(DATA_CAPABILITY);
    }
}
