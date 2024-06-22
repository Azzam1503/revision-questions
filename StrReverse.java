public class StrReverse {
    public static void main(String[] args) {
        String str = "This is the way";
        // String reversed = "";
        StringBuilder sb = new StringBuilder(str);
        int n = str.length();
        int i = n - 1;
        int j = 0;
        System.out.println(str.length());
        while (j < n / 2) {
            char curr = sb.charAt(j);
            sb.setCharAt(j, sb.charAt(i));
            sb.setCharAt(i, curr);
            j++;
            i--;
        }
        System.out.println(sb);
    }
}
