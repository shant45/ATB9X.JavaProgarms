package Task161024;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Take_a_user_input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
  //    user inputs
        System.out.println("Enter the Name");
         String Name = scanner.nextLine();

        System.out.println("Enter the age ");
          int age = scanner.nextInt();

        System.out.println( " Entre the salary");
          double salary = scanner.nextDouble();

        System.out.println("Enter Name" + Name);

        System.out.println("Enter Age"  + age );
        System.out.println("Enter Salary" + salary);
    }
}
