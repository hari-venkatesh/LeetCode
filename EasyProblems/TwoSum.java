
// Given an array of integers nums and an integer
//  target, return indices of the two numbers 
//  such that they add up to target.

// You may assume that each input would have 
// exactly one solution, and you may not use 
// the same element twice.

// You can return the answer in any order.


import java.util.HashMap;
import java.util.Map;

public class TEST {

	public static void main(String[] args) {
		int[] nums= {5,4,8,8,1,1,1,8,5};
		int target = 9;
		Map<Integer, Integer> hari = new HashMap<>();
		for(int i=0; i<nums.length; i++) {
			hari.put(target-nums[i], i);
			Integer index=hari.get(nums[i]);
			if(index != null) {
				System.out.println(index +" "+ i);
		}

	}
		
		}
	}
