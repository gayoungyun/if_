package if_;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n1, n2, n3,max;
		if(n1>n2 && n1>n3) {
			System.out.println("n1이 가장 크다 ");
		}
		
		if(n1>n2 &&n1>n3) {
			System.out.println("n1가장크다");
			if(n1>n2) {
				System.out.println("n2그크다");
				System.out.println("n2그크다");
			}else {
				System.out.println("n2그크다");
				System.out.println("n2그크다");
			}
		}
		
		String result;
		if
		//가장 큰수, 두번째 큰수, 마지막 수
		if(n1 >n2) {// 중첩if문
			if(n1>n3) {
				System.out.println("n1이 가장크다");
			}else {
				System.out.println("n3가 가장크다");
			}
		}else {
			System.out.println("n2가 가장크다");
		}
		if(n1 >n3) {
			if(n1>n2) {
				System.out.println("n1이 가장크다");
			}else {
				System.out.println("n2가 가장크다");
			}
		}else {
			System.out.println("n3가 가장크다");
		}
		if(n2 > n1) {
			if(n2>n3) {
				System.out.println("n2이 가장크다");
			}else {
				System.out.println("n3가 가장크다");
			}
		}else {
			System.out.println("n1가 가장크다");
		}
		if(n2 > n3) {
			if(n2>n1) {
				System.out.println("n2이 가장크다");
			}else {
				System.out.println("n1가 가장크다");
			}
		}else {
			System.out.println("n3가 가장크다");
		}
		if(n3 > n1) {
			if(n3>n2) {
				System.out.println("n3이 가장크다");
			}else {
				System.out.println("n2가 가장크다");
			}
		}else {
			System.out.println("n1가 가장크다");
		}
		if(n3 > n2) {
			if(n3>n1) {
				System.out.println("n3이 가장크다");
			}else {
				System.out.println("n1가 가장크다");
			}
		}else {
			System.out.println("n2가 가장크다");
		}
	}

}
