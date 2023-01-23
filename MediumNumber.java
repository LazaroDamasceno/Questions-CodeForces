import java.util.*;
import java.util.stream.*;

public class Main {

    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        int testcase = data.nextInt();
        while (testcase > 0) {
            int[] numbers = new int[3];
            numbers[0] = data.nextInt();
            numbers[1] = data.nextInt();
            numbers[2] = data.nextInt();
            Arrays.sort(numbers);
            System.out.println(numbers[1]);
            testcase--;
        }
        data.close();
    }

}
