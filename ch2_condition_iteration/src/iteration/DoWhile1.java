package iteration;

import java.util.Scanner;

public class DoWhile1 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = 0;
		int num;
//		int answer = Math.random();	// 0과 1 사이에 있는 소수점
		int answer = (int) (Math.random()*100)+1;	// 1과 100 (+1을 하지 않으면 0과 99) 사이에 있는 소수점
//		System.out.println(answer);
		
		
		
		// 무한반복
//		do {
//			
//			
//		} while(true);
		
		do {
			System.out.println("1~100중에서 어떤 숫자 일까요? ");
			num = sc.nextInt();
			
			if(answer == num) {
				System.out.println((cnt+1)+"번째에 맞췄습니다. ");
				break;
			} else if(answer > num ){
				System.out.println("더 큰 수를 입력해 주세요. ㅠ_ㅠ ");
				
			} else {
				System.out.println("더 작은 수를 입력해 주세요. ㅠ_ㅠ");
			}
			cnt++;
			
		} while(true);
		
		sc.close();
	}

}
