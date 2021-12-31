public class MallardDuck extends Duck {
    public MallardDuck(FlyBehavior _flyBehavior, QuackBehavior _quackBehavior) {
        flyBehavior = _flyBehavior;
        quackBehavior = _quackBehavior;
    }
    
    public void display() {
        System.out.println("I'm a real Mallard duck !!");
    }
}
