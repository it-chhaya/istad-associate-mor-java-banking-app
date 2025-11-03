package practice.co.istad.polymorphism;

public class Son extends Father {

    @Override
    public void sing() {
        System.out.println("Son sings");
    }

    @Override
    public void study() {
        System.out.println("Son studies not good");
    }

    @Override
    public void run() {
        System.out.println("Son is running");
    }
}
