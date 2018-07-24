package find_a_target_sum_in_two_sorted_arrays;

public class Main {

	/*
	 * we have to find a given sum from two sorted array such as one value comes
	 * from the array1 and another one comes from the array2
	 * 
	 * sliding solution
	 */
	public static void main(String[] args) {

		// first check
		System.out.print("first test case: ");
		int[] a = { 1, 3, 5, 9, 12, 13, 15, 20 };
		int[] b = { 2, 7, 8, 10, 11, 14, 16, 17 };
		findTargetSum(a, b, 33);

		// second check
		System.out.print("second test case: ");
		int[] c = { 1, 3, 5, 9, 12, 13, 15, 20 };
		int[] d = { 1, 8, 9, 10, 12, 14, 16, 17 };
		findTargetSum(c, d, 19);

	}

	private static void findTargetSum(int[] a, int[] b, int sum) {

		boolean ansFound = false;
		int i = 0, j = b.length - 1;
		while (i < a.length && 0 <= j) {

			int currentSum = a[i] + b[j];
			if (currentSum == sum) {
				ansFound = true;
				break;
			} else if (currentSum > sum) {
				j--;
			} else {
				i++;
			}
		}
		if (ansFound) {
			System.out.println(a[i] + " + " + b[j] + " = " + sum);
		} else {
			System.out.println("Not Possible!");
		}

	}

}
