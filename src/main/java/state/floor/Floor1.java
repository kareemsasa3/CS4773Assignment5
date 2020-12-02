package state.floor;

import model.Elevator;

public class Floor1 implements FloorState {

    @Override
    public void press1(Elevator elevator) {
        System.out.println("Nothing happens");
    }

    @Override
    public void press2(Elevator elevator) {
        System.out.println("Going up...");
        elevator.getMediator().setFloorState(new Floor2());
        System.out.println("*ding* The elevator arrives at Floor 2");
    }

    @Override
    public void press3(Elevator elevator) {
        System.out.println("Going up...");
        elevator.getMediator().setFloorState(new Floor3());
        System.out.println("*ding* The elevator arrives at Floor 3");
    }

    public String toString() {
        return "Floor 1";
    }
}
