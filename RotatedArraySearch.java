package Module7;

public class RotatedArraySearch {
	static int search(int arr[], int key) {
	        int left = 0, right = arr.length - 1;

	        while (left <= right) {
	            int mid = (left + right) / 2;

	            if (arr[mid] == key)
	                return mid;

	            if (arr[left] <= arr[mid]) {
	                if (key >= arr[left] && key < arr[mid])
	                    right = mid - 1;
	                else
	                    left = mid + 1;
	            } else {
	                if (key > arr[mid] && key <= arr[right])
	                    left = mid + 1;
	                else
	                    right = mid - 1;
	            }
	        }
	        return -1;
	    }

	    public static void main(String args[]) {
	        int arr[] = {6,7,8,1,2,3,4,5};

	        System.out.println("Element index: " + search(arr,3));
	    }
	}

