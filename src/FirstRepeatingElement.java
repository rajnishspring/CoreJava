import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class FirstRepeatingElement {
	public static void main(String[] args) {
		int[] arr = { 10, 5, 3, 4, 3, 5, 6 };
		int result = findFirstRepeatingElement(arr);

		if (result != -1) {
			System.out.println("First repeating element: " + arr[result]);
		} else {
			System.out.println("No repeating elements found");
		}
		Printfirst(arr);
		PrintfirstColection(arr);
	}

	static void PrintfirstColection(int[] arr) {
		HashSet s = new HashSet();
		boolean flag = false;
		for (int i = 0; i < arr.length; i++) {
			if (s.add(arr[i]) == false) {
				System.err.println("in side PrintfirstColection firstnonrepeated element ::" + arr[i]);
				flag = true;
				break;
			}
			if (flag)
				break;
		}

	}

	static void Printfirst(int[] arr) {
		boolean flag = false;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.err.println(arr[i]);
					flag = true;
					break;
				}
				if (flag)
					break;
			}

		}
	}

	public static int findFirstRepeatingElement(int[] arr) {
		HashSet<Integer> set = new HashSet<>();
		int minIndex = -1;

		for (int i = arr.length - 1; i >= 0; i--) {
			System.err.println(set.contains(arr[i]) + "::set.contains(arr[i]");
			System.out.println(set + "::set");
			if (set.contains(arr[i])) {
				minIndex = i;
			} else {
				set.add(arr[i]);
			}
		}

		return minIndex;
	}
}
