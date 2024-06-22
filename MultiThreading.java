class G extends Thread {
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println("Hy");
            try {

                Thread.sleep(10);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

class H extends Thread {
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println("Hello");
            try {

                Thread.sleep(10);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

public class MultiThreading {
    public static void main(String[] args) {
        G obj1 = new G();
        H obj2 = new H();

        obj1.start();
        obj2.start();
    }
}
