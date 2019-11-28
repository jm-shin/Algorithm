package backjoon;
import java.util.Scanner;

public class q3052 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		int[] count = new int[42];
		int total = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			int temp = arr[i] % 42;
			count[temp]++;
		}
		for (int i = 0; i < count.length; i++) {
			if (count[i] != 0) {
				total++;
			}
		}
		System.out.println(total);
	}
}
