package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);  
		System.out.println("What is the first number?");
		int n1 = scan.nextInt();
		System.out.println("What is the second number?");
		int n2 = scan.nextInt();
		System.out.println("the average number is " + (n1+n2)/2.0);

	}

}
