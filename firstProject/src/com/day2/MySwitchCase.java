package com.day2;

public class MySwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 50000;
		
		int naturalNumber = n*(n+1)/2;
		
		System.out.println(naturalNumber);
		
		int sum =0;
		for(int i=0; i<=n; i++) {
			sum += i;
		}
		//int c = 2147483647;
		System.out.println(sum);
		
		
	}

}
