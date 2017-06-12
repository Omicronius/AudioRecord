package com.epam.audiorecord.sorter;

import com.epam.audiorecord.entity.Format;
import com.epam.audiorecord.entity.Style;
import com.epam.audiorecord.entity.Track;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by Kos on 11.06.2017.
 */
public class AudioTrackSorterTest {
    AudioTrackSorter sorter;
    ArrayList<Track> tracks;

    @Before
    public void setUp() throws Exception {
        sorter = new AudioTrackSorter();
        tracks = new ArrayList<>();
        tracks.add(new Track("smells.wav", 315, "Nirvana", "Smells like teen spirit", Style.ROCK, Format.WAV, 266));
        tracks.add(new Track("Clapton.mp3", 217, "Eric Clapton", "Layla", Style.ROCK, Format.MP3, 283));
        tracks.add(new Track("requiem.mp3", 217, "Mozart", "Requiem", Style.CLASSIC, Format.MP3, 275));
        tracks.add(new Track("Clapton2.flac", 275, "Eric Clapton", "Tears in heaven", Style.ROCK, Format.FLAC, 317));
        tracks.add(new Track("numb.wma", 407, "Linkin park", "Numb", Style.ROCK, Format.WMA, 218));
    }

    @After
    public void tearDown() throws Exception {
        sorter = null;
        tracks = null;
    }

    @Test
    public void sortTracksByAuthor() throws Exception {
        sorter.sortTracksByAuthor(tracks);
        Assert.assertTrue(tracks.get(0).getTitle().equals("Layla"));
    }

    @Test
    public void sortTracksByDuration() throws Exception {
        sorter.sortTracksByDuration(tracks);
        Assert.assertTrue(tracks.get(0).getDuration() == 218);
    }

    @Test
    public void sortTracksByStyle() throws Exception {
        sorter.sortTracksByStyle(tracks);
        Assert.assertTrue(tracks.get(0).getStyle() == Style.CLASSIC);
    }

}