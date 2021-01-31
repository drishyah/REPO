import java.util.*;
 
class Student{
  public int subjectA, subjectB, subjectC;

  Student(int a, int b, int c) {
    subjectA = a;
    subjectB = b;
    subjectC = c;
  }
  public int studentsTotalMarksInAllSunjects(Student[] students){
    int stud1,stud2,stud3;

    stud1=students[0].subjectA+students[0].subjectB+students[0].subjectC;
    stud2=students[1].subjectA+students[1].subjectB+students[1].subjectC;
    stud3=students[2].subjectA+students[2].subjectB+students[2].subjectC;
   
    return stud1+stud2+stud3;
  }
  
  public double studentsAverageMarksInAllSubjects(Student[] students){ 
    int stud1,stud2,stud3;
    stud1=students[0].subjectA+students[0].subjectB+students[0].subjectC;
    stud2=students[1].subjectA+students[1].subjectB+students[1].subjectC;
    stud3=students[2].subjectA+students[2].subjectB+students[2].subjectC;
   
    return (stud1+stud2+stud3)/3;
   }
  public int[] subjectWiseMarks(Student[] students,String subjectName){

   int subject = subjectA;
   int[] subMarks = new int[3];
   if(subjectName.equalsIgnoreCase("subjectA")) {
      for(int i=0;i<3;i++) {
         subMarks[i] = students[i].subjectA;
      }
   }
   else if(subjectName.equalsIgnoreCase("subjectB")){
         for (int i=0;i<3;i++) {
             subMarks[i]=students[i].subjectC;
         }
   }
   else {
         for(int i=0;i<3;i++) {
            subMarks[i]=students[i].subjectC;
         }
   } 
         return subMarks;
  }
  
  public int subjectATotalByStudents(int[] marks){

      int total=0;

      for(int i=0;i<marks.length;i++){
         total += marks[i];
      }
     return total;
   }
  public int subjectBTotalByStudents(int[] marks){
    int total=0;

      for(int i=0;i<marks.length;i++){
         total += marks[i];
      }
     return total;
   }
  public int subjectCTotalByStudents(int[] marks){
     int total=0;

      for(int i=0;i<marks.length;i++){
         total += marks[i];
      }
     return total;
  }


  public int subjectTotalByStudents(int[] marks){
  int total=0;

      for(int i=0;i<marks.length;i++){
         total += marks[i];
      }
     return total;
   }

  public double subjectAAverageByStudents(int[] marks) {
   int total=0;

      for(int i=0;i<marks.length;i++){
         total += marks[i];
      }
     return total/3;
  }
  public double subjectBAverageByStudents(int[] marks) {
  int total=0;

      for(int i=0;i<marks.length;i++){
         total += marks[i];
      }
     return total/3;}
  public double subjectCAverageByStudents(int[] marks) {

  int total=0;

      for(int i=0;i<marks.length;i++){
         total += marks[i];
      }
     return total/3;}

}

public class Assignment1Q9 {
  public static void main(String[] args){

     int a,b,c,i,n=3;
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter marks of Student1 in subjects A,B,C");
     for(i=0;i<n;i++)
       { a[i]=sc.nextInt();}

     System.out.println("Enter marks of Student2 in subjects A,B,C");
     for(i=0;i<n;i++)
       { b[i]=sc.nextInt();}

     System.out.println("Enter marks of Student1 in subjects A,B,C");
     for(i=0;i<n;i++)
       { c[i]=sc.nextInt();}
    
     Student stud1 = new Student();
     Student stud2 = new Student();
     Student stud3 = new Student();
   
     
  }
}
  