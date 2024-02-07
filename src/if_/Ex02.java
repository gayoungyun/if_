package if_;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num;
		System.out.println("수 입력");
		num = input.nextInt();
		if(num>10) { //거짓이면 종속문장만 실행x , 참이면 종속문장 포함 모두실행(첫번째 문장만 종속문장)
			System.out.println("1.종속문장실행");
		System.out.println("2.종속문장실행");
		System.out.println("3.종속문장실행");
		} //중괄호 묶으면 거짓일때는 중괄호 아래만 나온다
		System.out.println("다음 문장들 실행!!");
		
	}

}
