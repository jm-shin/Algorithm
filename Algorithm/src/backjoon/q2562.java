package backjoon;
import java.util.Scanner;

public class q2562 {
	public static void main(String[] args) {
		int place = 0;
		int max = 0;
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[9];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
				place = i + 1;
			}
		}
		System.out.println(max);
		System.out.println(place);
	}
}