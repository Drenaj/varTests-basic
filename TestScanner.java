/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testscanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author ayf
 */
public class TestScanner {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        
        // Set the file path according to your system
        String filePath = "/home/ayf/Desktop/cse203/exercises/testScanner/courses.tex";
        
        File f = new File(filePath);
        Scanner sc = new Scanner(f);
        
        String str = sc.nextLine();
        System.out.println(str);
        
        while(sc.hasNext())
        {
            String courseName = sc.next();
            int numStudents   = sc.nextInt();
            System.out.println("Read course: " + courseName + " number of Students: " + numStudents);
        }
        sc.close(); // Do not forget to close the object !!!
    }
    
}
