
public class MergeArray {
	public static void main(String[] args) {
		int[] arr1 = { 1, 3, 5, 7 };
		int[] arr2 = { 2, 4, 6, 8, 12 };

		int[] mergedArray = mergeSortedArrays(arr1, arr2);

		System.out.println("Merged Sorted Array:");
		for (int num : mergedArray) {
			System.out.print(num + " ");
		}
	}

	public static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
		int n = arr1.length;
		int m = arr2.length;
		int[] mergedArray = new int[n + m];
		int i = 0, j = 0, k = 0;

		// Merge elements from both arrays in sorted order
		while (i < n && j < m) {
			if (arr1[i] < arr2[j]) {
				mergedArray[k++] = arr1[i++];
			} else {
				mergedArray[k++] = arr2[j++];
			}
		}

		// Copy remaining elements from arr1, if any
		while (i < n) {
			mergedArray[k++] = arr1[i++];
		}

		// Copy remaining elements from arr2, if any
		while (j < m) {
			mergedArray[k++] = arr2[j++];
		}

		return mergedArray;
	}
}
