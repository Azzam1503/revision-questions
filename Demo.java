interface I {
    void show();
}

class P implements I {
    public void show() {
        System.out.println("Showww");
    }
}

public class Demo {
    public static void main(String[] args) {
        I obj = new P();
        obj.show();
    }
}
