package Module7;

public class BinarySearch {
      static int iterative(int[] arr, int key){
	        int l=0, r=arr.length-1;

	        while(l<=r){
	            int mid=(l+r)/2;

	            if(arr[mid]==key) return mid;
	            else if(arr[mid]<key) l=mid+1;
	            else r=mid-1;
	        }

	        return -1;
	    }

	    static int recursive(int[] arr,int l,int r,int key){
	        if(l>r) return -1;

	        int mid=(l+r)/2;

	        if(arr[mid]==key) return mid;
	        if(arr[mid]<key)
	            return recursive(arr,mid+1,r,key);
	        else
	            return recursive(arr,l,mid-1,key);
	    }

	    public static void main(String[] args) {

	        int[] arr = {1,3,5,7,9,11,13};
	        int key = 7;

	        int result = iterative(arr, key);

	        if(result == -1)
	            System.out.println("Element not found");
	        else
	            System.out.println("Element found at index: " + result);
	    }
	}
