import java.util.*;

class ArmstrongorNot {
    private int num;

    public void getNum(int x) {
        num = x;
    } 

    public boolean armstrongCheck() {
        int n, sum, d;

        n = num; 
        sum = 0;
        while (n > 0) {
            d = n % 10;
            sum += (d * d * d);
            n /= 10;
        }

        if (sum == num) return true;
        else return false;
    }
}

public class Assignment1Q1 {
    public static void main(String[] s) {
        ArmstrongorNot dig = new ArmstrongorNot();
        int n;

        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter number: ");
        n = sc.nextInt();

        dig.getNum(n);
        if (dig.armstrongCheck()) {
            System.out.println(n + " is an Armstrong number.");
        } else {
            System.out.println(n + " is not an Armstrong number.");
        }
    }
}