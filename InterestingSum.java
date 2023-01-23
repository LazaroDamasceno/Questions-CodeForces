import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        int testcase = data.nextInt();
        while (testcase > 0) {
            List<Integer> nums = new ArrayList<>();
            int size = data.nextInt();
            for (int i = 0; i < size; i++) {
                nums.add(data.nextInt());
            }
            int[] max = new int[2];
            max[0] = Collections.max(nums);
            nums.remove(Collections.max(nums));
            max[1] = Collections.max(nums);
            nums.remove(Collections.max(nums));
            int[] min = new int[2];
            min[0] = Collections.min(nums);
            nums.remove(Collections.min(nums));
            min[1] = Collections.min(nums);
            nums.remove(Collections.min(nums));
            int answer = (max[0] - min[0]) + (max[1] - min[1]);
            System.out.println(answer);
            nums.clear();
            testcase--;
        }
        data.close();
    }
}
