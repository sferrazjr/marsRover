package com.sf9000.marsRover.model;

import com.sf9000.marsRover.enums.PointingDirections;

import java.util.Objects;

/**
 * Created by sergio on 6/18/17.
 */
public class Position {

    private int positionX;
    private int positionY;
    private PointingDirections direction;


    public Position(int positionX, int positionY, PointingDirections direction) {

        this.positionX = positionX;
        this.positionY = positionY;
        this.direction = direction;

    }

    @Override
    public String toString() {
        return "Position{" +
                "positionX=" + positionX +
                ", positionY=" + positionY +
                ", direction=" + direction +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Position position = (Position) o;
        return positionX == position.positionX &&
                positionY == position.positionY &&
                direction == position.direction;
    }

    @Override
    public int hashCode() {
        return Objects.hash(positionX, positionY, direction);
    }

    public PointingDirections getDirection() {
        return direction;
    }

    public void setDirection(PointingDirections direction) {
        this.direction = direction;
    }

    public void positionYAddOne() {
        positionY++;
    }

    public void positionXAddOne() {
        positionX++;
    }

    public void positionYRemoveOne() {
        positionY--;
    }

    public void positionXRemoveOne() {
        positionX--;
    }

    public int getPositionX() {
        return positionX;
    }

    public int getPositionY() {
        return positionY;
    }
}
