package com.epam.audiorecord.entity;

public class Track extends File {
    private String author;
    private String title;
    private Style style;
    private Format format;
    private int duration;

    public Track() {
    }

    public Track(String name, int size, String author, String title, Style style, Format format, int duration) {
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

    public Style getStyle() {
        return style;
    }

    public void setStyle(Style style) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Track track = (Track) o;

        if (duration != track.duration) return false;
        if (author != null ? !author.equals(track.author) : track.author != null) return false;
        if (title != null ? !title.equals(track.title) : track.title != null) return false;
        if (style != track.style) return false;
        return format == track.format;
    }

    @Override
    public int hashCode() {
        int result = author != null ? author.hashCode() : 0;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (style != null ? style.hashCode() : 0);
        result = 31 * result + (format != null ? format.hashCode() : 0);
        result = 31 * result + duration;
        return result;
    }

    @Override
    public String toString() {
        return "Track{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", style=" + style +
                ", format=" + format +
                ", duration=" + duration +
                '}';
    }
}
