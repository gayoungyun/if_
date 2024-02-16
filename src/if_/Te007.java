package if_;

import java.util.Scanner;

public class Te007 { //3조문제
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int grade;
		int kor, eng, math;
		int sum;
		double avg;
		
		System.out.println("학년 : ");
		grade = sc.nextInt();
		System.out.println("국어 : ");
		kor = sc.nextInt();
		System.out.println("영어 : ");
		eng = sc.nextInt();
		System.out.println("수학 : ");
		math = sc.nextInt();
		sum = kor+eng+math;
		avg = sum/3.0;
		System.out.println("총점 : "+sum);
		System.out.println("평균 : "+avg);
		
		if(1<=grade && 3>=grade) {
			if(avg>=65) {
				System.out.println("합격입니다");
			}else {
				System.out.println(65 -avg+"점 미달로 불합격입니다");
			}
		}if(4<=grade && 5>=grade) {
			if(avg>=75) {
				System.out.println("합격입니다");
			}else {
				System.out.println(75 -avg+"점 미달로 불합격입니다");
			}
		}
		if(grade == 6) {
			if(avg>=80) {
				System.out.println("합격입니다");
			}else {
				System.out.println(80-avg+"점 미달로 불합격입니다");
			}
		}
	}

}
