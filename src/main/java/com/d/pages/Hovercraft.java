package com.d.pages;

import java.util.Scanner;

public class Hovercraft {

	
	public static void main(String[] args) {
		
	
		Scanner sc = new Scanner(System.in);
		
		int oders = sc.nextInt();
		int costMin = 10*2000000+1000000;
		int profit = oders*costMin;
		
		if(profit>costMin) {
			System.out.println("Profit");
		}else if(profit<costMin) {
			System.out.println("Lose");
		}else {
			System.out.println("Even");
			sc.close();
		}
	}

}

