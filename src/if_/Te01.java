package if_;

import java.util.Scanner;

public class Te01 { //1조문제
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = 0;
		int num1 = 0;
		
		System.out.println("정수입력");
		num = input.nextInt();
		
		if(num>=0)
			System.out.println(num+"은 양수입니다");
		if(num<0)
			System.out.println(num+"은 음수입니다");
	}

}
