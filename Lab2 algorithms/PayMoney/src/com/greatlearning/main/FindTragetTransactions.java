package com.greatlearning.main;

import java.util.Scanner;

public class FindTragetTransactions {
	private static final Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Enter the size of transaction array=");

		int size = sc.nextInt();

		int[] transactionsArray = new int[size];

		System.out.println("Enter the values of array");

		for (int index = 0; index < size;) {
			int transaction = sc.nextInt();
			if (transaction > 0) {
				transactionsArray[index] = transaction;
				index++;
			}
		}

		System.out.println("Enter the total no of targets that needs to be achieved =");
		int noOfTarget = sc.nextInt();
		printNoOfTransactions(transactionsArray, noOfTarget);

	}

	private static void printNoOfTransactions(int[] transactionsArray, int noOfTarget) {
		while (noOfTarget > 0) {
			System.out.println("Enter the value of target=");
			int target = sc.nextInt();
			int transactionsCount = getNumberOfTransactions(transactionsArray, target);
			if (transactionsCount > 0) {
				System.out.println("Target achived after" + " " + (transactionsCount) + " " + "transactions");
			} else {
				System.out.println("Given target is not achieved");
			}
			noOfTarget--;

		}
	}

	private static int getNumberOfTransactions(int[] transactionsArray, int target) {
		int transactionsCount = 0;
		int sum = 0;
		int size = transactionsArray.length;
		while (sum <= target && transactionsCount < size) {
			sum = sum + transactionsArray[transactionsCount];
			transactionsCount++;
		}
		if (transactionsCount >= size) {
			return -1;
		} else {
			return transactionsCount;
		}
	}

}
