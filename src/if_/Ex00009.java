package if_;

import java.util.Scanner;

public class Ex00009 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int year = 0;
		
		System.out.println("연도 입력");
		year = input.nextInt();
		
		if(!(year>=1 && year<=4000)) {
			System.out.println("1~4000사이를 입력하세요");
			}else if(year%4 == 0 && (year%100 != 0 || year%400 == 0)) {
				System.out.println("1"); 
		}else { 
				System.out.println("0");
		}
		
	}
}

