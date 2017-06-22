package com.sf9000.marsRover;

import com.sf9000.marsRover.business.Rover;
import com.sf9000.marsRover.enums.PointingDirections;
import com.sf9000.marsRover.model.Plateau;
import com.sf9000.marsRover.model.Position;

import java.util.List;

/**
 * Created by sergio on 6/23/17.
 */
public class MarsMissionExecution {

    private List<String> inputs;

    public MarsMissionExecution(List<String> inputs) {
        this.inputs = inputs;
    }

    public String executeMission() {
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
        return plateau.getPositionOfAllRovers();
    }

}
