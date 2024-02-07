package if_;

import java.util.Scanner;

public class Ex0009 {
	public static void main(String[] args) {
		Scanner input  = new Scanner(System.in);
		int year = 0, age = 0;
		int year1 = 2024;
		
		System.out.println("현재년도");
		year = input.nextInt();
		System.out.println("나이입력");
		age = input.nextInt();
		year = year1-age;
		System.out.println(year+"년대에 태어났습니다");
		
	}

}
