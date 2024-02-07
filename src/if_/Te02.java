package if_;

import java.util.Scanner;

public class Te02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int kor, eng, mat, ave, sum;// 초기값을 0으로 설정하면 값이 안나온다
		char grade;
		
		System.out.println("점수입력");
		kor = input.nextInt();
		eng = input.nextInt();
		mat = input.nextInt();
		sum = kor + eng + mat;
		ave = sum/3;
		
		if(ave>100 || ave<0) {
			System.out.println("잘못입력했습니다");
			}else if(ave>=90) {
				System.out.println("평균 점수는 "+ave+" 점이며 등급은 A입니다"); 
			}else if(ave>=80) {
				System.out.println("평균 점수는 "+ave+" 점이며 등급은 B입니다"); 
			}else if(ave>=70) {
				System.out.println("평균 점수는 "+ave+" 점이며 등급은 C입니다"); 
			}else if(ave>60) {
				System.out.println("평균 점수는 "+ave+" 점이며 등급은 D입니다"); 
			}else {
				System.out.println("평균 점수는 "+ave+" 점이며 등급은 F입니다"); 
				
			
				
		}
		
		
		
		
	}

}
