package backjoon;
import java.io.IOException;
import java.util.Scanner;

public class q2577 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();
		int result = a * b * c;
		int[] numbers = new int[10];
		while (result != 0) {
			int temp = result % 10;
			numbers[temp]++;
			result /= 10;
		}
		for (int i : numbers) {
			System.out.println(i);
		}
	}
}
