package model;

import mediator.Mediator;

public class Door {

    private boolean doorOpen;
    private Mediator mediator;

    public Door(Mediator mediator){
        this.mediator = mediator;
        this.setDoorOpen(true);
    }

    public void setDoorOpen(boolean doorOpen) {
        this.checkDoorOpen(doorOpen);
        this.doorOpen = doorOpen;
    }

    public boolean isDoorOpen() {
        return doorOpen;
    }

    public void checkDoorOpen(boolean doorOpen) {
        if (this.isDoorOpen() == true)
            System.out.println("Doors are open");
        else
            System.out.println("Doors are closed");
    }

}
