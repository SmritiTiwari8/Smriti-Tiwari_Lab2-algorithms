package com.greatlearning.sorting;

import java.util.Scanner;

public class TravellingProblem {
	private static final Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the size of currency denominations=");
		int noOfDenominations = sc.nextInt();
		System.out.println("Enter the currency denominations value=");
		int[] notesArray = new int[noOfDenominations];
		for (int index = 0; index < noOfDenominations;) {
			int denomination = sc.nextInt();
			if (denomination != 0) {
				notesArray[index] = denomination;
				index++;
			}
		}
		MergeSort mergeSort = new MergeSort();
		mergeSort.mergeSort(notesArray, 0, notesArray.length - 1);
		/*
		 * for (int i = 0; i < notesArray.length; i++) {
		 * System.out.print(notesArray[i]); System.out.print(",");
		 * 
		 * }
		 */
		System.out.println("Enter the amount you want to pay=");
		int target = sc.nextInt();
		NotesCounter notesCounter = new NotesCounter();
		int[] notesCounterArray = notesCounter.notesCount(notesArray, target);

		int index = 0;

		if (notesCounterArray[index] != 0) {
			System.out.println("Your payment approach in order to give min no of notes will be");
		}

		for (index = 0; index < notesArray.length; index++) {

			if (notesCounterArray[index] != 0) {

				System.out.println(notesArray[index] + ":" + notesCounterArray[index]);
			}
		}
	}

}
