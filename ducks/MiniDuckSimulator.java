public class MiniDuckSimulator {
    public static void main(String args[]) {
        Duck mal = new MallardDuck();
        mal.display();
        mal.performFly();
        mal.performQuack();
        // Can change ducks behavior at runtime by calling the duck's setter method for
        // that behavior
        mal.setFlyBehavior(new FlyNoWay());
        mal.performFly();

        Duck rub = new RubberDuck();
        rub.display();
        rub.performFly();
        rub.performQuack();

        Duck dec = new DecoyDuck();
        dec.display();
        dec.performFly();
        dec.performQuack();
    }
}