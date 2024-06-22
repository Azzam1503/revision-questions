class AzzamException extends Exception {
    // public AzzamException(String str) {

    // }
    public AzzamException(String message) {
        super(message);
    }

}

public class Excption {
    public static void main(String[] args) {
        int i = 0;
        int j = 9;
        try {
            if (i == 0) {
                throw new AzzamException("I am not gonna do that");
            }
            j = j / i;
        } catch (AzzamException e) {
            System.out.println("somethig went wrong " + e);
        }
        System.out.println("going good");
    }
}
