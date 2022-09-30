
// Given an array nums of distinct integers, 
// return all the possible permutations. 
// You can return the answer in any order.

 
class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        int n = nums.length;
        if(n==1){
            ArrayList<Integer> num = new ArrayList<Integer>();
            num.add(nums[0]);
            list.add(num);
            return list;
        }
        for(int i=0;i<n;i++){
            int[] sub = new int[n-1];
            int k=0;
            for(int j=0;j<n;j++){
                if(i!=j)
                    sub[k++] = nums[j];
            }
            List<List<Integer>> perm = permute(sub);
            for(k=0;k<perm.size();k++){
                perm.get(k).add(nums[i]);
                list.add(perm.get(k));
            }
        }
        return list;
    }
}
 


// Example 1:

// Input: nums = [1,2,3]
// Output: [[1,2,3],[1,3,2],[2,1,3],
//                  [2,3,1],[3,1,2],[3,2,1]]
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