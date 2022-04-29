package org.base;

public class EmployeeInfo {
	static int a = 10;
	private void add() {
		a=100;
		

	}
	
	public static void main(String[] args) {
		System.out.println(a);
		EmployeeInfo ee = new EmployeeInfo();
		ee.add();
		System.out.println(a);
		
	}
	
		
	}


