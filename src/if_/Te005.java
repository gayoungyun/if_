package if_;

import java.util.Scanner;

public class Te005 { //1조문제
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("계산기입니다");
		System.out.println("1.덧셈");
		System.out.println("2.뺄셈");
		System.out.println("3.곱셈");
		System.out.println("4.나눗셈");
		System.out.println("5.나머지");
		System.out.println("원하시는 기능의 숫자를 입력하세요");
		int num = sc.nextInt();
		int numA=0, numB=0, result=0;
		
		if(num ==1 ) {
			System.out.println("덧셈 진행할 두개 값을 입력");
			System.out.println("첫번째값");
			numA=sc.nextInt();
			System.out.println("두번째값");
			numB=sc.nextInt();
			result = numA+numB;
			System.out.println("결과갑 : "+result);
		}
		else if(num ==2 ) {
				System.out.println("뺄셈 진행할 두개 값을 입력");
				System.out.println("첫번째값");
				numA=sc.nextInt();
				System.out.println("두번째값");
				numB=sc.nextInt();
				result = numA-numB;
				System.out.println("결과갑 : "+result);
		}
		else if(num ==3 ) {
			System.out.println("곱셈 진행할 두개 값을 입력");
			System.out.println("첫번째값");
			numA=sc.nextInt();
			System.out.println("두번째값");
			numB=sc.nextInt();
			result = numA*numB;
			System.out.println("결과갑 : "+result);
		}
		else if(num ==4 ) {
			System.out.println("몫을 구하는 두개 값을 입력");
			System.out.println("첫번째값");
			numA=sc.nextInt();
			System.out.println("두번째값");
			numB=sc.nextInt();
			result = numA/numB;
			System.out.println("결과갑 : "+result);
		}
		else if (num ==5 ) {
			System.out.println("나머지 구하는 두개 값을 입력");
			System.out.println("첫번째값");
			numA=sc.nextInt();
			System.out.println("두번째값");
			numB=sc.nextInt();
			result = numA%numB;
			System.out.println("결과갑 : "+result);
		}
		else {
			System.out.println("해당 기능 없습니다");
		}
		
		
		
	}

}
