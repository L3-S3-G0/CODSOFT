import java.util.ArrayList;

public class Report{

 public ArrayList<String> subjects = new ArrayList<String>();
 public ArrayList<Integer> marks = new ArrayList<Integer>();
 public int[] grades_ = {1, 1, 1, 2, 3, 4, 5, 6, 7, 7 };
 public String[] grades = {"F", "F", "F", "F", "F", "D", "C", "B", "A", "A" };

 
 public void subjectAdd(String sub){
   subjects.add(sub);
 }
 
 public void marksAdd(int mark){
  marks.add(mark);
 }
 
 public int getSize(){
  return marks.size();
 }
 
 public int totalMarks(){
  int total = 0;
  for (int i : marks){
   total += i;
  }
  return total;
 }
 
 public int averageMarks(){
  int totalMarks = this.totalMarks();
  int numberOfSubjects = this.getSize();
  
  return (totalMarks/numberOfSubjects);
 }
 
 private String grade(int mark){
  String grade = grades[(mark/10)];
  return grade;
 }
 
 public void displayResults(){
  System.out.println("Your results are as follows:\n");
  System.out.println("Total Marks: " + totalMarks());
  System.out.println("Average Percentage: " + averageMarks());
  System.out.println("Grade: " + grade(averageMarks()));
 }
 
}