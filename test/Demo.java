package test;

class Calculator {
    public int add(int one, int two) {
        return one + two;
    }

    public int subtract(int one, int two) {
        return one - two;
    }
}

public class Demo {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        int r1 = c1.add(4, 7);
        int r2 = c1.subtract(9, 3);
        System.out.println(r1);
        System.out.println(r2);
    }
}
