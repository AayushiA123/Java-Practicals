package oops_concepts;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
  
public class CreationOfTextFile {  
  public static void main(String[] args) {  
    try {  
      File myObj = new File("myTestFile.txt");  
      if (myObj.createNewFile()) {  
        System.out.println("File created: " + myObj.getName());  
        System.out.println("Absolute path: " + myObj.getAbsolutePath());  
        FileWriter myWriter = new FileWriter("myTestFile.txt");
        myWriter.write("Files in Java might be tricky, but it is fun enough!");
        myWriter.close();
        System.out.println("Successfully wrote to the file.");
      } else {  
        System.out.println("File already exists.");  
      }  
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();  
    }  
  }  
} 
