package com.epam.audiorecord.entity;

public class Disk implements Writable, Readable {

    @Override
    public void write(File file) {
    }

    @Override
    public File Read() {
        throw new UnsupportedOperationException();
    }
}
