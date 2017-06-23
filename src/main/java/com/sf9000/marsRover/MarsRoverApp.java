package com.sf9000.marsRover;

import com.sf9000.marsRover.business.MarsMissionExecution;
import com.sf9000.marsRover.utils.DataInputReader;

import java.io.IOException;
import java.util.List;

/**
 * Created by sergio on 6/18/17.
 */
public class MarsRoverApp  {

    public static void main(String args []) throws IOException {

        List<String> inputs = DataInputReader.read(args[0]);

        MarsMissionExecution mmi = new MarsMissionExecution(inputs);

        System.out.println( mmi.executeMission() );

    }

}


