abstract class Car {
    public abstract void drive();

    public abstract void fly();

    public void playMusic() {
        System.out.println("Playing Music");
    }
}

class BMW extends Car {
    public void drive() {
        System.out.println("Driving");
    }

    public void fly() {
        System.out.println("Flying");
    }
}

public class Abstract {
    public static void main(String[] args) {
        Car c = new BMW();
        c.drive();
        c.fly();
        c.playMusic();
    }
}
