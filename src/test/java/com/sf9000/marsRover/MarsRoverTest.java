package com.sf9000.marsRover;


import com.sf9000.marsRover.enums.PointingDirections;
import com.sf9000.marsRover.model.Plateau;
import com.sf9000.marsRover.model.Position;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by sergio on 6/18/17.
 */
public class MarsRoverTest {

    Plateau plateau;

    private static Position POSITION_01_START = new Position(1, 2, PointingDirections.NORTH);
    private static Position POSITION_01_FINISH = new Position(1, 3, PointingDirections.NORTH);

    private static Position POSITION_02_START = new Position(3,3, PointingDirections.EAST);
    private static Position POSITION_02_FINISH = new Position(5,1, PointingDirections.EAST);

    private static String MOVE_SEQUENCE_01 = "LMLMLMLMM";
    private static String MOVE_SEQUENCE_02 = "MMRMMRMRRM";

    @Before
    public void setUpRover(){
        plateau = new Plateau(5,5);

        plateau.addRover(Rover.create(POSITION_01_START));

        plateau.addRover(Rover.create(POSITION_02_START));

    }


    @Test
    public void moves(){

        assertThat(plateau.getRovers().size(), is(2));

        plateau.getRovers().get(0).move(MOVE_SEQUENCE_01);

        assertThat(plateau.getRovers().get(0).getPosition(), is(POSITION_01_FINISH));


        plateau.getRovers().get(1).move(MOVE_SEQUENCE_02);

        assertThat(plateau.getRovers().get(1).getPosition(), is(POSITION_02_FINISH));

    }



}
