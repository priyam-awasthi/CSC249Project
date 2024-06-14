import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;

public class Project_Priyam_Awasthi {
    public static void main(String[] args) throws IOException {
      File file = new File("test.txt");
      Scanner input = new Scanner(file);
      
      String number = "";
      String provider = "";
      String fName = "";
      String lName = "";
      String age = "";
      String smoke = "";
      String height = "";
      String weight = "";
      ArrayList<Insurance> policies = new ArrayList<Insurance>();
      
      while(input.hasNext())
      {
         number = input.nextLine();
         provider = input.nextLine();
         fName = input.nextLine();
         lName = input.nextLine();
         age = input.nextLine();
         smoke = input.nextLine();
         height = input.nextLine();
         weight = input.nextLine();
         
         if(input.hasNext())
         { 
               input.nextLine();
         }
         Insurance i = new Insurance(number, provider, fName, lName, age, smoke, height, weight);
         policies.add(i);
      }
      input.close();
      
      for(Insurance person: policies)
      {
         System.out.println(person);
         System.out.println();
      }
    }
}
