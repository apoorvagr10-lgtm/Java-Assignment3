package Module6;

public class PrefixSum {
	public static void main(String[] args) {
	        int[] arr = {2,4,6,8,10};
	        int n = arr.length;

	        int[] prefix = new int[n];
	        prefix[0] = arr[0];

	        for(int i=1;i<n;i++)
	            prefix[i] = prefix[i-1] + arr[i];

	        int L = 1, R = 3;

	        int sum = prefix[R] - (L>0 ? prefix[L-1] : 0);
	        System.out.println("Range Sum = " + sum);
	    }
	}
