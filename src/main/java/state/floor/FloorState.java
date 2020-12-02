package state.floor;

import model.Elevator;

public interface FloorState {
    void press1(Elevator elevator);
    void press2(Elevator elevator);
    void press3(Elevator elevator);
}