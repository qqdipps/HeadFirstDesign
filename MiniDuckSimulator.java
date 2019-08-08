public class MiniDuckSimulator {
    public static void main(String args[]) {
        Duck mal = new MallardDuck();
        mal.display();
        mal.performFly();
        mal.performQuack();

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