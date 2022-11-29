
// Given an array nums of distinct integers,
// return all the possible permutations. 
// You can return the answer 
// in any order.


class Solution {
    static void solve(int[] nums, boolean[] flag, List<Integer> arr, List<List<Integer>> res){
        if(arr.size() == nums.length){
            res.add(new ArrayList<>(arr));
            return;
        }
        for(int i=0; i<nums.length; i++){
            if(!flag[i]){
                flag[i]=true;
                arr.add(nums[i]);
                solve(nums, flag, arr, res);
                arr.remove(arr.size()-1);
                flag[i]=false;
            }
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        boolean[] flag=new boolean[nums.length];
        List<List<Integer>> res=new ArrayList<>();
        solve(nums, flag, new ArrayList<Integer>(), res);
        return res;
    }
}



// Example 1:

// Input: nums = [1,2,3]
// Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],
//                             [3,1,2],[3,2,1]]
// Example 2:

// Input: nums = [0,1]
// Output: [[0,1],[1,0]]
// Example 3:

// Input: nums = [1]
// Output: [[1]]
 

// Constraints:

// 1 <= nums.length <= 6
// -10 <= nums[i] <= 10
// All the integers of nums are unique.