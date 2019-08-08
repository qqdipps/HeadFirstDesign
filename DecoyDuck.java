public class DecoyDuck extends Duck {
    public DecoyDuck() {
        flyBehavior = new FlyNoWay();
    }

    public void display() {
        System.out.println("I am a decoy duck");
    }
}