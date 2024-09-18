package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("How high do you want to find the prime numbers?");
		int n = in.nextInt();
		boolean [] prime = new boolean [n];
		prime [0] = false;
		for (int a=1; a < n; a++) {
			prime [a]=true;
		}
		for (int i=2; i <= n; i++) {
			if (prime [i-1]) {
				System.out.println(i);
			for (int j=i*i; j <= n; j+=i) {
					prime [j-1] = false;
					
				}
			}
		}
		
	}

}
