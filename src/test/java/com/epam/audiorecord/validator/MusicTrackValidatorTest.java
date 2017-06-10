package com.epam.audiorecord.validator;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;

public class MusicTrackValidatorTest {
    private static MusicTrackValidator validator;
    private static ArrayList<String> unvalidatedTracks;
    private static String correctTrack = "track.mp3\t218\tGustavo Santaolalla\tThe last of us\tPop\t298";
    private static String incorrectTrack = "track.track\twrong data\t!!!\t745";

    @BeforeClass
    public static void init() {
        validator = new MusicTrackValidator();
        unvalidatedTracks = new ArrayList<>();
        unvalidatedTracks.add(correctTrack);
        unvalidatedTracks.add(incorrectTrack);
    }

    @Test
    public void passesValidMusicTrack() {
        Assert.assertTrue(validator.validateMusicTracks(unvalidatedTracks).contains(correctTrack));
    }

    @Test
    public void blocksIncorrectMusicTrack() {
        Assert.assertFalse(validator.validateMusicTracks(unvalidatedTracks).contains(incorrectTrack));
    }
}