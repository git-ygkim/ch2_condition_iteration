package condition;
/**
 * @author yoongyo2
 * 210629 class04
 * 조건문,반복문 
 */
import java.util.Scanner;

public class If1 {

	// 멤버변수(필드)
	// 생성자
	// 메소드
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("숫자를 입력해 주세요>> ");
		int num = in.nextInt();
		
		
		if(num > 0) {
			System.out.println("양수입니다. ");
		} else if (num < 0) {
			System.out.println("음수입니다. ");			
		} else {
			System.out.println("0입니다. ");
		}
	}
}
