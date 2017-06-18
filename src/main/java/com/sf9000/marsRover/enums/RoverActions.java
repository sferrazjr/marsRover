package com.sf9000.marsRover.enums;

/**
 * Created by sergio on 6/18/17.
 */
public enum RoverActions {
    MOVE_FORWARD('M'),
    TURN_RIGHT('R'),
    TURN_LEFT('L');

    private char actionValue;

    RoverActions(char actionValue) {

        this.actionValue = actionValue;
    }

    public char getActionValue() {
        return actionValue;
    }

}
