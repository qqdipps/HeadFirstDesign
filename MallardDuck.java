public class MallardDuck extends Duck {
    public MallardDuck() {
        flyBehavior = new FlyWithWings();
    }

    public void display() {
        System.out.println("Hello I am a duck");
    }
}