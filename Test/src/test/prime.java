package test;

import java.util.Scanner;

public class prime {
	
	public static void main(String[] args) {
		
//		int temp, num;
//		boolean isPrime = true;
//		Scanner in = new Scanner(System.in);
//		System.out.println("Enter number");
//		num = in.nextInt();
//		for(int i=2;i<=2;i++)
//		{
//			temp=num%i;
//			if(temp==0) {
//				isPrime = false;
//			}
//			
//		}
//		if(isPrime) {
//			System.out.println(num + "is prime");
//		
//		}
//		else {
//			System.out.println(num + "is not prime");
//		}
//	
			
		int temp, num;
		boolean isPrime = true;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number");
		num = in.nextInt();
		for(int i=2; i<=num/2;i++) {
			temp = num%i;
			if(temp==0) {
				isPrime = false;
			}
		}
		if(isPrime) {
			System.out.println(num +"is prime");
		}
		else {
			
			System.out.println(num +"is not prime");
		}
		
		
		
	}

}
