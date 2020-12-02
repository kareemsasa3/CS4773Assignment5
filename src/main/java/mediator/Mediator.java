package mediator;

import model.Elevator;
import state.door.DoorOpen;
import state.door.DoorState;
import state.floor.Floor1;
import state.floor.FloorState;

public class Mediator {
    private Elevator elevator;
    private FloorState floorState;
    private DoorState doorState;

    public Mediator(Elevator elevator) {
        this.setElevator(elevator);
        this.setFloorState(new Floor1());
        this.setDoorState(new DoorOpen());
    }

    public void press1() {
        System.out.println("1 pressed");
        if (this.getFloorState().toString().equals("Floor 1")) {
            doorState.switchDoorStates(this.getElevator());
            floorState.press1(this.getElevator());
        } else {
            if (this.getDoorState().toString().equals("Door open"))
                doorState.switchDoorStates(this.getElevator());
            floorState.press1(this.getElevator());
            doorState.switchDoorStates(this.getElevator());
        }
    }

    public void press2() {
        System.out.println("2 pressed");
        if (this.getFloorState().toString().equals("Floor 2")) {
            doorState.switchDoorStates(this.getElevator());
            floorState.press2(this.getElevator());
        } else {
            if (this.getDoorState().toString().equals("Door open"))
                doorState.switchDoorStates(this.getElevator());
            floorState.press2(this.getElevator());
            doorState.switchDoorStates(this.getElevator());
        }
    }

    public void press3() {
        System.out.println("3 pressed");
        if (this.getFloorState().toString().equals("Floor 3")) {
            doorState.switchDoorStates(this.getElevator());
            floorState.press3(this.getElevator());
        } else {
            if (this.getDoorState().toString().equals("Door open"))
                doorState.switchDoorStates(this.getElevator());
            floorState.press3(this.getElevator());
            doorState.switchDoorStates(this.getElevator());
        }
    }

    public Elevator getElevator() {
        return elevator;
    }

    public void setElevator(Elevator elevator) {
        this.elevator = elevator;
    }

    public FloorState getFloorState() {
        return floorState;
    }

    public void setFloorState(FloorState floorState) {
        this.floorState = floorState;
    }

    public DoorState getDoorState() {
        return doorState;
    }

    public void setDoorState(DoorState doorState) {
        this.doorState = doorState;
    }
}
