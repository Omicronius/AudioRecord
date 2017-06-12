package com.epam.audiorecord.creator;

import com.epam.audiorecord.entity.Format;
import com.epam.audiorecord.entity.Style;
import com.epam.audiorecord.entity.Track;

public class TrackCreator {
    private String dataDelimiter = "\t";
    private String extensionDelimiter = "\\.";

    public Track createTrack(String trackData) {
        String[] data = trackData.split(dataDelimiter);
        String name = data[0].trim();
        int size = Integer.parseInt(data[1].trim());
        String author = data[2].trim();
        String title = data[3].trim();
        Style style = Style.stringToEnum(data[4].toUpperCase());
        Format format = Format.stringToEnum(name.split(extensionDelimiter)[1].trim().toUpperCase());
        int duration = Integer.parseInt(data[5].trim());
        return new Track(name, size, author, title, style, format, duration);
    }
}
