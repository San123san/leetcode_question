Array Indexing:
In Java, you cannot access characters in a string using square brackets as you have attempted with s[i]. Instead, you should uses.charAt(i) to access characters in a string.

Strings in Java are 0-indexed, so the valid indices for a string of length n are from 0 to n-1.

int digit = s.charAt(i) - '0';: This line extracts the current digit from the string at index i. In Java, characters are represented as Unicode values, but by subtracting '0', you convert the character 
representing a digit to the corresponding integer value. For example, if s.charAt(i) is '5', then digit will be assigned the value 5.

In Java, several data types and objects have a length property or method that you can use to determine the size or length of an array, string, or collection. Here are a few examples:
-->Arrays: You can use the length property to get the length (number of elements) of an array.
int[] array = {1, 2, 3, 4, 5};
int length = array.length;
Strings: You can use the length() method to get the length (number of characters) of a string.
-->String text = "Hello, World!";
int length = text.length();
Collections (Lists, Sets, etc.): You can use the size() method to get the number of elements in a collection. For example, with an ArrayList:
-->ArrayList<String> list = new ArrayList<>();
list.add("Apple");
list.add("Banana");
int size = list.size();
Remember that the specific method or property you should use depends on the type of data structure you are working with. Arrays have length, strings have length(), and collections often have size().

When you're returning an array inline, you need to use the syntax new int[]{} to create a new array and initialize it with the elements you want to return.
For instance, if you want to return an array containing two elements [i, j], you would use:
Syntax: return new int[]{i, j};
This syntax creates a new integer array and populates it with the values specified within the curly braces {}.

Array and String both have different method.
In array use the .length to get and in string use .size 

