package com.epam.audiorecord.creator;

import com.epam.audiorecord.entity.Format;
import com.epam.audiorecord.entity.Style;
import com.epam.audiorecord.entity.Track;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class TrackCreatorTest {
    private static TrackCreator creator;
    private static String trackData = "human.mp3	313	Human	Rag'n'bone man	Rock	247";

    @BeforeClass
    public static void init() {
        creator = new TrackCreator();
    }

    @Test
    public void createTrack() throws Exception {
        Track actual = new Track("human.mp3", 313, "Human", "Rag'n'bone man", Style.ROCK, Format.MP3, 247);
        Track excepted = creator.createTrack(trackData);
        Assert.assertEquals(excepted, actual);
    }
}