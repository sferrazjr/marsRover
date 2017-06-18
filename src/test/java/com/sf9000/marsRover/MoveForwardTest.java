package com.sf9000.marsRover;

import com.sf9000.marsRover.enums.PointingDirections;
import com.sf9000.marsRover.enums.RoverActions;
import com.sf9000.marsRover.model.Position;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by sergio on 6/18/17.
 */
public class MoveForwardTest {

    Rover rover;

    private Position positionNorth;
    private Position positionNorthAfterMove;

    private Position positionEast;
    private Position positionEastAfterMove;

    private Position positionSouth;
    private Position positionSouthAfterMove;

    private Position positionWest;
    private Position positionWestAfterMove;


    @Before
    public void setUpPositions(){

        positionNorth = new Position(3,3, PointingDirections.NORTH);
        positionNorthAfterMove = new Position(3,4, PointingDirections.NORTH);

        positionEast = new Position(3,3, PointingDirections.EAST);
        positionEastAfterMove = new Position(4,3, PointingDirections.EAST);

        positionSouth = new Position(3,3, PointingDirections.SOUTH);
        positionSouthAfterMove = new Position(3,2, PointingDirections.SOUTH);

        positionWest = new Position(3,3, PointingDirections.WEST);
        positionWestAfterMove = new Position(2,3, PointingDirections.WEST);

    }

    @Test
    public void moveToAllDirection(){

        rover = Rover.create(positionNorth);
        rover.move(String.valueOf(RoverActions.MOVE_FORWARD.getActionValue()));
        assertThat(rover.getPosition(), is(positionNorthAfterMove));

        rover = Rover.create(positionEast);
        rover.move(String.valueOf(RoverActions.MOVE_FORWARD.getActionValue()));
        assertThat(rover.getPosition(), is(positionEastAfterMove));

        rover = Rover.create(positionWest);
        rover.move(String.valueOf(RoverActions.MOVE_FORWARD.getActionValue()));
        assertThat(rover.getPosition(), is(positionWestAfterMove));

        rover = Rover.create(positionSouth);
        rover.move(String.valueOf(RoverActions.MOVE_FORWARD.getActionValue()));
        assertThat(rover.getPosition(), is(positionSouthAfterMove));

    }


}
