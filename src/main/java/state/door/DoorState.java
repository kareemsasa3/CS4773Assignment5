package state.door;

import model.Elevator;

public interface DoorState {
    void switchDoorStates(Elevator elevator);
}
