package state.floor;

import model.Elevator;

public class Floor3 implements FloorState {

    @Override
    public void press1(Elevator elevator) {
        System.out.println("Going down...");
        elevator.getMediator().setFloorState(new Floor1());
        System.out.println("*ding* The elevator arrives at Floor 1");
    }

    @Override
    public void press2(Elevator elevator) {
        System.out.println("Going down...");
        elevator.getMediator().setFloorState(new Floor2());
        System.out.println("*ding* The elevator arrives at Floor 2");
    }

    @Override
    public void press3(Elevator elevator) {
        System.out.println("Nothing happens");
    }

    public String toString() {
        return "Floor 3";
    }
}
