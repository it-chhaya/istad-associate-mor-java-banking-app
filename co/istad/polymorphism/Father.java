package practice.co.istad.polymorphism;

public abstract class Father implements Runnable {

    public void sing() {
        System.out.println("Father sings");
    }

    public abstract void study();

}
