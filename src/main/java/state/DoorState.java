package state;

import model.Door;

public interface DoorState {

    public void openDoor(Door door);
    public void closeDoor(Door door);

}
