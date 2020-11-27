package model;

public class Elevator {
    private int currentFloor;
    private boolean doorOpen;

    public Elevator() {
        this.setCurrentFloor(1);
        this.setDoorOpen(true);
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

    public boolean isDoorOpen() {
        return doorOpen;
    }

    public void setDoorOpen(boolean doorOpen) {
        this.checkDoorOpen(doorOpen);
        this.doorOpen = doorOpen;
    }

    public void checkDoorOpen(boolean doorOpen) {
        if (this.isDoorOpen() == true)
            System.out.println("Doors are open");
        else
            System.out.println("Doors are closed");
    }

    public void press1() {
        System.out.println("1 pressed");
        this.setDoorOpen(false);
        this.setCurrentFloor(1);
    }

    public void press2() {
        System.out.println("2 pressed");
        this.setDoorOpen(false);
        System.out.println("Moving to floor 2");
        this.setCurrentFloor(2);
    }

    public void press3() {
        System.out.println("3 pressed");
        this.setCurrentFloor(3);
    }
}
