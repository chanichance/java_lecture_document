package test.main;

import test.mypac.AndroidPhone;
import test.mypac.HandPhone;

public class MainClass06 {
	public static void main(String[] args) {
		//자식에게 사준 일반 핸드폰(인터넷이 안됨)
		HandPhone p1=new HandPhone();
		
		//엄마! 나도 AndroidPhone 갖고 싶어!!!
		
		//엄마가 새로운 설명서를 가지고 왔어 이제 그 폰은 AndroidPhone이야
		AndroidPhone p2=(AndroidPhone)p1; //runtime 시점에 ClassCastException 발생!
		
		//진짜? 엄마 짱이다~~
		//나 이제 인터넷 한다.
		p2.doInternet();
		
		/* 
		 * 컴파일 시점은 가동을 시켜보는 것 오류가 안나지만
		 * 런타임 시점은 오류가 날 것이다.
		 * 
		 */
	}
}
