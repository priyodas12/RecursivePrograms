package com.baseProgram;

public class FindGCD {
	
	public static int getGCD(int a,int b) {
		if(b==0) {
			return a;
		}
		return getGCD(b,a%b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getGCD(5, 10));
	}

}
