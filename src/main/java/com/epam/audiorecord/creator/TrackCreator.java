package com.epam.audiorecord.creator;

import com.epam.audiorecord.entity.Format;
import com.epam.audiorecord.entity.Style;
import com.epam.audiorecord.entity.Track;

public class TrackCreator {
    private String dataDelimiter = "\t";
    private String extensionDelimiter = "\\.";

    public Track createTrack(String trackData) {
        String[] data = trackData.split(dataDelimiter);
        String name = data[0];
        int size = Integer.parseInt(data[1]);
        String author = data[2];
        String title = data[3];
        Style style = Style.valueOf(data[4].toUpperCase());
        Format format = Format.valueOf(name.split(extensionDelimiter)[1].toUpperCase());
        int duration = Integer.parseInt(data[5]);
        return new Track(name, size, author, title, style, format, duration);
    }
}
