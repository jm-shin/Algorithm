import java.util.Scanner;

public class q2557{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int []digits = new int[10];
        String num = String.valueOf(a*b*c);
        for(int i = 0; i < num.length(); i++){
            digits[Integer.parseInt(num.charAt(i)+"")]++;
        }
        for(int d: digits){
            System.out.println(d);
        }
    }
}