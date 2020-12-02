package state.door;

import model.Elevator;

public class DoorClosed implements DoorState {

    @Override
    public void switchDoorStates(Elevator elevator) {
        elevator.getMediator().setDoorState(new DoorOpen());
        System.out.println("Doors are open");
    }

    public String toString() {
        return "Door closed";
    }
}
