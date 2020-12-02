package model;

import mediator.Mediator;

public class Elevator {
    private Mediator mediator;

    public Elevator() {
        this.setMediator(new Mediator(this));
    }

    @Override
    public String toString() {
        return "Elevator";
    }

    public void press1() {
        mediator.press1();
    }

    public void press2() {
        mediator.press2();
    }

    public void press3() {
        mediator.press3();
    }

    // accessors

    public Mediator getMediator() {
        return mediator;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }
}
