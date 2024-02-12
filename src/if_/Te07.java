package if_;

import java.util.Scanner;

public class Te07 { //3조문제
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int kor, eng, mat, avg, avg1, avg2, sum;
		String a, b, c, d, e;
		
		System.out.println("학년 입력");
		a = input.next();
		b = input.next();
		c = input.next();
		d = input.next();
		e = input.next();
		System.out.println("점수 입력");
		kor = input.nextInt();
		eng = input.nextInt();
		mat = input.nextInt();
		sum = kor + eng + mat;
		avg = sum/3;
		avg1 = sum/2;
		avg2 = sum/1;
		
		if(avg>=65) {
			System.out.println("합격"); 
			}else
				System.out.println("불합격");
		if(avg1>=75) {
			System.out.println("합격"); 
		}else
			System.out.println("불합격");
		if(avg2>=80) {
			System.out.println("합격"); 
		}else
			System.out.println("불합격");
		
		System.out.println("점 미달로 불합격입니다");
		

		
	}

}
