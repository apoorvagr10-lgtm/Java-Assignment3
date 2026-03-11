package Module7;

public class FirstLastOccurence {
      static int firstOccurrence(int arr[], int key) {
	        int left = 0, right = arr.length - 1;
	        int result = -1;

	        while (left <= right) {
	            int mid = (left + right) / 2;

	            if (arr[mid] == key) {
	                result = mid;
	                right = mid - 1;
	            } 
	            else if (arr[mid] < key)
	                left = mid + 1;
	            else
	                right = mid - 1;
	        }
	        return result;
	    }

	    static int lastOccurrence(int arr[], int key) {
	        int left = 0, right = arr.length - 1;
	        int result = -1;

	        while (left <= right) {
	            int mid = (left + right) / 2;

	            if (arr[mid] == key) {
	                result = mid;
	                left = mid + 1;
	            } 
	            else if (arr[mid] < key)
	                left = mid + 1;
	            else
	                right = mid - 1;
	        }
	        return result;
	    }

	    public static void main(String args[]) {
	        int arr[] = {1,2,2,2,3,4,5};

	        System.out.println("First Occurrence: " + firstOccurrence(arr,2));
	        System.out.println("Last Occurrence: " + lastOccurrence(arr,2));
	    }
	}

