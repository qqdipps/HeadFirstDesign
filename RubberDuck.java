public class RubberDuck extends Duck {
    public RubberDuck() {
        flyBehavior = new FlyNoWay();
    }

    public void display() {
        System.out.println("I am a rubber duck");
    }
}