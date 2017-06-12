package com.epam.audiorecord;

import com.epam.audiorecord.creator.TrackCreator;
import com.epam.audiorecord.entity.Disk;
import com.epam.audiorecord.entity.Storage;
import com.epam.audiorecord.entity.Track;
import com.epam.audiorecord.exception.InvalidInitializationException;
import com.epam.audiorecord.reader.MusicTrackReader;
import com.epam.audiorecord.sorter.AudioTrackSorter;
import com.epam.audiorecord.validator.MusicTrackValidator;
import com.epam.audiorecord.writer.AudioCollectionWriter;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import java.util.List;
import java.util.stream.Collectors;

public class FunctionalTest {
    private static final String PATH_TO_FILE = "files/tracks.txt";
    private static MusicTrackReader reader;
    private static MusicTrackValidator validator;
    private static TrackCreator creator;
    private static AudioTrackSorter sorter;
    private static AudioCollectionWriter writer;
    private static Storage disk;

    @BeforeClass
    public static void setUp() {
        reader = new MusicTrackReader();
        validator = new MusicTrackValidator();
        creator = new TrackCreator();
        sorter = new AudioTrackSorter();
        writer = new AudioCollectionWriter();
        disk = new Disk();
    }

    @Test
    public void applicationTest() throws InvalidInitializationException {
        List<String> lines = validator.validateMusicTracks(reader.readTracksFromFile(PATH_TO_FILE));
        List<Track> tracks = lines.stream().map(creator::createTrack).collect(Collectors.toList());
        sorter.sortTracksByStyle(tracks);
        writer.writeCollection(tracks, disk);
        Assert.assertFalse(disk.readFiles().isEmpty());
    }
}
