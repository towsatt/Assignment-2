package it.unipd.mtss;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Hello world!
 *
 */
public class IntegerToRoman {
    private static int listIndexOf(int[] data, int target) {
        List<Integer> list = Arrays.stream(data).boxed().collect(Collectors.toList());
        return list.indexOf(target);
    }

    public static String convert(int num) {
        if (num <= 0 || num > 1000) {
            throw new IllegalArgumentException("Invalid number: " + num);
        }

        String s = "";
        int[] numbs = { 1000, 500, 100, 50, 10, 5, 1 };
        char[] chars = { 'M', 'D', 'C', 'L', 'X', 'V', 'I' };
        for (int i = 0; i < 7; i++) {
            int k = numbs[i];
            char c = chars[i];
            if (num == 0){ break; }
            if (num >= k){
                for(int j = 0; j < num/k; j++){
                    s += c;
                }
                num %= k;
            }
            int r = (int) Math.pow(10, Math.ceil(Math.log10(k)) - 1);
            if (k <= num + r){
                s += chars[listIndexOf(numbs, r)];
                s += c;
                num -= k - r;
            }
        }
        return s;
    }
}
