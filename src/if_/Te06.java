package if_;

import java.util.Scanner;

public class Te06 { //4조문제
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num, num1;
		String name, name1;
		
		System.out.println("첫번째 이름, 주사위수");
		name = input.next();
		num = input.nextInt();
		
		System.out.println("두번째 이름, 주사위수");
		name1 = input.next();
		num1 = input.nextInt();
<<<<<<< HEAD
		//주사위 수가 6까지라는 조건이 없음
		if(num == num1) 
			System.out.println("무승부"); 
		else if(num > num1) {
=======
		
		if((1>num)||(num>6)||(1>num1)||(num1>6)) {
			System.out.println("1~6사이의 수"); 
		}else if(num > num1) {
>>>>>>> f59a7982fae4ab5d2893df600f441ba399507867
			System.out.println(name+" 님 승리");
		}else if(num < num1) {
				System.out.println(name1+" 님 승리");
		}else {
				System.out.println("무승부"); 
			}
		
		}
		
		
		
		
	}


