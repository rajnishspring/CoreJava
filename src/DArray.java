
public class DArray {
	
	/*
	 * public static void main(String[] args) {
	 * 
	 * int[][] arr = { { 1, 2 }, { 101, 9 },{6,7},{46,48} }; int max=0; int
	 * secondMax=-1; System.out.println(arr.length); for (int i = 0; i < arr.length;
	 * i++) for (int j = 0; j < arr[i].length; j++) { System.out.println("arr[" + i
	 * + "][" + j + "] = " + arr[i][j]); if(arr[i][j]>max) { max=arr[i][j]; } } //
	 * System.err.println(secondMax); System.err.println("max"+max); }
	 */
	
	
	  public static void main(String[] args) {
	        System.out.println("Hello, World!");
	        int arr[][] = { { 1, 2 }, { 10, 9 },{6,7},{46,46} };
	        System.out.println(fun(arr));
	    }
	    
	    public static int[] fun(int arr[][]){
	        int max = Integer.MIN_VALUE;
	        int secmax = Integer.MIN_VALUE;
	        int res[] = new int[2];
	        for(int i=0;i<4;i++){
	            for(int j=0;j<2;j++){
	               if (arr[i][j] > max) {
	                secmax = max;
	                max = arr[i][j];
	            }
	           else if (arr[i][j] > secmax && arr[i][j] < max)
	                secmax = arr[i][j];
	            }
	        }
	       res[0] = max;
	       res[1] = secmax;  
	       
	       System.out.println(max);
	       System.out.println(secmax);
	       return res;
	    }}
	
