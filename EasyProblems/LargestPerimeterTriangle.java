
// Given an integer array nums, return 
// the largest perimeter of a triangle 
// with a non-zero area, formed from 
// three of these lengths. 

// If it is impossible to form any 
// triangle of a non-zero area, 
// return 0.

class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        for(int i = nums.length-1; i>1; i--) {
            int l1 = nums[i];
            int l2 = nums[i-1];
            int l3 = nums[i-2];
            if(l2+l3>l1) {
                return l1+l2+l3;
            }
        }
    return 0;
    }
}



// Example 1:

// Input: nums = [2,1,2]
// Output: 5
// Example 2:

// Input: nums = [1,2,1]
// Output: 0
 

// Constraints:

// 3 <= nums.length <= 104
// 1 <= nums[i] <= 106