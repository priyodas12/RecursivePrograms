package com.baseProgram;

public class SumOfDigits {
	
	public static int sum(int k) {
		if(k/10==0) {
			return k;
		}
		return sum(k/10)+k%10;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sum(1234));
	}

}
