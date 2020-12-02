package state;

import model.Door;

public class Closed implements DoorState{


    @Override
    public void openDoor(Door door) {
        System.out.println("Door Opened");
        door.setDoorOpen(true);
    }

    @Override
    public void closeDoor(Door door) { System.out.println("Door is already closed"); }
}
