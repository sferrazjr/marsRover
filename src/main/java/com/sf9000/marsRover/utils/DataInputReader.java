package com.sf9000.marsRover.utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import static java.util.stream.Collectors.toList;

/**
 * Created by sergio on 6/18/17.
 */
public class DataInputReader {

    public static List<String> read(String fileName) throws IOException {

        return Files.lines(Paths.get(fileName)).collect(toList());


    }

}
