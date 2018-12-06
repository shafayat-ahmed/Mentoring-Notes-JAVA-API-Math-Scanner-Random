import java.util.Scanner;
	public class ScannerAPI {

	public static void main(String[] args) {
		// Declare the object and initialize with 
        // predefined standard input object 
        Scanner student1 = new Scanner(System.in); 
        
        System.out.print("Enter first students name= ");
        // String input 
        String name = student1.nextLine(); 
        System.out.println(name.charAt((1)-1));
        
        // Numerical data input 
        // byte, short and float can be read 
        // using similar-named functions.
        System.out.print("Enter first students age= ");
        int age = student1.nextInt();
        System.out.print("Enter first students ID= ");
        int ID = student1.nextInt();
        System.out.print("Enter first students grade= ");
        double grade = student1.nextDouble();
        
        Scanner student2 = new Scanner(System.in); 
        System.out.print("Enter second students name= ");
        String name1 = student2.nextLine(); 
        System.out.print("Enter second students age= ");
        int age1 = student2.nextInt();
        System.out.print("Enter second students ID= ");
        int ID1 = student2.nextInt();
        System.out.print("Enter second students grade= ");
        double grade1 = student2.nextDouble();
       
       
  
        // Print the values to check if input was correctly obtained.
        System.out.println("\n" +"Student information:" +"\n");
        //Student 1
        System.out.println("Name: "+name); 
        System.out.println("Age: "+age);
        System.out.println("ID= " +ID);
        System.out.println("CGPA: "+grade +"\n");
        //Student 2
        System.out.println("Name: "+name1); 
        System.out.println("Age: "+age1);
        System.out.println("ID= " +ID1);
        System.out.println("CGPA: "+grade1);
        
       
        System.out.println("\n"+"What is the highest grade =" +Math.max(grade, grade1));
        System.out.println("What is lowest age =" +Math.min(age, age1));
        
    } 
} 


