package practice.co.istad.polymorphism;

public class PolyApp {
    public static void main(String[] args) {
        Father obj = new Daughter();
        obj.sing();

        obj = new Son();
        obj.sing();
    }
}
