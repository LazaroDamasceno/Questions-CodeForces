import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        int testcases = data.nextInt();
        while (testcases != 0) {
            int[] numbers = new int[3];
            numbers[0] = data.nextInt();
            numbers[1] = data.nextInt();
            numbers[2] = data.nextInt();
            if (numbers[0] + numbers[1] == numbers[2]) {
                System.out.println("yes");
            } else if (numbers[0] + numbers[2] == numbers[1]) {
                System.out.println("yes");
            } else if (numbers[1] + numbers[2] == numbers[0]) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
            testcases--;
        }
        data.close();
    }
}

class Solution {}
