package test.main;

import test.myPac.SquareMade;

public class MainClass08 {
	public static void main(String[] args) {
		SquareMade r1=new SquareMade();
		r1.width=100;
		r1.height=100;
		r1.printArea();
		
		SquareMade r2=new SquareMade();
		r2.width=20;
		r2.height=100;
		r2.printArea();
	}
}
