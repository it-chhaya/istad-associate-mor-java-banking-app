package practice.co.istad.polymorphism;

public class Daughter extends Father {

    @Override
    public void sing() {
        System.out.println("Daughter sing");
    }

    @Override
    public void study() {
        System.out.println("Daughter studies smart");
    }

    @Override
    public void run() {
        System.out.println("Daughter is running");
    }
}
