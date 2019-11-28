package backjoon;
import java.util.Scanner;

public class q4344 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int line = sc.nextInt();
		
		for(int i=0;i<line;i++) {
			int sum=0;
			int over=0;
			double result = 0;
			int studentNum = sc.nextInt();
			int[] score = new int[studentNum];
			for(int j=0;j<studentNum;j++) {
				score[j] = sc.nextInt();
				sum += score[j];
			}
			for(int j=0;j<studentNum;j++) {
				if(score[j]>(double)sum/studentNum) {
					over++;
				}
			}
			result = (double)over/studentNum*100;
			System.out.printf("%.3f",result);
			System.out.println("%");
		}
		sc.close();
	}
}
