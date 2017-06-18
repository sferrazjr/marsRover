package com.sf9000.marsRover.model;

import com.sf9000.marsRover.Rover;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by sergio on 6/18/17.
 */
public class Plateau {

    private List<Rover> rovers;
    private int gridLimitX;
    private int gridLimitY;

    public Plateau(int gridLimitX, int gridLimitY) {

        this.gridLimitX = gridLimitX;
        this.gridLimitY = gridLimitY;

        rovers = new ArrayList<>();
    }


    public void addRover(Rover rover) {
        rovers.add(rover);
    }

    public List<Rover> getRovers() {
        return rovers;
    }

    public String getPositionOfAllRovers() {

        return rovers.stream().map( rover -> rover.getPrintablePosition() ).collect(Collectors.joining(" ")).trim();

    }
}
