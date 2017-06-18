package com.sf9000.marsRover.enums;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by sergio on 6/18/17.
 */
public enum PointingDirections {
    NORTH('N',0),
    EAST('E',1),
    SOUTH('S',2),
    WEST('W',3);

    private final char directionLetter;
    private final int directionNumber;

    PointingDirections(char directionLetter, int directionNumber) {
        this.directionLetter = directionLetter;
        this.directionNumber = directionNumber;
    }

    public static final Map<Integer, PointingDirections> POINTING_DIRECTION_NUMBER_MAP = new HashMap<>();

    public static final Map<Character, PointingDirections> POINTING_DIRECTION_LETTER_MAP = new HashMap<>();

    static {
        for (PointingDirections pointingDirections : PointingDirections.values()) {
            POINTING_DIRECTION_NUMBER_MAP.put(pointingDirections.directionNumber, pointingDirections);
        }
    }

    static {
        for (PointingDirections pointingDirections : PointingDirections.values()) {
            POINTING_DIRECTION_LETTER_MAP.put(pointingDirections.directionLetter, pointingDirections);
        }
    }


    public char getDirectionLetter() {
        return directionLetter;
    }

    public int getDirectionNumber() {
        return directionNumber;
    }


}
