/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teststring;

/**
 *
 * @author ayf
 */
public class TestString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Easiest way to construct a string
        String greeting = "Hello world!";
        //explicit call to constructor
        String greeting2 = new String("asd world!");
        // copy constructor
        String copy = new String(greeting);
        System.out.println(copy);
        System.out.println();
        
        
        
        // you can concatenate a string very easily
        String copy2 = copy+copy;
        // or with concat methods
        String copy3 = copy2.concat(copy); // copy2 + copy
        System.out.println(copy3);
        System.out.println();
        
       
        
        // equals and compareTo is to compare two strings
        String a = new String("ABCDEF");
        String b = new String("abcdef");
        //boolean m = a == b;
        //System.out.println(m);
        boolean r = a.equals(b);
        
        System.out.println("a equals b: " + r);
        // compare returns an integer
        int c = a.compareTo(b);
        System.out.println("a compared to b : " + c);
        // compareToIgnoreCase returns an integer (ignors lower-upper case difference)
        c = a.compareToIgnoreCase(b);
        System.out.println("a compared to b (ignoring case): " + c);
        System.out.println();
        
        
        
        // a = ABCDEF
        String d = "xDEyz";
        boolean m = a.regionMatches(3, d, 1, 2);
        System.out.println("a region matches with d: " + m);
        d = "xdEyz";
        m = a.regionMatches(true, 3, d, 1, 2);
        System.out.println("a region matches with d (ignore case): " + m);
        System.out.println();
        
         
        
        // a = ABCDEF
        // b = abcdef
        // lower case 
        String lowerA = a.toLowerCase();
        System.out.println("Lower case a: " + lowerA);
        // upper case 
        String upperB = b.toUpperCase();
        System.out.println("Upper case b: " + upperB);
        System.out.println();
       
        // a = ABCDEF
        // sub string of 'a' starting from 3rd character 
        String subA = a.substring(6);
        System.out.println("Substring of 'a' starting from 3rd character: " + subA);
        // sub string of 'a' from 2nd to 4th characters
        subA = a.substring(1, 3);
        System.out.println("Substring of 'a' from 2nd to 4th characters: " + subA);
        System.out.println();
        
        
        // lets invoke some other functions
        String path =  "C:\\Users\\GoogleDrive\\course\\cse203\\code\\mainargs\\TestStrings.java";
        // lets invoke endsWith
        System.out.println("Is this a java file: " + path.endsWith(".java"));
        System.out.println("Is this a c file: " + path.endsWith(".c"));
        // replace (character)
        System.out.println("Replace all occurence of (character): " + path.replace('c', 'F'));
        // replaceFirst and all (String) 
        System.out.println("Replace first occurence of (String)" + path.replaceFirst("c","HOOOOOOP"));
        System.out.println("Replace all occurence of (String)" + path.replaceAll("co","\n"));
        
        

        //split
        System.out.println();
        String[] parts = path.split("\\\\");
        for(int i = 0; i < parts.length; i++)
            System.out.println("Split parts "+i+" "+parts[i] );
        System.out.println();
        
        
        
        // search for a substring
        System.out.println("path contains 203:"+ path.contains("203"));
        System.out.println("path contains 111:"+ path.contains("111"));
        System.out.println();
         
        
        
        //trimming leading and trailing whitespaces
        String trimeed = "     This has lots of white space \t";
        System.out.println(trimeed);
        System.out.println(trimeed.trim());
        System.out.println();
        
        
        // take chars and print only numbers
        char[] ar = path.toCharArray();
        System.out.println("numeric letters of path: ");
        for (char l:ar)
            if(Character.isDigit(l))
                System.out.println(l);
        System.out.println();
         
    }
    
}
