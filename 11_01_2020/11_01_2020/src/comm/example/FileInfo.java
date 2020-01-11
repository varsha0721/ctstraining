package comm.example;

import java.io.File;
import java.io.IOException;

public class FileInfo {
    
    public static void main(String[] args) {
        
        // The first command line argument needs to be provided
        if (args.length < 1){
            System.out.println("Provide dummyname as command line argument");
            return;
        }
        
        String fileName = args[0];
        File fn = new File(fileName);
        try {
            fn.createNewFile();// this function always throw the exception so best practice to write it in try and catch block.
        } catch (IOException e) {
            
        }
        System.out.println("Name: " + fn.getName()); //show the name of file
        
        // Check if the file exists using exists() method
        if (fn.exists()) {
            System.out.println(fileName + " does exist.");
        }
        
        if (fn.canRead()) {
            System.out.println(fileName  + " is readable."); // file can be read or not
        }
        
        System.out.println(fileName + " is " + fn.length() + " bytes long."); // returns the size of file in bytes
        System.out.println(fileName + " is last modifed at " +
                new java.util.Date(fn.lastModified())) ; // shows the date when file is last modified
        
        if (fn.canWrite()) // return if we can write in a file or not
        {
            System.out.println(fileName  + " is writable.");
        } else{
            System.out.println(fileName  + " is not writable.");
        }
    }
}