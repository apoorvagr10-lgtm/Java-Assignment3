package Module6;

public class DifferenceArray {
	 public static void main(String[] args) {
	        int n = 5;
	        int[] arr = new int[n];
	        int[] diff = new int[n];

	        int l=1, r=3, val=5;

	        diff[l]+=val;
	        if(r+1<n)
	            diff[r+1]-=val;

	        arr[0]=diff[0];
	        for(int i=1;i<n;i++)
	            arr[i]=arr[i-1]+diff[i];

	        for(int x:arr)
	            System.out.print(x+" ");
	    }
	}
