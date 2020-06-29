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
public class TestMyString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String s1 = "xyz";
        String s2 = "-_-ABC-_-";
        
        System.out.println("s1 is three letters: " + MyString.isThreeLetters(s1));
        System.out.println("s2 is three letters: " + MyString.isThreeLetters(s2));
        
        System.out.println("s1 has 'ABC': " + MyString.hasABC(s1));
        System.out.println("s2 has 'ABC': " + MyString.hasABC(s2));
        
        String s3 = "abcba";
        System.out.println("s3 is palindrome: " + MyString.isPalindrome(s3));
        
        String s4 = MyString.insert(s1, "abc", 1);
        System.out.println("s4: " + s4);
        
        String s5 = MyString.delete(s2, 3, 5);
        System.out.println("s5: " + s5);
    }
    
}
