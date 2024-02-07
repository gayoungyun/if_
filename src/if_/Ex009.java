package if_;

import java.util.Scanner;

public class Ex009 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int g1=0, g2=0, g3=0, g4=0, g5=0;
		int sum = 0;
		System.out.println("점수입력");
		g1 = input.nextInt();
		g2 = input.nextInt();
		g3 = input.nextInt();
		g4 = input.nextInt();
		g5 = input.nextInt();
		sum = g1 + g2 +g3 + g4 + g5;
		
		if(g1<60 || g2<60 || g3<60 || g4<60 || g5<60 || sum<400) {
			System.out.println("불합격입니다"); 
		}else {
			System.out.println("합격입니다");
		}
	}
}
