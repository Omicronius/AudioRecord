package com.epam.audiorecord.entity;

public class Track extends File {
    private String author;
    private String title;
    private String style;
    private Format format;
    private int duration;

    public Track() {
    }

    public Track(String name, int size, String author, String title, String style, Format format, int duration) {
        super(name, size);
        this.author = author;
        this.title = title;
        this.style = style;
        this.format = format;
        this.duration = duration;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public Format getFormat() {
        return format;
    }

    public void setFormat(Format format) {
        this.format = format;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

}
