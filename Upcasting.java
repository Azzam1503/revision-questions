
class A {
    public void show1() {
        System.out.println("In A show");
    }
}

class B extends A {
    public void show1() {
        System.out.println("In B show1");
    }

    public void show2() {
        System.out.println("In B show2");
    }
}

public class Upcasting {
    public static void main(String[] args) {
        A obj = (A) new B();
        obj.show1();

        B ob1 = (B) obj;
        ob1.show2();
        System.out.println(obj);
        System.out.println(ob1);
    }
}
