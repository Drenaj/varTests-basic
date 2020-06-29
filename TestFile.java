/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testfile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author ayf
 */
public class TestFile {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        // Set the file path according to your system
        String filePath = "/home/ayf/Desktop/cse203/exercises/testFile/testFile.tex";
        
        File f = new File(filePath);
        PrintWriter pw = new PrintWriter(f);
        
        for (int i = 0; i< 100;i++)
        {
            pw.print("sqrt(" + i + ") = ");
            pw.println(Math.sqrt(i));
        }
        
        pw.close(); // Do not forget to close the object !!!

    }
    
}
