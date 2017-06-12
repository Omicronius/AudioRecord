package com.epam.audiorecord.finder;

import com.epam.audiorecord.entity.Format;
import com.epam.audiorecord.entity.Style;
import com.epam.audiorecord.entity.Track;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class AudioTrackFinderTest {
    AudioTrackFinder finder;
    ArrayList<Track> tracks;

    @Before
    public void setUp() throws Exception {
        finder = new AudioTrackFinder();
        tracks = new ArrayList<>();
        tracks.add(new Track("Clapton.mp3", 217, "Eric Clapton", "Layla", Style.ROCK, Format.MP3, 218));
        tracks.add(new Track("Clapton2.flac", 275, "Eric Clapton", "Tears in heaven", Style.ROCK, Format.FLAC, 317));
        tracks.add(new Track("smells.wav", 315, "Nirvana", "Smells like teen spirit", Style.ROCK, Format.WAV, 266));
        tracks.add(new Track("numb.wma", 407, "Linkin park", "Numb", Style.ROCK, Format.WMA, 282));
    }

    @After
    public void tearDown() throws Exception {
        finder = null;
        tracks = null;
    }

    @Test
    public void findTracksByAuthor() throws Exception {
        Assert.assertTrue(finder.findTracksByAuthor("Clapton", tracks).size() == 2);
    }

    @Test
    public void findTracksByTitle() throws Exception {
        Assert.assertTrue(finder.findTracksByTitle("numb", tracks).size() == 1);
    }

    @Test
    public void findFakeTrackByTitle() throws Exception {
        Assert.assertTrue(finder.findTracksByTitle("abracadabra", tracks).isEmpty());
    }

}