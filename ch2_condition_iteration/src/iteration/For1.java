package iteration;

import java.util.Scanner;

public class For1 {

	public static void main(String[] args) {
		int sum=0 ,sum2 = 0;
		Scanner in = new Scanner(System.in);
		int end = in.nextInt();
		
		for(int i = 0; i <= end; i++) {
			sum += i;
			
	 	//    1 = 0 + 1;
		//    3 = 1 + 2;
		//    6 = 3 + 3;
			
			System.out.println(i + "번째 까지 합계 : " + sum);
		}
	
		System.out.println("최종 합계 : " + sum);

		// 짝수일 때만 더하기
		for(int i = 0; i <= end; i++) {
			if (i%2 == 0) {
				sum2 += i;
				
			}
			
			System.out.println(i + "번째 까지 합계 : " + sum2);
		}		
		System.out.println("최종 합계 : " + sum2);
	}

}
