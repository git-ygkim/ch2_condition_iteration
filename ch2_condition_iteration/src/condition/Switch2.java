package condition;

import java.util.Scanner;

public class Switch2 {
	public static void main(String[] args) {

		int a, b;
		System.out.println("두 수와 연산 기호를 선택하십시오 >> (+, -, *, /, %)");
		Scanner in = new Scanner(System.in);
		a = in.nextInt();
		b = in.nextInt();
		String op = in.next();

		
		
		switch(op) {

		case "+":
			System.out.println(a + "+" + b + "=" + (a+b));
			break;
		
		case "-":
			System.out.println(a + "-" + b + "=" + (a-b));
			break;
		
		case "*":
			System.out.println(a + "*" + b + "=" + (a*b));
			break;
			
		case "/":
			System.out.println(a + "/" + b + "=" + (a/b));
			break;
			
		case "%":
			System.out.println(a + "%" + b + "=" + (a%b));
			break;
			
		default:
			System.out.println("그런 연산자는 없습니다. ");
		
		
		}
		
	}

}

