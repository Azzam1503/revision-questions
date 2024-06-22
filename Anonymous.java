
abstract class A {
    public abstract void show();

    public void config() {
        System.out.println("Config");
    }
}

public class Anonymous {
    public static void main(String[] args) {
        A o = new A() {
            public void show() {
                System.out.println("In a inner class");
            }
        };
        System.out.println(o);
        o.show();
        o.config();
    }
}
