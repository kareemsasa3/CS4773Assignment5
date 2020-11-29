import model.Elevator;
import mediator.Mediator;

public class Main {

    public static void main(String[] args) {
        Mediator mediator = new Mediator();
        mediator.press2();
        mediator.press1();
        mediator.press3();
        mediator.press1();
    }
}
