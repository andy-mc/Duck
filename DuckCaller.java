public class DuckCaller implements FlyBehavior, QuackBehavior {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public DuckCaller(FlyBehavior _flyBehavior, QuackBehavior _quackBehavior) {
        flyBehavior = _flyBehavior;
        quackBehavior = _quackBehavior;
    }
    
    public void fly() {
        flyBehavior.fly();
    }

    public void quack() {
        quackBehavior.quack();
    }

    public void setFlyBehavior(FlyBehavior _flyBehavior) {
        flyBehavior = _flyBehavior;
    }
    
    public void setQuackBehavior(QuackBehavior _quackBehavior) {
        quackBehavior = _quackBehavior;
    }
}
