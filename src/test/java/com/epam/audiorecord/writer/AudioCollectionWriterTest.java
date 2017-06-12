package com.epam.audiorecord.writer;

import com.epam.audiorecord.entity.Disk;
import com.epam.audiorecord.entity.Format;
import com.epam.audiorecord.entity.Style;
import com.epam.audiorecord.entity.Track;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class AudioCollectionWriterTest {
    AudioCollectionWriter writer;
    ArrayList<Track> tracks;
    Disk disk;

    @Before
    public void setUp() throws Exception {
        writer = new AudioCollectionWriter();
        tracks = new ArrayList<>();
        tracks.add(new Track("smells.wav", 315, "Nirvana", "Smells like teen spirit", Style.ROCK, Format.WAV, 266));
        tracks.add(new Track("Clapton.mp3", 217, "Eric Clapton", "Layla", Style.ROCK, Format.MP3, 283));
        tracks.add(new Track("numb.wma", 407, "Linkin park", "Numb", Style.ROCK, Format.WMA, 218));
        disk = new Disk();
    }

    @After
    public void tearDown() throws Exception {
        writer = null;
        tracks = null;
        disk = null;
    }

    @Test
    public void writeCollection() throws Exception {
        writer.writeCollection(tracks, disk);
        Assert.assertFalse(disk.readFiles().isEmpty());
    }

}