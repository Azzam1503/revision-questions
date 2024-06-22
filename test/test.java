package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class test {
    static long digitSum(long n) {
        long sum = 0;
        while (true) {
            while (n != 0) {
                long last = n % 10;
                sum = sum + last;
                n = n / 10;
            }
            if (sum < 10) {
                break;
            }

            n = sum;
            sum = 0;
        }
        return sum;
    }

    public static List<Long> waysToChooseSum(long lowLimit, long highLimit) {
        List<Long> list = new ArrayList<>();

        if (highLimit < 10) {
            list.add(highLimit);
            list.add(1l);
            return list;
        }
        HashMap<Long, Integer> map = new HashMap<>();

        for (long i = lowLimit; i <= highLimit; i++) {
            long currentDigitSum = digitSum(i);
            map.put(currentDigitSum, map.getOrDefault(currentDigitSum, 0) + 1);

        }

        long max = (long) Integer.MIN_VALUE;
        long maximum = 0l;
        for (Map.Entry<Long, Integer> entry : map.entrySet()) {
            System.out.println("key: " + entry.getKey() + " Value: " + entry.getValue());
            if (entry.getValue() > max) {
                max = entry.getValue();
                maximum = entry.getKey();
            }
        }
        System.out.println("maxKey --" + maximum);
        System.out.println("maxVal --" + max);
        list.add(maximum);
        list.add(max);
        return list;
    }

    public static void main(String[] args) {
        // long a = 48444, b = 55924;

        // List<Long> list = waysToChooseSum(a, b);
        // System.out.println("-----------------------");
        // for (int i = 0; i < list.size(); i++) {
        // System.out.println(list.get(i));
        // }
        System.out.println(digitSum(44484l));
    }
}