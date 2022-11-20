
// Given an integer array nums, 
// return true if any value 
// appears at least twice 
// in the array, 

// and return false if every 
// element is distinct.



class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        Map<Integer,Integer> myMap =new HashMap<>();
            for(int i=0;i<nums.length;i++) {
                if(myMap.containsKey(nums[i])) return true;     
                myMap.put(nums[i],i); 
            }
        return false;
    }
}



// Example 1:

// Input: nums = [1,2,3,1]
// Output: true
// Example 2:

// Input: nums = [1,2,3,4]
// Output: false
// Example 3:

// Input: nums = [1,1,1,3,3,4,3,2,4,2]
// Output: true
 

// Constraints:

// 1 <= nums.length <= 105
// -109 <= nums[i] <= 109
