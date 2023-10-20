import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testcases = scanner.nextInt();
		while (testcases > 0) {
			int num1 = scanner.nextInt();
			int num2 = scanner.nextInt();
			int result = scanner.nextInt();
			if (num1 + num2 == result) System.out.println("+");
			else System.out.println("-");
			testcases--;
		}
		scanner.close();
	}
	
}
