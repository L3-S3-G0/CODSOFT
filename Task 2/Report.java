import java.util.ArrayList;

public class Report{

 public ArrayList<String> subjects = new ArrayList<String>();
 public ArrayList<Integer> marks = new ArrayList<Integer>();
 
 public void subjectAdd(String sub){
   subjects.add(sub);
 }
 
 public void marksAdd(int mark){
  marks.add(mark);
 }
 
 public int totalMarks(){
  int total = 0;
  for (int i : marks){
   total += i;
  }
  
  return total;
 }


}