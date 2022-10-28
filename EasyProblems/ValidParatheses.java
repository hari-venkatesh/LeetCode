
// Given a string s containing just the characters 
// '(', ')', '{', '}', '[' and ']', determine 
// if the input string is valid.

// An input string is valid if:

// Open brackets must be closed by the same 
// type of brackets.
// Open brackets must be closed in the correct order.
// Every close bracket has a corresponding open 
// bracket of the same type.


class Solution {
    public boolean isValid(String s) {
        
        
        Stack<Character> st=new Stack<>();
        
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='('||ch=='['||ch=='{')
                st.push(ch);
            
            else
            {
                if(st.isEmpty()) return false;//if nothing is there then no need for checking of closing bracket
                char top=st.peek();
                if(top=='(' && ch==')') st.pop();
                else if(top=='{' && ch=='}') st.pop();
                else if(top=='[' && ch==']') st.pop();
                else return false;//some times problem will be like ([) where my top is ( and ch is ] which leads to false;
            }
        }
        return st.isEmpty();
    }
}



// Example 1:

// Input: s = "()"
// Output: true
// Example 2:

// Input: s = "()[]{}"
// Output: true
// Example 3:

// Input: s = "(]"
// Output: false
 

// Constraints:

// 1 <= s.length <= 104
// s consists of parentheses only '()[]{}'.