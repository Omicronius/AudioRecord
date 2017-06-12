package com.epam.audiorecord.sorter;

import com.epam.audiorecord.entity.Track;
import java.util.Comparator;
import java.util.List;

public class AudioTrackSorter {
    public void sortTracksByAuthor(List<Track> tracks) {
        tracks.sort(Comparator.comparing(Track::getAuthor).thenComparing(Track::getTitle));
    }

    public void sortTracksByDuration(List<Track> tracks) {
        tracks.sort(Comparator.comparing(Track::getDuration));
    }
}
