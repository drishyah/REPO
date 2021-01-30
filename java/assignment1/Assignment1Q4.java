import java.util.*;

class ResultDeclaration{
    public String declareResults( double subject1Marks, double subject2Marks, double subject3Marks) {
    	
    
    	if((subject1Marks>=60 && subject2Marks>=60) || (subject2Marks>=60 && subject3Marks>=60) || (subject3Marks>60 && subject1Marks>60)) {
    		if((subject1Marks>60 && subject2Marks>60) ||(subject2Marks>60 && subject3Marks>60) ||(subject3Marks>60 && subject1Marks>60)) {
    			return "passed \n promoted";
    		}else {
    			return "passed";
    		}
    	}else {
    		return "failed";
    	}
    	
    }
}
public class Assignment1Q4 {
    public static void main(String[] args) {
    	ResultDeclaration rd = new ResultDeclaration();
    	Scanner sc = new Scanner(System.in);
    	double s1,s2,s3;
        System.out.println("Enter subject1 marks");
    	s1 = sc.nextDouble();
        System.out.println("Enter subject2 marks");
    	s2 = sc.nextDouble();
        System.out.println("Enter subject3 marks");
    	s3 = sc.nextDouble();
    	System.out.print(rd.declareResults(s1, s2, s3));
    	sc.close();
    }
    
}