package com.epam.audiorecord.util;

import com.epam.audiorecord.entity.Format;
import com.epam.audiorecord.entity.Style;
import com.epam.audiorecord.entity.Track;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class CollectionDurationCalculatorTest {
    ArrayList<Track> tracks;

    @Before
    public void setUp() throws Exception {
        tracks = new ArrayList<>();
        tracks.add(new Track("smells.wav", 315, "Nirvana", "Smells like teen spirit", Style.ROCK, Format.WAV, 266));
        tracks.add(new Track("Clapton.mp3", 217, "Eric Clapton", "Layla", Style.ROCK, Format.MP3, 283));
        tracks.add(new Track("Clapton2.flac", 275, "Eric Clapton", "Tears in heaven", Style.ROCK, Format.FLAC, 317));
        tracks.add(new Track("numb.wma", 407, "Linkin park", "Numb", Style.ROCK, Format.WMA, 218));
    }

    @After
    public void tearDown() throws Exception {
        tracks = null;
    }

    @Test
    public void calculateTotalDuration() throws Exception {
        Assert.assertEquals(CollectionCalculator.calculateTotalDuration(tracks), 1084);
    }

    @Test
    public void calculateTotalSize() throws Exception {
        Assert.assertEquals(CollectionCalculator.calculateTotalSize(tracks), 1214);
    }

}