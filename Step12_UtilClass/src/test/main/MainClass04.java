package test.main;

import java.util.ArrayList;
import java.util.List;
import java.util.jar.Attributes.Name;

import test.mypac.Car;

public class MainClass04 {
	public static void main(String[] args) {
		
		// 1. Car type 을 저장할 수 있는 ArrayList 객체를 생성해서
		// 참조값을 List 인터페이스 type 지역변수 cars 에 담아보세요.
		 	List<Car> cars=new ArrayList<>();
		//	2. Car 객체(3개)를 생성해서 List 객체에 저장해 보세요.
			cars.add(new Car("람보르기니"));
			cars.add(new Car("페라리"));
			cars.add(new Car("마세라티"));
		//	3. 일반 for문을 이용해서 List 객체에 저장된 
		//	   모든 Car 객체의 drive() 메소드를 순서대로 호출해보세요.
		for(int i=0; i<cars.size(); i++) {
			Car tmp=cars.get(i);
			tmp.drive();
		}
		//	4. 확장 for 문을 이용해서 List 객체에 저장된 모든 Car 객체의 drive() 메소드를
		// 	   순서대로 호출해 보세요.
		for(Car tmp:cars) {
			tmp.drive();
			}
		//	5. Consumer 인터페이스를 활용해서 List 객체에 저장된 모든 Car 객체의 drive() 메소드를 
		//	   순서대로 호출해보세요.
		cars.forEach((tmp)->{
			tmp.drive();
		});
	}
}
