package test;

// class Mobile {
//     String brand;
//     int price;
//     static String name;

//     public void show() {
//         System.out.println(brand + " : " + price + " : " + name);
//     }

//     public static void show1() {
//         System.out.println(name);
//     }
// }

class A {

    public A() {
        System.out.println("In constructor");
    }

    public void show() {
        System.out.println("In A show");
    }
}

public class staticConcept {
    public static void main(String[] args) {
        // Mobile obj1 = new Mobile();
        // obj1.brand = "Apple";
        // obj1.price = 2000;
        // Mobile.name = "Smart Phone";

        // Mobile obj2 = new Mobile();
        // obj2.brand = "Samsung";
        // obj2.price = 2500;
        // Mobile.name = "Smart Phone";

        // Mobile.name = "phone";
        // obj1.show();
        // obj2.show();

        // Mobile.show1();
        System.out.println("hey");
        A obj;
        obj = new A();
        System.out.println(obj);
    }
}
