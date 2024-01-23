
public class ArrayOfArray {

	public static void main(String[] args) {
		int arr[][] = { { 1,4,5,6,8 }, {9,11,13,15,17 }, { 18,19,21,22,24} };
			System.out.println(arr[0][4]);
		System.out.println(arr.length);
		System.out.println(arr[arr.length-1][arr.length]);

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]);
				int f=arr[0][0];
				//int l=arr[arr.length][arr.length];
			}
			System.out.println();
		}
	}
}
