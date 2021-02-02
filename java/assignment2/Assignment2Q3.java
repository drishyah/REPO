import java.util.ArrayList;

class CurrentAccount extends Assignment2Q3 {
    int totDep = 10000;
    int creditLimit = 2000;
    @Override
    public int getCash() {
    	int withdrawalCash = totDep - creditLimit;
    	return withdrawalCash;
    }
}
class SavingsAccount extends Assignment2Q3 {
    int totDep = 10000;
    int fixDepAmount = 5000;
    @Override
    public int getCash() {
    	int withdrawalCash = totDeposits + fixDepAmount;
    	return withdrawalCash;
    }
}
public class Assignment2Q3 {
	int cashInBank = 0;
    public int totalCashInBank(ArrayList<Integer> cash){
    	int totCash = 0;
    	for(int i : cash) {
    		totCash += i;
    	}
    	cashInBank = totCash;
    	return totCash;
    }
    public int getCash(){
    	
    	return 0;
    }
    public static void main(String[] args) {
    	
    }
}