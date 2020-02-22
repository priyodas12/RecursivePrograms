package com.baseProgram;
/*author:priyodas12*/
public class Fibonacci {
	public static int getFibonacci(int n) {
		if(n==0) {
			return 0;
		}
		if(n==1) {
			return 1;
		}
		return getFibonacci(n-1)+getFibonacci(n-2);
	}

	public static void main(String[] args) {
		
		for(int i=0;i<10;i++) {
			System.out.print(getFibonacci(i)+" ");
		}
	}

}
