package iteration;

public class For3 {
	
	public static void main(String[] args) {
		for(int i =1; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				
				// i*j에서 j가 짝수일 때는 실행하지 않음
				if(j%2 == 0) {
					continue;
				}
				System.out.println(i + "*" + j + "=" + (i * j));
			}
			System.out.println();
		}
	}

}
