1.write a program to remove duplicate from a string(Take any string example with duplicate character)
Ans.import java.util.LinkedHashSet;

public class RemoveDuplicatesFromString {
    public static void main(String[] args) {
        String input = "Hello World!";
        String output = removeDuplicates(input);
        System.out.println(output);
    }
    
    public static String removeDuplicates(String str) {
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        for (int i = 0; i < str.length(); i++) {
            set.add(str.charAt(i));
        }
        StringBuilder sb = new StringBuilder();
        for (Character c : set) {
            sb.append(c);
        }
        return sb.toString();
    }
}


2.write a program to print duplicte charaters from the strings.
Ans.import java.util.HashMap;

public class DuplicateCharacters {
    public static void main(String[] args) {
        String str = "hello world";
        HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
        
        // count the frequency of each character in the string
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            } else {
                charCountMap.put(c, 1);
            }
        }
        
        // print the characters that occur more than once
        System.out.print("Duplicate characters in the string '" + str + "': ");
        for (char c : charCountMap.keySet()) {
            if (charCountMap.get(c) > 1) {
                System.out.print(c + " ");
            }
        }
    }
}


3.write a program to check if "2552" is palindrome or not.
Ans.public class PalindromeChecker {
    public static void main(String[] args) {
        String str = "2552";
        if(isPalindrome(str)){
            System.out.println(str + " is a palindrome.");
        }
        else{
            System.out.println(str + " is not a palindrome.");
        }
    }
    
    public static boolean isPalindrome(String str){
        int length = str.length();
        for(int i=0; i<length/2; i++){
            if(str.charAt(i) != str.charAt(length-i-1)){
                return false;
            }
        }
        return true;
    }
}
Output:2552 is a palindrome.


4.write a program to count the number of constants,vowels,special characters in a string.
Ans.import java.util.Scanner;

public class CountCharacters {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        input.close();

        int vowels = 0, consonants = 0, specialChars = 0;

        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            } else {
                specialChars++;
            }
        }

        System.out.println("Number of vowels: " + vowels);
        System.out.println("Number of consonants: " + consonants);
        System.out.println("Number of special characters: " + specialChars);
    }
}


5.write a program to implement anagram checking least inbuilt methods being used.
Ans.import java.util.Scanner;

public class AnagramChecker {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first string: ");
        String str1 = input.nextLine();
        System.out.println("Enter the second string: ");
        String str2 = input.nextLine();
        
        if (isAnagram(str1, str2)) {
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }
    }
    
    public static boolean isAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        
        int[] charCount = new int[256]; // Assuming ASCII characters only
        
        for (int i = 0; i < str1.length(); i++) {
            charCount[str1.charAt(i)]++;
            charCount[str2.charAt(i)]--;
        }
        
        for (int count : charCount) {
            if (count != 0) {
                return false;
            }
        }
        
        return true;
    }
}


6.write a program to implement Panagram checking least inbuilt methods being used.
Ans.import java.util.Scanner;

public class PangramChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = scanner.nextLine().toLowerCase();
        boolean[] mark = new boolean[26];
        int index = 0;
        for (int i = 0; i < str.length(); i++) {
            if ('a' <= str.charAt(i) && str.charAt(i) <= 'z') {
                index = str.charAt(i) - 'a';
                mark[index] = true;
            }
        }
        boolean isPangram = true;
        for (int i = 0; i < 26; i++) {
            if (!mark[i]) {
                isPangram = false;
                break;
            }
        }
        if (isPangram) {
            System.out.println("The string is a pangram.");
        } else {
            System.out.println("The string is not a pangram.");
        }
    }
}


7.write a program to find if string contains all unique characters.
Ans.public class UniqueCharactersChecker {
    public static boolean hasAllUniqueCharacters(String str) {
        // create an array to keep track of characters seen
        boolean[] seen = new boolean[128]; // assuming ASCII characters

        for (int i = 0; i < str.length(); i++) {
            int ch = str.charAt(i);

            // if character is already seen, return false
            if (seen[ch]) {
                return false;
            }

            seen[ch] = true;
        }

        // if all characters are unique, return true
        return true;
    }

    public static void main(String[] args) {
        String str1 = "abcde"; // contains all unique characters
        String str2 = "aabbcc"; // contains duplicate characters

        if (hasAllUniqueCharacters(str1)) {
            System.out.println(str1 + " contains all unique characters");
        } else {
            System.out.println(str1 + " does not contain all unique characters");
        }

        if (hasAllUniqueCharacters(str2)) {
            System.out.println(str2 + " contains all unique characters");
        } else {
            System.out.println(str2 + " does not contain all unique characters");
        }
    }
}


8.write a program to find the maximum occuring character in a string.
Ans.import java.util.HashMap;
import java.util.Map;

public class MaxOccuringCharacter {
    public static void main(String[] args) {
        String str = "Hello World";
        char maxChar = getMaxOccuringChar(str);
        System.out.println("Maximum occurring character is '" + maxChar + "'");
    }

    public static char getMaxOccuringChar(String str) {
        // Create a HashMap to store character frequencies
        Map<Character, Integer> charFreqMap = new HashMap<Character, Integer>();

        // Iterate through the string and update the frequency count for each character
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (charFreqMap.containsKey(c)) {
                charFreqMap.put(c, charFreqMap.get(c) + 1);
            } else {
                charFreqMap.put(c, 1);
            }
        }

        // Find the maximum occurring character
        char maxChar = ' ';
        int maxFreq = 0;
        for (Map.Entry<Character, Integer> entry : charFreqMap.entrySet()) {
            char c = entry.getKey();
            int freq = entry.getValue();
            if (freq > maxFreq) {
                maxChar = c;
                maxFreq = freq;
            }
        }

        return maxChar;
    }
}
