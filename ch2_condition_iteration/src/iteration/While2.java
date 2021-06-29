package iteration;

public class While2 {

	
	public static void main(String[] args) {
	
		int i = 1, j = 1;
		
		while(i <= 9) {
			
			while(j <= 9) {
				
				System.out.println(i + "*" + j + "=" + (i * j));
				j++;
				
			}
			
			// j 값이 9로 끝났기 때문에, j 초기화 필요
			j=1;
			i++;
			System.out.println();
			
		}
	}
}
