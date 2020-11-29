package model;

import mediator.Mediator;


public class Elevator {
    private int currentFloor;
    private Mediator mediator;

    public Elevator(Mediator mediator) {
        this.mediator = mediator;
        this.setCurrentFloor(1);
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void setCurrentFloor(int currentFloor) {
        this.checkCurrentFloor(currentFloor);
        this.currentFloor = currentFloor;
    }

    public void checkCurrentFloor(int currentFloor) {
        if (this.getCurrentFloor() == currentFloor)
            System.out.println("Nothing happens");
    }






}
