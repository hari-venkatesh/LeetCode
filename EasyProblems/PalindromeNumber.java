// Given an integer x, return true 
// if x is palindrome integer.

// An integer is a palindrome 
// when it reads the same backward as forward.

// For example, 121 is a palindrome 
// while 123 is not.

// Lets Start 


public static boolean isPalindrome(int number) {
    int palindrome = number; 
    int reverse = 0;

    while (palindrome != 0) {
        int remainder = palindrome % 10;
        reverse = reverse * 10 + remainder;
        palindrome = palindrome / 10;
    }

  
    if (number == reverse) {
        return true;
    }
    return false;
}



