package if_;

import java.util.Scanner;

public class Ex08 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num;
		System.out.println("수 입력");
		num = input.nextInt();
		if(num>100) {
			System.out.println("100보다 큰 수");
		}else if(num>50) { //else를 지울시 문장이 다 나온다
			System.out.println("50보다 큰 수");
		}else if(num>0) {
			System.out.println("0보다 큰 수");
		}else {
			System.out.println("그 외의 값");
		}
		System.out.println("다음 문장들 실행");
		
		//입력값이 짝수고, 50보다 크다면
		if(num%2 == 0) {
			System.out.println("짝수");
		}
		else if(num>50)
			System.out.println("50보다크다");
		
		System.out.println("--------------------");
		System.out.println("수 입력");
		num = input.nextInt();
		if(num == 0) {
			System.out.println("0은 잘못입력");
		}else if(num % 3 == 0 && num % 4 == 0 ) { // num%12 ==0
			System.out.println("3의 배수 4의 배수 해당");
		}else if(num % 3 == 0) {
			System.out.println("3의 배수에만 해당");
		}else if(num % 4 == 0) {
			System.out.println("4의 배수에만 해당");
		}else {
			System.out.println("3의 배수 4의 배수 해당안됩니다");
		}
	}

}
