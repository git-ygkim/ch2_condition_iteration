/**
 * @author yoongyo2
 * 210629 class04
 * 조건문,반복문 
 */
package condition;

import java.util.Scanner;

public class If2 {

	public static void main(String[] args) {
		
		System.out.println("성적을 입력해 주세요>> ");
		Scanner in = new Scanner(System.in);
		
		int score = in.nextInt();
		String grade;
		
		if(score >= 90) {
			grade = "A";
		} else if(score >= 80) {
			grade = "B";
		} else if(score >= 70) {
			grade = "C";
		} else if(score >= 60) {
			grade = "D";
		} else {
			grade = "F";
		}
		
		System.out.println("점수는 " + score + "이고 학점은 " + grade + " 입니다.");
		System.out.printf("점수는 %d이고 학점은 %s 입니다.", score, grade);
		
	}
}
