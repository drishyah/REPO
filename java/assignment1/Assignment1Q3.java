import java.util.*;

class SiCi{
  public double simpleInterest(double principalAmount, int time, double interestRate){
     double si;
     si=(principalAmount*time*interestRate)/100;
     return si;
  
  }
  
  public double compoundInterest(double principalAmount, int time, double interestRate){
      double ci;
      ci=principalAmount*Math.pow(1.0+interestRate/100.0,time)-principalAmount;
      return ci;
  }
  
}

public class Assignment1Q3 {
 public static void main(String[] args) {

    SiCi find1 = new SiCi();
    SiCi find2=new SiCi();
    Scanner sc=new Scanner(System.in);

    double pr,r;
    int t;    
    pr=sc.nextDouble();
    t=sc.nextInt();
    r=sc.nextDouble();

    System.out.println(find1.simpleInterest(pr,t,r));
    System.out.println(find2.compoundInterest(pr,t,r));
    sc.close();
    
  

 }
 
}