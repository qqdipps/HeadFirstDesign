public class MiniDuckSimulator {
    public static void main(String args[]) {
        Duck mal = new MallardDuck();
        mal.display();
        mal.performFly();

        Duck rub = new RubberDuck();
        rub.display();
        rub.performFly();

        Duck dec = new DecoyDuck();
        dec.display();
        dec.performFly();
    }
}