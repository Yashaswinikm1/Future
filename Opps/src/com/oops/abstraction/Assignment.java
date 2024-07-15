package com.oops.abstraction;

import java.util.Scanner;

public class Assignment 
{
	
	public static void main(String[] args) {
		Encapsulation1 e = new Encapsulation1(123456);
		System.out.println(e.getAcc());
		e.setA(123456);
		System.out.println(e.getAcc());
	}

}
class Encapsulation1
{
	private int Acc;

	Encapsulation1(int n)
	{
		this.Acc = n;
	}
	public int getAcc()
	{
		return Acc;
	}
	public void setA(int num)
	{
		int i = num%10;
		num = num/10;
		num = num*10+ ++i;
		this.Acc= num;
	}
}
