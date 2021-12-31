public class DuckSimulator {
    public static void main(String[] args) {
        Duck mallar = new MallardDuck(new FlyWithWings(), new Quack());
        mallar.performFly();
        mallar.performQuack();
        
        System.out.println("\n ------------------- \n");

        Duck model_duck = new ModelDuck(new FlyNoWay(), new Quack());
        model_duck.performFly();
        model_duck.setFlyBehavior(new FlyWithJets());
        model_duck.performFly();

        System.out.println("\n ------------------- \n");

        DuckCaller duck_caller = new DuckCaller(new FlyNoWay(), new Quack());
        duck_caller.quack();
        duck_caller.setQuackBehavior(new Squick());
        duck_caller.quack();

    }
}