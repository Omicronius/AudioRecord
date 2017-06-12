package com.epam.audiorecord.validator;

import com.epam.audiorecord.entity.Format;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class MusicTrackValidator {
    Logger logger = LogManager.getLogger(MusicTrackValidator.class);
    private String REGEX_PATTERN = "\\w+.\\w+\\t\\d+(\\t[a-zA-Z0-9\\x20']+){2}\\t\\w+\\t\\d+";
    private List<String> availableFormats = Arrays.stream(Format.values()).map(Enum::toString).collect(Collectors.toList());

    public List<String> validateMusicTracks(List<String> musicTracks) {
        Pattern pattern = Pattern.compile(REGEX_PATTERN);
        return musicTracks.stream().filter(o -> pattern.matcher(o).find() && validateFormat(o)).collect(Collectors.toList());
    }

    private boolean validateFormat(String track) {
        String format = track.split("\\.")[1].split("\t")[0].toUpperCase();
        return availableFormats.contains(format);
    }
}
