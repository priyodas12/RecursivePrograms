package com.baseProgram;
/*author:priyodas12*/
public class Factorial {
	
	public int getFactorial(int k) {
		if(k==0) {
			return 1;
		}
		return k*getFactorial(k-1);
	}
	
	public static void main(String[] args) {
		Factorial f=new Factorial();
		int j=f.getFactorial(10);
		System.out.println(j);
	}

}
