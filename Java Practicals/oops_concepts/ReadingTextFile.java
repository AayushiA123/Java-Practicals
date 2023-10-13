package oops_concepts;

//Importing the File class  
import java.io.File;   
//Importing FileNotFoundException class for handling errors  
import java.io.FileNotFoundException;   
//Importing the Scanner class for reading text files  
import java.util.Scanner;   

class ReadingTextFile {  
 public static void main(String[] args) {  
     try {  
         // Create f1 object of the file to read data  
         File f1 = new File("myTestFile.txt");    
         Scanner dataReader = new Scanner(f1);  
         while (dataReader.hasNextLine()) {  
             String fileData = dataReader.nextLine();  
             System.out.println(fileData);  
         }  
         dataReader.close();  
     } catch (FileNotFoundException exception) {  
         System.out.println("Unexcpected error occurred!");  
         exception.printStackTrace();  
     }  
 }  
}  