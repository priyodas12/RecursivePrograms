package com.baseProgram;

public class PrintInRange {
	
	public static void printInForward(int b) {
		if(b==0) {
			return;
		}
		System.out.print(b+" ");
		printInForward(b-1);	
	}
	
	public static void printInBackward(int b) {
		if(b==0) {
			return;
		}
		printInBackward(b-1);
		System.out.print(b+" ");	
	}
	
	public static void printInRangeF(int a,int b) {
		if(b==a-1) {
			return;
		}
		printInRangeF(a,b-1);
		System.out.print(b+" ");	
	}
	
	public static void main(String[] args) {
		printInForward(10);
		System.out.println("\n*********");
		printInBackward(10);
		System.out.println("\n*********");
		printInRangeF(10, 20);
	}

}
