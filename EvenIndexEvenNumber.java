package Module6;

public class EvenIndexEvenNumber {
	public static void main(String[] args){
	        int[] arr={3,6,12,1,5,8};

	        int even=0, odd=1;

	        while(even<arr.length && odd<arr.length){
	            if(arr[even]%2==0)
	                even+=2;
	            else if(arr[odd]%2==1)
	                odd+=2;
	            else{
	                int temp=arr[even];
	                arr[even]=arr[odd];
	                arr[odd]=temp;
	            }
	        }

	        for(int x:arr)
	            System.out.print(x+" ");
	    }
	}

