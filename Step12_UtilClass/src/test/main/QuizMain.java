package test.main;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Consumer;

public class QuizMain {
	public static void main(String[] args) {
		/*
		 * Scanner 객체를 이용해서 반복문 돌면서 3명의 이름을 입력받아서
		 * 
		 * ArrayList 객체에 순서대로 저장하고
		 * 
		 * 다 저장된 이후에 반복문 돌면서 ArrayList 에 저장된 3명의 이름을 순서대로 콘솔창에 출력해보세요.
		 */
		ArrayList<String> names = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		
		for (int i=0; i<3; i++) {
			System.out.println("이름을 입력하세요.");
			String name = scan.next();
			names.add(name);
		}
		for (String tmp:names) {
			System.out.println(tmp);
		};
		

		};

	}

