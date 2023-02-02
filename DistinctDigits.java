import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        int begin = data.nextInt();
        int end = data.nextInt();
        System.out.println(Solution.distinctDigits(begin, end));
        data.close();
    }
}

class Solution {
    public static int distinctDigits(int begin, int end) {
        int answer = 0;
        Integer[] range = Arrays.stream(IntStream.rangeClosed(begin, end).toArray()).boxed().toArray(Integer[]::new);
        for (int i = 0; i < range.length; i++) {
            List<Integer> list1 = Arrays.stream(range[i].toString().split("")).map(e -> Integer.parseInt(e)).toList();
            List<Integer> list2 = list1.stream().distinct().toList();
            if (list1.equals(list2)) {
                return range[i];
            }
        }
        return -1;
    }
}
