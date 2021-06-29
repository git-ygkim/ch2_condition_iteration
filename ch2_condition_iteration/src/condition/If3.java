package condition;

import java.util.Scanner;

public class If3 {

	// 100~999까지 정수를 입력 받아서
	// 3개 자리수가 몇개가 같은지 출력하시오
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int num = in.nextInt();
		
		if(num < 100) {
			System.out.println("100보다 작은 정수를 입력하였습니다. \n100~999까지의 정수를 입력하시오.");
		} else if (num > 1000) {
			System.out.println("999보다 큰 정수를 입력하였습니다. \n100~999까지의 정수를 입력하시오.");
		} else {
			
			int a = num/100;
			int b = num/10;
			int c = num%10;
			
			int count = 0;
			for(int i = 0; i < 3; i++) {
				if(a == b) {
					count++;
					System.out.println(count);
				}
			}
			
			System.out.println("입력한 정수는 " + count + "개 자릿수가 같습니다.");
								
			
			
		}
	
		
		
	}
}
