class A {

    public void show() {
        System.out.println("In show");
    }

    static class B {
        public void config() {
            System.out.println("In config");
        }
    }
}

public class InnerC {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();

        A.B obj2 = new A.B();
        System.out.println(obj);
        System.out.println(obj2);
    }
}
