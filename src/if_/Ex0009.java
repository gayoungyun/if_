package if_;

import java.util.Scanner;

public class Ex0009 {
	public static void main(String[] args) {
		Scanner input  = new Scanner(System.in);
		int year, age, birth;
		
		System.out.println("현재년도");
		year = input.nextInt();
		System.out.println("나이입력");
		age = input.nextInt();
		
		birth = year-age;
		if((birth/10)*10 == 2000) {
			System.out.println("2000년대에 태어났습니다");
		}else if((birth/10)*10 == 1990) {
			System.out.println("1990년대에 태어났습니다");
		}else if((birth/10)*10 == 1980) {
			System.out.println("1980년대에 태어났습니다");
		}else{
			System.out.println("1970년대에 태어났습니다");
		}
	}

}
