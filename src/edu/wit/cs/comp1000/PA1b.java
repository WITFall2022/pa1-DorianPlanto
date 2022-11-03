package edu.wit.cs.comp1000;

import java.util.Scanner;

// TODO: document this class
public class PA1b {

	// TODO: document this function
	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 int inches;
		 
		 System.out.printf("Enter number of inches: ");
		 inches = input.nextInt();
		 
		 int yards = inches / 36;
		 int inchesf = inches % 36;
		 int feet = inchesf /12;
		 inchesf = inches % 12;
		 
		 System.out.printf("yards: %d%n", yards);
		 System.out.printf("feet: %d%n", feet);
		 System.out.printf("inches: %d%n", inches);
	}

}
