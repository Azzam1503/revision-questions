
interface N {
    int show(int i, int j);
}

public class lmbda {
    public static void main(String[] args) {
        N o = (i, j) -> i * j;

        int ans = o.show(5, 5);
        System.out.println(ans);
    }
}
