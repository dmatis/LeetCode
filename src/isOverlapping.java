// returns true if the interval array a overlaps with b

// Are they sorted?
// if not, preprocessing needed, sort with mergesort O(nlogn) operation

public static boolean isOverlapping(int[] a, int[] b) {
	if (a[a.length-1] >= b[0] && a[0] <= b[b.length-1]) {
		return true;
	}
	return false;
}


// if given 4 ints instead, can't assume they're sorted, could be in decreasing order
public static boolean isOverlapping(int a, int b, int c, int d) {
	if ((b >= c && a <= d) || (b <= d && a >= d) || (a <= d && b >= d) || (a <= c && a >= d)) {
		return true;
	}
	return false;
}


O(nlogn) operation if sorting needed
O(n) otherwise