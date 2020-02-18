package arrays;

public class RepeatAndMissingNumber {
	/*
	 * Each integer appears exactly once except A which appears twice and B which is
	 * missing. Return A and B.
	 */
	public static void main(String[] args) {
		int[] testArr = new int[] { 1, 2, 4, 5, 4 };
		int[] res = repeatedNumber(testArr);
		System.out.println("Repeated Number " + res[0] + " and Missing Number " + res[1]);
	}

	public static int[] repeatedNumber(final int[] a) {
		long rSum = 0, rSumSq = 0, aSum = 0, aSumSq = 0;
		for (int i = 0; i < a.length; i++) {
			aSum += a[i];
			rSum += (i + 1);
			aSumSq += (a[i] * a[i]);
			rSumSq += ((i + 1) * (i + 1));
		}
		int x = 0, y = 0, z = 0;
		y = (int) (rSum - aSum);
		z = (int) (rSumSq - aSumSq);
		if (y != 0)
			x = z / y;
		else
			x = 0;
		int res[] = new int[2];
		res[1] = (x + y) / 2;
		res[0] = (x - y) / 2;
		return res;
	}

}
