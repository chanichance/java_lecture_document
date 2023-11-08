package test.main;

import test.mypac.calc;

public class MainClass05 {
	public static void main(String[] args) {
		calc add1 = new calc() {
			@Override
			public double execute(double num1, double num2) {
				return num1 + num2;
			}
		};
		double result1 = add1.execute(10, 20);// 20

		// 매개 변수와 type 은 선언할 필요가 없다. 매개 변수의 갯수만 맞으면 됨.
		calc add2 = (num1, num2) -> {
			return num1 + num2;
		};
		// 중괄호 안에서 따로 실행할 code 가 없다면 중괄호 생략, return 예약어 생략 후 리턴할 값만 명시하면 된다.
		calc add3 = (num1, num2) -> num1 + num2; // 한줄짜리 함수모양 => 람다식

		calc add = (a, b) -> a + b;
		calc sub = (a, b) -> a - b;
		calc mul = (a, b) -> a * b;

		double result2 = add.execute(10, 20);
		double result3 = sub.execute(100, 100);
		double result4 = mul.execute(3, 5);
	}
}
