package com;

import java.util.Random;
import java.util.Scanner;

class NumberGuessingGame {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Guess the Digit Between 0 to 9 : ");
		int n = s.nextInt();
		Random r = new Random();
		int y = r.nextInt(10);
		
		if(n==y)
		{
			System.out.println("congratulations! You Won The Game");
		}
		else
		{
			System.out.println("Sorry! You Lose The Game");
			System.out.println("Oops.. It Was : " + y);
		}
	}
}
