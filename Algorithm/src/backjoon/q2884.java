import java.util.Scanner;

public class q2884 {
	public static void main(String[] args) {
		int H,M;
		Scanner sc = new Scanner(System.in);
		H = sc.nextInt();
		M = sc.nextInt();
		
		M-=45;
		if(M<0) {
			M+=60;
			H--;
		}
		if(H<0)
			H += 24;
		System.out.print(H+" ");
		System.out.print(M);
	}
}
