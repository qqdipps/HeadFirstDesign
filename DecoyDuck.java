public class DecoyDuck extends Duck {
    public DecoyDuck() {
        setFlyBehavior(new FlyNoWay());
        setQuackBehavior(new QuackMute());
    }

    public void display() {
        System.out.println("I am a decoy duck");
    }
}