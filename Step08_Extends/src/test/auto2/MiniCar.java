package test.auto2;

import test.auto.Car;
import test.auto.Engine;

public class MiniCar extends Car{

	public MiniCar(Engine engine) {
		super(engine);
		
	}

	public void openTrunk() {
		if(this.engine==null) {
			System.out.println("Engine 이 없어서 달릴수가 없어요!");
			return; //메소드를 여기서 리턴시키기(종료시키기)
		}
		System.out.println("트렁크를 열어요!");
		
	}
}
