package com.pack.test;

import java.util.Random;

public class RandomNumber {
	
	public static void main(String args[]){
		int i;
		
	for(i=0;i<=10;i++){
		
		System.out.println(getRandomNumberInRange(5,10));
		
	}
	}

	private static int getRandomNumberInRange(int min, int max) {
		// TODO Auto-generated method stub
		
		Random r=new Random();
		
		return r.nextInt((max-min)+1)+min;
	}		

}
