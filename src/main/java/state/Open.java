package state;

import model.Door;

public class Open implements DoorState{


    @Override
    public void openDoor(Door door) { System.out.println("Door is already open"); }

    @Override
    public void closeDoor(Door door) { System.out.println("Door closed"); door.setDoorOpen(false);}
}
