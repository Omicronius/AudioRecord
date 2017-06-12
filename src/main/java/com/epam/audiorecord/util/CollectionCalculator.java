package com.epam.audiorecord.util;

import com.epam.audiorecord.entity.Track;

import java.util.List;

public class CollectionCalculator {
    public static int calculateTotalSize(List<Track> tracks) {
        return tracks.stream().mapToInt(Track::getSize).sum();
    }

    public static int calculateTotalDuration(List<Track> tracks) {
        return tracks.stream().mapToInt(Track::getDuration).sum();
    }
}
