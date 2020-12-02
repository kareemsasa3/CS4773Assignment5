package mediator;

import model.Door;
import model.Elevator;

public class Mediator {
    Door door;
    Elevator elevator;


    public Mediator(){
        elevator = new Elevator();
        door = new Door(this);

    }

    public void press2(){

    }



}
