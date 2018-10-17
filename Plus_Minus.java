import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Plus_Minus {

	// Complete the plusMinus function below.
	static void plusMinus(int[] arr) {
		double zeros = 0;
		double negatives = 0;
		double positives = 0;

		// Check the array for positive, negative and zero values and increments a
		// counter for each
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				// if value is 0
				zeros++;
			} else if (arr[i] < 0) {
				// if value is negative
				negatives++;
			} else {
				// rest: if value is positive
				positives++;
			}
		}
		// turns the output to the specified decimal format with 6 decimal
		// houses
		DecimalFormat df = new DecimalFormat();
		df.setMaximumFractionDigits(6);

		// prints the ratio of each one
		System.out.println(df.format(positives / arr.length));
		System.out.println(df.format(negatives / arr.length));
		System.out.println(df.format(zeros / arr.length));
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int[] arr = new int[n];

		String[] arrItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++) {
			int arrItem = Integer.parseInt(arrItems[i]);
			arr[i] = arrItem;
		}

		plusMinus(arr);

		scanner.close();
	}
}
