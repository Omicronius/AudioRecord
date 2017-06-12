package com.epam.audiorecord.entity;

import java.util.List;

public abstract class Storage implements Readable, Writable {
    private List<File> files;
    private int dataCapability;

    public Storage(int dataCapability) {
        this.dataCapability = dataCapability;
    }

    @Override
    public List<File> readFiles() {
        return files;
    }

    @Override
    public void writeFiles(List<File> files) {
        this.files = files;
    }

    public int getDataCapability() {
        return dataCapability;
    }

}
