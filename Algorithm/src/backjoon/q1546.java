package backjoon;
import java.util.Scanner;

public class q1546 {
	public static void main(String[] args) {
		double max = 0;
		double sum = 0;
		Scanner sc = new Scanner(System.in);
		int subject = sc.nextInt();
		double[] score = new double[subject];

		for (int i = 0; i < subject; i++) {
			score[i] = sc.nextInt();
			if (score[i] > max) {
				max = score[i];
			}
		}
		for (int i = 0; i < score.length; i++) {
			sum += score[i] / max * 100;
		}
		System.out.printf("%.2f",sum/subject);
	}
}
