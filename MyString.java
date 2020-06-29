/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testmystring;

/**
 *
 * @author ayf
 */
public class MyString 
{
    
    // Can not create an instance of MyString since it has a private constructor.
    private MyString() 
    {
    }
    
    // checks and returns whether a given String has just three letters.
    public static boolean isThreeLetters(String s) 
    {
        return s.length() == 3;
    }
    
    // Checks whether a given string has "ABC"
    public static boolean hasABC(String s) 
    {
        return s.contains("ABC");
    }
    
    // checks whether a string is equal to its reverse (can use toCharArray here)
    public static boolean isPalindrome(String s) 
    {
        // s = "abccba"
        char[] arr = s.toCharArray();
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != arr[arr.length-i-1])
                return false;
        }
        
        return true;
    }
    
    // inserts a string into the other at given index [p1]
    public static String insert(String str1, String str2, int p1) 
    {
        // str1 = "abcdef"
        // str2 = "xyz"
        // p1 = 2
        String part1 = str1.substring(0, p1); // ab
        String part2 = str1.substring(p1);    // cdef
        // ab + xyz + cdef
        String newStr = part1 + str2 + part2;
        
        return newStr;
    }
    
    // deletes the characters of a string between [p1,p2]
    public static String delete(String str1, int p1, int p2) 
    {
        // str1 = abcdef
        // p1 = 1
        // p2 = 3
        String part1 = str1.substring(0, p1); // a
        String part2 = str1.substring(p2+1);  // ef
        
        // a + ef => aef
        String newStr = part1 + part2;
        return newStr;
    }
}
