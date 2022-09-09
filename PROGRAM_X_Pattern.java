package com.zohoGS.Tasks;

public class PROGRAM_X_Pattern {

	public static void main(String[]args) {
		String s = "PROGRAM";
		char [] cha = s.toCharArray();
		int n = cha.length;

		if(n % 2 == 0)
			System.out.println("0");

		else {

			for(int i = 1; i <= n; i++) {
				for(int j = 1; j <= n; j++) {
					if(i == j ) {
						System.out.print(cha[i-1]);
					}
					if((i+j == n+1) & (i != (n+1)/2)) {
						System.out.print(cha[n-i]+" ");
					}
					else {
						System.out.print("  ");
					}
				}
				System.out.println();
			}
		}

	}

}
