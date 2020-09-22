package com.codewithrizwan;


import java.text.NumberFormat;
import java.util.Scanner;

public class Prac {
	static String numbers;
	private static byte annnualInterest;
		
    public static void main(String args[]) {
	final byte MONTH_IN_YEAR = 12;
	final byte percent = 100;
	Scanner scanner = new Scanner(System.in);
	System.out.println("Principal:  ");
	int principal = scanner.nextInt();
	System.out.println("Annual Interest Rate: ");
	float annualInterest = scanner.nextFloat();
	float monthlyInterest = annnualInterest/percent/MONTH_IN_YEAR;
	System.out.println("Period (Years): ");
	byte years = scanner.nextByte();
	int numberOfPayments = years * MONTH_IN_YEAR;
	double mortgage = principal * (monthlyInterest * Math.pow(1+monthlyInterest, numberOfPayments)) / 
			                       (Math.pow(1+monthlyInterest, numberOfPayments));
	NumberFormat mortgageFormatted = NumberFormat.getCurrencyInstance();
	System.out.println("Mortgage:" + mortgageFormatted);
		 
}

}
