package if_;

import java.util.Scanner;

public class Te03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int age;
		
		System.out.println("나이입력");
		age = input.nextInt();
		
		if(age<20) {
			System.out.println("몇 살뒤에는 어른이 됩니다"); 
		}else if (age<100) {
			System.out.println("20~90대 어른 입니다");
		}else {
			System.out.println("존재하지 않습니다");
		}
	}

}
