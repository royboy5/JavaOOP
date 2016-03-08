public class DuckSimulator {

    public static void main(String[] args) {
        MallardDuck md = new MallardDuck();

        md.display();
        md.performFly();
        md.performQuack();

        md.setFlyBehavior(new FlyNoWay());
        md.setQuackBehavior(new MuteQuack());

        md.performQuack();
        md.performFly();
        md.swim();


    }
}
