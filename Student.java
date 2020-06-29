/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teststudent;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author ayf
 */
public class Student {
    // Class Attributes (or Properties) (or Fields)
    private String name;
    private int    id;
    private double gpa;
     
    
    public Student(String name, int id)
    {
        this.name = name;
        this.id = id;
        gpa = 0.0;
    }
    
    public Student(Student s) 
    {
        this.name = s.getName();
        this.id   = s.getId();
        this.gpa  = s.getGpa();
    }
    
    public Student(String filePath) throws FileNotFoundException 
    {
        File f = new File(filePath);
        Scanner sc = new Scanner(f);
        
        this.name = sc.next();
        this.name += "  ";
        this.name += sc.next();
        this.id   = sc.nextInt();
        this.gpa  = sc.nextDouble();
        
        
        sc.close(); // Do not forget to close the object !!!
    }
    
    // Get method for 'name' variable
    public String getName() 
    {
        return name;
    }
    // Get method for 'id' variable
    public int getId() 
    {
        return id;
    }    
    // Get method for 'gpa' variable
    public double getGpa() 
    {
        return gpa;
    }

    // Set methods (setters or mutators) for being able to set values of private fields:
    // Set method for 'name' variable
    public void setName(String name) 
    {
        this.name = name;
    }
    // Set method for 'id' variable
    public void setId(int id) 
    {
        this.id = id;
    }
    // Set method for 'gpa' variable
    public void setGpa(double gpa) 
    {
        this.gpa = gpa;
    }
    
    
    // This method is used for printing 'Student' information
    @Override
    public String toString()
    {
        return "Name: " + name + " Id: " + id + " Gpa: " + gpa;
    }
     
}
