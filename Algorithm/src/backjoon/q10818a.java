package backjoon;
import java.util.Scanner;

public class q10818a {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int[] num = new int[n];
		for(int i =0;i<n;i++) {
			num[i] = sc.nextInt();
		}
		int max = num[0];
		int min = num[0];
			for(int i:num) {
				if(i>max) {
					max = i;
				}
				if(i<min) {
					min =i;
				}
			}
		System.out.print(min+" "+max);
	}
}
