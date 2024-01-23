
public class VolkswagenQuest {

	public static void main(String[] args) {
		int a[] = { 0, 1, 0, 1, 0, 0, 1, 0, 1 };// o\p :- {0,0,0,0,0,1,1,1,1}
		int b[] = { 0, 1, 0, 3, 0, 0, 6, 0, 7 }; // o/p - {0,0,0,0,0,1,3,6,7}

		//arragedigit(a);

		//arrageramdomdigit(b);
		
		 int []nums = {2, 7, 4, 0, 9, 5, 1, 3 };
			int	target = 6;
			tripletExample(nums,target); //o/p :- {0, 1, 5}, {0, 2, 4}, {1, 2, 3}

	}

	private static void tripletExample(int[] nums, int target) {
		for(int i=0;i<nums.length-2;i++) {
			for(int j=i+1;j<nums.length-1;j++) {
				for(int k=j+1;k<nums.length;k++) {
					if(nums[i]+nums[j]+nums[k]==target) {
						System.out.println(nums[i]+","+nums[j]+","+nums[k]);
					}
					
				}
			}
			
		}
		
	}

	private static void arrageramdomdigit(int[] b) {
		int count = 0;
		int n[] = b;
		for (int i = 0; i < b.length; i++) {
			if (n[i] == 0) {
				count++;

			}

		}
		
		for (int j = 0; j < count; j++) {
			n[j] = 0;
		}
		for (int k = count; k < n.length; k++) {
			System.err.println("n[k] ::"+n[k] +"  b[k] ::"+b[k]);
			n[k] = b[k];
		}
		for (int result : b) {
			System.out.print("" + result);
		}
	}

	private static void arragedigit(int[] a) {
		int count = 0;
		int b[] = a;
		for (int i = 0; i < b.length; i++) {
			if (b[i] == 0) {
				count++;

			}

		}
		for (int j = 0; j < count; j++) {
			b[j] = 0;
		}
		for (int k = count; k < b.length; k++) {
			b[k] = 1;
		}
		for (int n : b) {
			System.out.print("" + n);
		}

	}

}
