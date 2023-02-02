import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        int testcases = data.nextInt();
        while (testcases != 0) {
            String sum = data.next();
            int a = Character.getNumericValue(sum.charAt(0));
            int b = Character.getNumericValue(sum.charAt(2));
            System.out.println(a+b);
            testcases--;
        }
        data.close();
    }
}

class Solution {}
