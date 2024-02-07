package if_;

import java.util.Scanner;

public class Te03 { //7조문제

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int age;
		
		System.out.println("나이입력");
		age = input.nextInt();
		
		if(age<20) {
			System.out.println("10대 미성년자 입니다"+(20-age)+"살 후에 어른이 됩니다"); 
		}else if (age<30) {
			System.out.println("20대 입니다");
		}else if (age<40) {
			System.out.println("30대 입니다");
		}else if (age<50) {
			System.out.println("40대 입니다");
		}else if (age<60) {
			System.out.println("50대 입니다");
		}else if (age<70) {
			System.out.println("60대 입니다");
		}else if (age<80) {
			System.out.println("70대 입니다");
		}else if (age<90) {
			System.out.println("80대 입니다");
		}else if (age<100) {
			System.out.println("90대 입니다");
		}else {
			System.out.println("존재하지 않습니다");
		}
	}

}
