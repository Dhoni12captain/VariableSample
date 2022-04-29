package org.base;

public class EmployeeInfo {
	static int a = 10;
	int c;
	private void add(int a,int b) {
	a=15;
	b=20;
	c = a+b;

	}
	public static void main(String[] args) {
		System.out.println(a);	
		EmployeeInfo e = new EmployeeInfo();
		e.add(100, 200);
		System.out.println(e.c);
		
	}
	
		
	}


