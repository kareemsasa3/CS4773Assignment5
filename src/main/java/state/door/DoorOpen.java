package state.door;

import model.Elevator;

public class DoorOpen implements DoorState {

    @Override
    public void switchDoorStates(Elevator elevator) {
        elevator.getMediator().setDoorState(new DoorClosed());
        System.out.println("Doors are closed");
    }

    public String toString() {
        return "Door open";
    }
}
