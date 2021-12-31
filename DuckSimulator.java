public class DuckSimulator {
    public static void main(String[] args) {
        Duck mallar = new MallardDuck();
        mallar.performFly();
        mallar.performQuack();
        mallar.swim();
        mallar.display();
    }
}