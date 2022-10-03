
// Given a string s, find the length of the longest 
// substring without repeating characters.


class Solution {
    public int lengthOfLongestSubstring(String s) {
       Set<Character> hash = new HashSet<>();
        int posS = 0;
        int ans = 0;
        int n = s.length();
        for(int i=0; i < n; i++){
            if(i > 0)
                hash.remove(s.charAt(i - 1));
            while(posS < n && !hash.contains(s.charAt(posS))){
                hash.add(s.charAt(posS));
                posS++;
                ans = Math.max(ans, posS - i);
            }
        }
        return ans;
    }
}



// Example 1:

// Input: s = "abcabcbb"
// Output: 3
// Explanation: The answer is "abc", with the length of 3.
// Example 2:

// Input: s = "bbbbb"
// Output: 1
// Explanation: The answer is "b", with the length of 1.
// Example 3:

// Input: s = "pwwkew"
// Output: 3
// Explanation: The answer is "wke", with the length of 3.
// Notice that the answer must be a substring, "pwke" is a 
// subsequence and not a substring.
 

// Constraints:

// 0 <= s.length <= 5 * 104
// s consists of English letters, digits, symbols and spaces.