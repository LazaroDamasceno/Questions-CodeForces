import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testcases = scanner.nextInt();
		while (testcases > 0) {
			int x = scanner.nextInt();
			int y = scanner.nextInt();
			int maxNumber = scanner.nextInt();
			int multiplier = (maxNumber - y) / x;
			System.out.printf("%d\n", (x * multiplier) + y);
			testcases--;
		}
		scanner.close();
	}
	
}
