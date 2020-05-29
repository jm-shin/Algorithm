import java.util.Scanner;

public class q2558 {
	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 0;
		Scanner sc = new Scanner(System.in);
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		System.out.println(num1*(num2%10));
		System.out.println(num1*((num2%100)/10));
		System.out.println(num1*(num2/100));
		System.out.println(num1*num2);
	}
}