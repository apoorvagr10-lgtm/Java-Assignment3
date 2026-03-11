package Module6;

import java.util.*;
public class PairSum {
	 public static void main(String[] args) {
	        int[] arr = {1,5,7,-1,5};
	        int target = 6;

	        Set<Integer> set = new HashSet<>();

	        for(int num : arr){
	            if(set.contains(target-num))
	                System.out.println(num + " " + (target-num));
	            set.add(num);
	        }
	    }
	}

