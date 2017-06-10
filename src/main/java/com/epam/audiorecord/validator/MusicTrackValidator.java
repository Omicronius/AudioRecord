package com.epam.audiorecord.validator;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MusicTrackValidator {
    Logger logger = LogManager.getLogger(MusicTrackValidator.class);
    private String REGEX_PATTERN = "\\w+.\\w+\\t\\d+(\\t[a-zA-Z0-9\\x20']+){2}\\t\\w+\\t\\d+";

    public ArrayList<String> validateMusicTracks(ArrayList<String> musicTracks) {
        Pattern pattern = Pattern.compile(REGEX_PATTERN);
        ArrayList<String> validatedTracks = new ArrayList<>();
        for (String track : musicTracks) {
            Matcher matcher = pattern.matcher(track);
            if (matcher.matches()) {
                validatedTracks.add(track);
            } else {
                logger.log(Level.WARN, "Some string contains invalid data. It has been skipped.");
            }
        }
        return validatedTracks;
    }
}
