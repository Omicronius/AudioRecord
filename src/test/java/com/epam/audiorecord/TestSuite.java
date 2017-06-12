package com.epam.audiorecord;

import com.epam.audiorecord.creator.TrackCreatorTest;
import com.epam.audiorecord.finder.AudioTrackFinderTest;
import com.epam.audiorecord.reader.MusicTrackReaderTest;
import com.epam.audiorecord.sorter.AudioTrackSorterTest;
import com.epam.audiorecord.util.CollectionDurationCalculatorTest;
import com.epam.audiorecord.validator.MusicTrackValidatorTest;
import com.epam.audiorecord.writer.AudioCollectionWriterTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)

@Suite.SuiteClasses({
        TrackCreatorTest.class,
        AudioTrackFinderTest.class,
        MusicTrackReaderTest.class,
        AudioTrackSorterTest.class,
        MusicTrackValidatorTest.class,
        CollectionDurationCalculatorTest.class,
        AudioCollectionWriterTest.class,
        FunctionalTest.class
})
public class TestSuite {
}
