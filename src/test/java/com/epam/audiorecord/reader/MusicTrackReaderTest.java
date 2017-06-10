package com.epam.audiorecord.reader;


import com.epam.audiorecord.exception.InvalidInitializationException;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;

public class MusicTrackReaderTest {
    private static MusicTrackReader reader;
    private static String filePath;


    @BeforeClass
    public static void setUpClass() throws Exception {
        reader = new MusicTrackReader();
        filePath = "files/tracks.txt";
    }

    @Test
    public void readAllTracks() throws InvalidInitializationException {
        List<String> lines = reader.readTracksFromFile(filePath);
        Assert.assertFalse(lines.isEmpty());
    }
}