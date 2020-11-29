package mediator;

import model.Door;
import model.Elevator;
import state.Press1;
import state.Press2;
import state.Press3;

public class Mediator {
    Door door;
    Elevator elevator;
    Press1 press1;
    Press2 press2;
    Press3 press3;

    public Mediator(){
        elevator = new Elevator(this);
        door = new Door(this);
        press1 = new Press1();
        press2 = new Press2();
        press3 = new Press3();
    }

    public void press1() {
        press1.press();
        door.setDoorOpen(false);
        elevator.setCurrentFloor(1);
    }

    public void press2() {
        press2.press();
        door.setDoorOpen(false);
        System.out.println("Moving to floor 2");
        elevator.setCurrentFloor(2);
    }

    public void press3() {
        press3.press();
        elevator.setCurrentFloor(3);
    }

}
