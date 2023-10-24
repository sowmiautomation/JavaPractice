package com.abstrac;

public class BMW extends Car{
	
	
//	public void display(int a, int b){
//		System.out.println("BMW");
//	}
	
	
	void display(){
		System.out.println("BMW");
		Car.i=300;
	}
	
	static void print() {
		System.out.println("Print BMWstatic method");
	}

}
