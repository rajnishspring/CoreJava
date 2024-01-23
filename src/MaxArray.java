import java.util.TreeSet;

public class MaxArray {
	static void show(int arr[],int num)
	{
		TreeSet<Integer> treeset=new TreeSet();
		System.out.println(arr.length-num +"::arr.length-num");
		for (int i=0;i<=arr.length-num;i++)
		{
			for(int j=i;j<i+num;j++)
			{
				treeset.add(arr[j]);
			}
			System.out.println(treeset.toArray()[2]+"MAx");
			System.out.println(treeset.toArray()[treeset.toArray().length-1]+"MAxx");
			treeset.clear();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {3,5,1,6,8,7,10};
		show(arr,3);

	}

}
