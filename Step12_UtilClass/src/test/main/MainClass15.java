package test.main;

import java.util.Random;

/*
 * 반복문 while
 */
public class MainClass15 {
	public static void main(String[] args) {
		int count=0;
		//무한반복
//		while(true) {
//			count++;
//			System.out.println(count);
//		}
//		//정해진 횟수만큼 반복
//		while(count<10) {
//			System.out.println(count);
//			count++;
//		}
		//랜덤한 숫자를 얻어낼 Random 객체
		Random ran=new Random();
		
		while(true) {
			int ranNum=ran.nextInt(100);
			System.out.println(ranNum);
			if(ranNum==50) { //50이라는 숫자가 우연히 나온다면
				break; //반복문 블럭 탈출
			}
		}
		System.out.println("----------------------------");
		
		boolean isRun=true;
		while(isRun) {
			int ranNum=ran.nextInt(100);
			System.out.println(ranNum);
			if(ranNum==50) {
				isRun=false;
			}
		}
	}
}
