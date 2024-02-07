package if_;

import java.util.Scanner;

public class Te06 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num, num1;
		String name, name1;
		
		System.out.println("이름입력");
		name = input.next();
		name1 = input.next();
		System.out.println("주사위 수");
		num = input.nextInt();
		num1 = input.nextInt();
		
		if(num == num1) 
			System.out.println("무승부"); 
		else if(num > num1) {
			System.out.println(name+" 님 승리");
		}else {
				System.out.println(name1+" 님 승리"); 
			}
		
		}
		
		
		
		
	}


