package if_;

import java.util.Scanner;

public class Ex09 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요 >>");
		int score = input.nextInt();
		System.out.println("학년을 입력하세요 >>");
		int grade = input.nextInt();
		
		if(score >= 60) {
			if(grade != 4)
				System.out.println("합격!!");
			else if(score >= 70)
				System.out.println("합격!!");
			else
				System.out.println("불합격!!");
		}else {
			System.out.println("불합격!!");
		}
	}

}
