package com.epam.audiorecord.finder;

import com.epam.audiorecord.entity.Track;

import java.util.List;
import java.util.stream.Collectors;

public class AudioTrackFinder {
    public List<Track> findTracksByAuthor(String keyword, List<Track> tracks) {
        return tracks.stream().filter(o -> o.getAuthor().toLowerCase().contains(keyword.toLowerCase()))
                .collect(Collectors.toList());
    }

    public List<Track> findTracksByTitle(String keyword, List<Track> tracks) {
        return tracks.stream().filter(o -> o.getTitle().toLowerCase().contains(keyword.toLowerCase()))
                .collect(Collectors.toList());
    }
}
