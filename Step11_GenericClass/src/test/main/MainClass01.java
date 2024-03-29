package test.main;

import test.mypac.Apple;
import test.mypac.FruitBox;
import test.mypac.Melon;
import test.mypac.Orange;

public class MainClass01 {
	public static void main(String[] args) {
		//box와 box2에 . 을 찍어서 차이점을 확인해 보세요.
		FruitBox<Apple> box=new FruitBox<Apple>();
		FruitBox<Orange> box2=new FruitBox<Orange>();
		
		//객체 생성시에 Generic type 은 생략 가능하다.
		FruitBox<Melon> box3=new FruitBox<>();
		
		//Generic 클래스가 Apple 로 되어 있는 객체 사용하기
		box.pack(new Apple()); //Apple type 을 매개변수에 전달한다.
		Apple f1=box.unpack(); //Apple type이 리턴된다.
		
		//Generic 클래스가 Orange 로 되어 있는 객체 사용하기
		box2.pack(new Orange()); //Orange type을 매개변수에 전달한다.
		Orange f1=box.unpack(); //Orange type이 리턴된다.
	}
}
