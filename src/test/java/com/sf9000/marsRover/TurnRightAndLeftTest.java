package com.sf9000.marsRover;

import com.sf9000.marsRover.business.Rover;
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
public class TurnRightAndLeftTest {

    private Rover rover;

    private Position positionNorth;
    private Position positionEast;
    private Position positionSouth;
    private Position positionWest;

    @Before
    public void setUpPositions(){
        positionNorth = new Position(0,0, PointingDirections.NORTH);
        positionEast = new Position(0,0, PointingDirections.EAST);
        positionSouth = new Position(0,0, PointingDirections.SOUTH);
        positionWest = new Position(0,0, PointingDirections.WEST);

        rover = Rover.create(positionNorth);
    }

    @Test
    public void turnRightTest(){

        rover.move(String.valueOf(RoverActions.TURN_RIGHT.getActionValue()));
        assertThat(rover.getPosition(), is(positionEast));

        rover.move(String.valueOf(RoverActions.TURN_RIGHT.getActionValue()));
        assertThat(rover.getPosition(), is(positionSouth));

        rover.move(String.valueOf(RoverActions.TURN_RIGHT.getActionValue()));
        assertThat(rover.getPosition(), is(positionWest));

        rover.move(String.valueOf(RoverActions.TURN_RIGHT.getActionValue()));
        assertThat(rover.getPosition(), is(positionNorth));

    }

    @Test
    public void turnLeftTest(){

        rover.move(String.valueOf(RoverActions.TURN_LEFT.getActionValue()));
        assertThat(rover.getPosition(), is(positionWest));

        rover.move(String.valueOf(RoverActions.TURN_LEFT.getActionValue()));
        assertThat(rover.getPosition(), is(positionSouth));

        rover.move(String.valueOf(RoverActions.TURN_LEFT.getActionValue()));
        assertThat(rover.getPosition(), is(positionEast));

        rover.move(String.valueOf(RoverActions.TURN_LEFT.getActionValue()));
        assertThat(rover.getPosition(), is(positionNorth));

    }

}
