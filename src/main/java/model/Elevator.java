package model;

import mediator.Mediator;
import state.Floor1;
import state.Floor2;
import state.Floor3;


public class Elevator {
    private int currentFloor;
    private Mediator mediator;


    public Elevator() {
        this.mediator = new Mediator();
        this.setCurrentFloor(1);
        press1 = new Floor1();
        press2 = new Floor2();
        press3 = new Floor3();
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


    public void press1() {
        press1.press();
        //door.setDoorOpen(false);
       // elevator.setCurrentFloor(1);
    }

    public void press2() {
        mediator.press2();

        /*
        door.setDoorOpen(false);
        System.out.println("Moving to floor 2");
        elevator.setCurrentFloor(2);
         */
    }

    public void press3() {
        press3.press();
        /*
        elevator.setCurrentFloor(3);
         */
    }





}
