package com.baseProgram;import java.io.ObjectInputStream.GetField;

public class NthPower {
	
	public static int getPower(int k,int l) {
		if(k==0) {
			return 1;
		}
		return getPower(k-1, l)*l;
	}

	public static void main(String[] args) {
		System.out.println(getPower(3, 5));

	}

}
