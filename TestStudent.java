/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teststudent;

import java.io.FileNotFoundException;

/**
 *
 * @author ayf
 */
public class TestStudent {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
       
       // Set the file path according to your system
       String filePath = "/home/ayf/Desktop/cse203/exercises/testStudent/student.tex";
        
       Student s = new Student(filePath);
        
       System.out.println(s);
        
    }
    
}
