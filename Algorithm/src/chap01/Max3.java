package chap01;
import java.util.Scanner;

class Max3{
    public static void main(String[] args) {
        Scanner stdId = new Scanner(System.in);

        System.out.println("세 정수의 최대값을 구합니다.");
        System.out.println("a의 값 : "); int a = stdId.nextInt();
        System.out.println("b의 값 : "); int b = stdId.nextInt();
        System.out.println("c의 값 : "); int c = stdId.nextInt();
        int max = a;
        if(b > max){max = b;}
        if(c > max){max = c;}

        System.out.println("최댓값은 "+max+" 입니다.");
    }
}