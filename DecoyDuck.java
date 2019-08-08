public class DecoyDuck extends Duck {
    public DecoyDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new QuackMute();
    }

    public void display() {
        System.out.println("I am a decoy duck");
    }
}