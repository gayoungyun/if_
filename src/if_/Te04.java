package if_;

import java.util.Scanner;

public class Te04 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int age, mon;
		
		System.out.println("나이입력");
		age = input.nextInt();
		System.out.println("금액입력");
		mon = input.nextInt();
		
		if(age>=10 && age<=15)
			if(mon>=13000 ) { // 관계다시확인 생각
				System.out.println("어린이표 구매가능");
			}else 
			System.out.println("어린이표 구매불가");
		if(19<=age) { //조건식 다시 생각
			if(mon>=15000) { //조건식 다시 생각
			System.out.println("~19세표 구매가능");
			}else
			System.out.println("~19세표 구매불가");
		}
	}

}
