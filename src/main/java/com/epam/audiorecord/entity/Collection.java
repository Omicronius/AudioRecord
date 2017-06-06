package com.epam.audiorecord.entity;

import java.util.List;

public class Collection {
    List<Track> tracks;

    public Collection() {
    }

    public Collection(List<Track> tracks) {
        this.tracks = tracks;
    }

    public void addTrack(Track track) {
        tracks.add(track);
    }

    public void removeTrack(Track track) {
        tracks.remove(track);
    }
}
