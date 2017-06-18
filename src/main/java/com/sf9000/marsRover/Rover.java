package com.sf9000.marsRover;

import com.sf9000.marsRover.enums.PointingDirections;
import com.sf9000.marsRover.model.Position;

/**
 * Created by sergio on 6/18/17.
 */
public class Rover {
    private Position position;

    private Rover() {
    }

    public static Rover create(Position startPosition) {
        Rover rover = new Rover();
        rover.position = startPosition;
        return rover;
    }

    public void move(String sequence) {


        sequence.chars().mapToObj( c -> (char) c ).forEach(moveAction -> {

            moveOneAction(moveAction);

        });

    }

    private void moveOneAction(char moveAction) {

        if(moveAction=='M'){
            moveForward();
        }
        if(moveAction=='R'){
            turnRight();
        }
        if(moveAction=='L'){
            turnLeft();
        }

    }

    private void turnRight() {

        if(position.getDirection().getDirectionNumber()==3){
            position.setDirection( PointingDirections.NORTH );
        } else {
            position.setDirection( PointingDirections.POINTING_DIRECTION_NUMBER_MAP.get(position.getDirection().getDirectionNumber()+1) );
        }

    }

    private void turnLeft() {

        if(position.getDirection().getDirectionNumber()==0){
            position.setDirection( PointingDirections.WEST );
        } else {
            position.setDirection( PointingDirections.POINTING_DIRECTION_NUMBER_MAP.get(position.getDirection().getDirectionNumber()-1) );
        }

    }

    private void moveForward() {

        if(position.getDirection().equals(PointingDirections.NORTH)){
            position.positionYAddOne();
        }
        if(position.getDirection().equals(PointingDirections.EAST)){
            position.positionXAddOne();
        }
        if(position.getDirection().equals(PointingDirections.SOUTH)){
            position.positionYRemoveOne();
        }
        if(position.getDirection().equals(PointingDirections.WEST)){
            position.positionXRemoveOne();
        }

    }

    public Position getPosition() {
        return position;
    }

    public String getPrintablePosition() {
        return position.getPositionX() + " " + position.getPositionY() + " " + position.getDirection().getDirectionLetter();
    }
}
