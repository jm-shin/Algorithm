package backjoon;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q10818b {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int n = Integer.parseInt(str);
		str = br.readLine();
		StringTokenizer stk = new StringTokenizer(str);
		
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		while(stk.hasMoreTokens()) {
			int temp = Integer.parseInt(stk.nextToken());
			
			if(temp>max) {
				max = temp;
			}
			if(temp<min) {
				min = temp;
			}
		}
		System.out.println(min+" "+max);
		
	}
	
	
	
}
