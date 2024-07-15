package com.oops.abstraction;

public class SuperClass implements B,C,D{

	@Override
	public void m1() {
		System.out.println("M1 method");
		
	}

	@Override
	public void m2() {
		System.out.println("M2 method");
		
	
		
	}

	@Override
	public void m3() {
		System.out.println("M3 method");
		
	}

	@Override
	public void m4() {
		System.out.println("M4 method");
		
	}

	
	public void m5() {
		System.out.println("M5 method");
		
	}
	public static void main(String[] args) {
		SuperClass s = new SuperClass();
		s.m1();
		s.m2();
		s.m3();
		s.m4();
		s.m5();
	}

}
