package if_;

import java.util.Scanner;

public class Ex003 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num;// 
		int num1 = 0;// 값을 덮어 씌운다
		System.out.print("두 수 입력 ");
		num = input.nextInt();
		num1 = input.nextInt();
		if(num>num1); {
			System.out.println(+num);
			num = input.nextInt();
		}
			System.out.println(+num1);
			num1 = input.nextInt();
		
		int num2;//다시 n1,n2,n3
		int num3;
		int num4;
		System.out.println("세 수 입력");
		num2 = input.nextInt();
		num3 = input.nextInt();
		num4 = input.nextInt();
		if(num2> num3 && num2>num4) {
			System.out.println(num2가 크다);//"num3이 nnum2보다크다"
			num2 = input.nextInt();
		}
		if(num4>num2 && num4>num3); { //
			System.out.println(num4가 크다);
			num4 = input.nextInt();
		}
		if(num3>num2 && num3>num4); {
			System.out.println(num3가 크다);
			num3 = input.nextInt();
		}
	}

}
