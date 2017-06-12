package com.epam.audiorecord.writer;

import com.epam.audiorecord.entity.File;
import com.epam.audiorecord.entity.Storage;
import com.epam.audiorecord.entity.Track;
import com.epam.audiorecord.util.CollectionCalculator;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class AudioCollectionWriter {
    public static Logger logger = LogManager.getLogger(AudioCollectionWriter.class);

    public void writeCollection(List<Track> tracks, Storage storage) {
        if (storage.getDataCapability() >= CollectionCalculator.calculateTotalSize(tracks)) {
            storage.writeFiles(new ArrayList<>(tracks));
        } else {
            logger.log(Level.WARN, "Not enough space on the storage.");
        }
    }
}
