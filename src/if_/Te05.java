package if_;

import java.util.Scanner;

<<<<<<< HEAD
public class Te05 { //1조문제 //나중에 다시하기
=======
public class Te05 { //1조문제
>>>>>>> f59a7982fae4ab5d2893df600f441ba399507867
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num, num1, a, b, c, d, e;
		
		System.out.println("두 수 입력");
		num = input.nextInt();
		num1 = input.nextInt();
		a= num + num1;
		System.out.println("덧셈");
		b = num - num1;
		System.out.println("뺄셈");
		c = num*num1;
		System.out.println("곱셈");
		
		d = num/num1;
		System.out.println("나눗셈");
		e = num%num1;
		System.out.println("나머지");
		
		
		System.out.println("덧셈 : " +a);
		System.out.println("뺄셈 : " +b);
		System.out.println("곱셈 : " +c);
		System.out.println("나눗셈 : " +d);
		System.out.println("나머지 : " +e);

	}

}
