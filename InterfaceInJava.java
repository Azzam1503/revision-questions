
interface D {
    void show();
}

class C implements D {
    public void show() {
        System.out.println("Show");
    }

    public void config() {
        System.out.println("In the config");
    }
}

public class InterfaceInJava {
    public static void main(String[] args) {
        D o = new C();

        o.show();

        C o2 = (C) o;
        o2.config();
        System.out.println(o);
        System.out.println(o2);
    }
}
