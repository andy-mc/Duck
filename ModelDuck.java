public class ModelDuck extends Duck {
    public ModelDuck(FlyBehavior _flyBehavior, QuackBehavior _quackBehavior) {
        flyBehavior = _flyBehavior;
        quackBehavior = _quackBehavior;
    }
    
    public void display() {
        System.out.println("I'm a Model Duck look at me !!");
    }
}
