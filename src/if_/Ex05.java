package if_;

public class Ex05 {
	public static void main(String[] args) {
		int num, su = 10;
		if( su > 100 ) {
			num =1234;
		}
		else  {//if if 는 초기화, else로 변경하고 초기화안해도 가능(식필요x)
			num= 1;
		}
		System.out.println( num );
	}

}
