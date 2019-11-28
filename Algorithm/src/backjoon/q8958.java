package backjoon;
import java.util.Scanner;

public class q8958 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] score = new int[n];
		sc.nextLine();
		for (int i = 0; i < n; i++) {
			String tmp = sc.nextLine();
			int count = 0;
			for (int j = 0; j < tmp.length(); j++) {
				if (tmp.charAt(j) == 'O') {
					count++;
					score[i] += count;
				} else {
					count = 0;
				}
			}
		}
		for (int i = 0; i < n; i++) {
			System.out.println(score[i]);
		}
	}
}
