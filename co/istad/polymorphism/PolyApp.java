package practice.co.istad.polymorphism;

public class PolyApp {
    public static void main(String[] args) {
        Father obj = new Son();
        obj.study();
        obj.run();

        obj = new Daughter();
        obj.study();
        obj.run();
    }
}
