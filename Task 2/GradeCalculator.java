import java.util.Scanner;

public class GradeCalculator{
 public static void main(String[] args){
  Scanner inn = new Scanner(System.in);
  Report report = new Report();
  
  System.out.println("Please enter your grade\\s\nEnter DONE when finished ");
  System.out.print("Grade: ");
  String mark = inn.nextLine();
  
  while(true){
   try{
    double result = Double.parseDouble(mark);
    int res = (int)result;
    report.marksAdd(res);
   }
   catch(Exception e) {break;}
   
   System.out.print("Grade: ");
   mark = inn.nextLine();
  }
  System.out.println();
  report.displayResults();
 }
}