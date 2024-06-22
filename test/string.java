package test;

public class string {
    public static String func() {
        String s = "Azzam";
        return s;
    }

    public static void main(String[] args) {
        String s = "Azzam";
        String s2 = s + "Uddin";
        System.out.println(s.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s == s2);
        System.out.println("Azzam".hashCode());
        System.out.println("j");
    }
}
