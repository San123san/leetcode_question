Array Indexing:
In Java, you cannot access characters in a string using square brackets as you have attempted with s[i]. Instead, you should uses.charAt(i) to access characters in a string.

Strings in Java are 0-indexed, so the valid indices for a string of length n are from 0 to n-1.

int digit = s.charAt(i) - '0';: This line extracts the current digit from the string at index i. In Java, characters are represented as Unicode values, but by subtracting '0', you convert the character 
representing a digit to the corresponding integer value. For example, if s.charAt(i) is '5', then digit will be assigned the value 5.
