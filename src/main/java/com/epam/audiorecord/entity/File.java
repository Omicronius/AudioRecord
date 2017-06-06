package com.epam.audiorecord.entity;

import java.util.UUID;

public class File {
    UUID id;
    String name;
    int size;

    public File() {
        this.id = UUID.randomUUID();
    }

    public File(String name, int size) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.size = size;
    }

    public UUID getId() {
        return id;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
