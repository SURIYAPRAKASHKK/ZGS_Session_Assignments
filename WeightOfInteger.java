package com.zohoGS.Tasks;

public class WeightOfInteger {

	public static void main(String[] args) {

		int[] input = new int[] { 49, 36, 8, 10,  12 };
		int[] rank = new int[5];

		for (int i = 0; i < input.length; i++) {
			int weight = 0;
			for (int k = 0; k <= (int) input[i] / 2; k++) {
				if (k * k == input[i]) {
					weight += 5;
				}
			}
			if (input[i] % 6 == 0 && input[i] % 4 == 0) {
				weight += 4;
			}
			if (input[i] % 2 == 0) {
				weight += 3;
			}

			rank[i] = weight;
		}

		for (int i = 0; i < rank.length - 1; i++) {
			for (int j = i + 1; j <= rank.length - 1; j++) {
				if (rank[i] < rank[j]) {
					int t = rank[i];
					rank[i] = rank[j];
					rank[j] = t;

					int t1 = input[i];
					input[i] = input[j];
					input[j] = t1;
				}
			}
		}

		for (int i = 0; i < input.length; i++) {
			System.out.print("<" + input[i] + "," + rank[i] + ">");
			if (i < input.length - 1)
				System.out.print(",");
		}

	}
}
