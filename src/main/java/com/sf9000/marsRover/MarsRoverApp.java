package com.sf9000.marsRover;

import com.sf9000.marsRover.enums.PointingDirections;
import com.sf9000.marsRover.model.Plateau;
import com.sf9000.marsRover.model.Position;
import com.sf9000.marsRover.utils.DataInputReader;

import java.io.IOException;
import java.util.List;

/**
 * Created by sergio on 6/18/17.
 */
public class MarsRoverApp {

    public static void main(String args []) throws IOException {

        List<String> inputs = DataInputReader.read(args[0]);

        String[] plateauSize = inputs.get(0).split(" ");

        String[] startPosition = new String[3];

        Plateau plateau = new Plateau(Integer.valueOf(plateauSize[0]), Integer.valueOf(plateauSize[1]));

        for(int i=1; i<inputs.size(); i++){

            if(i%2!=0){
                startPosition = inputs.get(i).split(" ");
            } else {

                Position position = new Position(
                        Integer.valueOf(startPosition[0]), Integer.valueOf(startPosition[1]), PointingDirections.POINTING_DIRECTION_LETTER_MAP.get(startPosition[2].charAt(0)) );

                Rover rover = Rover.create(position);

                plateau.addRover(rover);

                rover.move(inputs.get(i));

            }
        }

        System.out.println( plateau.getPositionOfAllRovers() );

    }

}


