package Module6;

public class RearrangeNegatives {
	public static void main(String[] args){
	        int[] arr = {1,-2,3,-4,5,-6};

	        int j=0;
	        for(int i=0;i<arr.length;i++){
	            if(arr[i]<0){
	                int temp=arr[i];
	                arr[i]=arr[j];
	                arr[j]=temp;
	                j++;
	            }
	        }

	        for(int x:arr)
	            System.out.print(x+" ");
	    }
	}

