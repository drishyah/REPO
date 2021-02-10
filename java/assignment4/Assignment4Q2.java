
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

@FunctionalInterface
interface satisfied{
	public ArrayList<Assignment4Q2> getList(ArrayList<Assignment4Q2> ord);
}

public class Assignment4Q2 {

    private int totalPrice;
    private String status;
    

    public Assignment4Q2(int totalPrice, String status) {
		super();
		this.totalPrice = totalPrice;
		this.status = status;
	}
	public int getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	@Override
	public String toString() {
		return "Assignment4Q2 [totalPrice=" + totalPrice + ", status=" + status + "]";
	}
	public static ArrayList<Assignment4Q2> listOfOrders(ArrayList<Assignment4Q2> orders) {
    	satisfied st = (list)->{
    		ArrayList<Assignment4Q2> list2 = new ArrayList<>();
    		for(Assignment4Q2 ob: list) {
    			if((ob.getTotalPrice() > 10000) && (ob.getStatus().equals("ACCEPTED") || ob.getStatus().equals("COMPLETED") )) {
    				list2.add(ob);
    			}
    		}
    		return list2;
    		};
    	
    		Iterator<Assignment4Q2> it = list.iterator();
    		while(it.hasNext()) {
    			Assignment4Q2 obj = it.next();
    			if((obj.getTotalPrice() > 10000) && (obj.getStatus().equals("ACCEPTED") || obj.getStatus().equals("COMPLETED") )) {
    				list2.add(obj);
    			}
    		}
    		return list2;
    	};
    	ArrayList<Assignment4Q2> lis = st.getList(orders);
    	
    	return lis;
    }
	
    public static void main(String[] args) {
    	Assignment4Q2 o1 = new Assignment4Q2(10020,"ACCEPTED");
    	Assignment4Q2 o2 = new Assignment4Q2(8000,"COMPLETED");
    	Assignment4Q2 o3 = new Assignment4Q2(12000,"ACCEPTED");
    	Assignment4Q2 o4 = new Assignment4Q2(120,"ACCEPTED");
    	Assignment4Q2 o5 = new Assignment4Q2(60000,"COMPLETED");
    	Assignment4Q2 o6 = new Assignment4Q2(1230,"ACCEPTED");
    	Assignment4Q2 o7 = new Assignment4Q2(10002,"ACCEPTED");
    	Assignment4Q2 o8 = new Assignment4Q2(11000,"PROCESSING");
    	Assignment4Q2 o9 = new Assignment4Q2(200,"ACCEPTED");
    	Assignment4Q2 o10 = new Assignment4Q2(3153,"ACCEPTED");
    	Assignment4Q2 o11 = new Assignment4Q2(6464,"ACCEPTED");
    	Assignment4Q2 o12 = new Assignment4Q2(10020,"CANCELLED");
    	Assignment4Q2 o13 = new Assignment4Q2(564587,"COMPLETED"); 
    	Assignment4Q2 o14 = new Assignment4Q2(10020,"ACCEPTED");
    	ArrayList<Assignment4Q2> ords = new ArrayList<Assignment4Q2>();
    	ords.add(o1);
    	ords.add(o2);
    	ords.add(o3);
    	ords.add(o4);
    	ords.add(o5);
    	ords.add(o6);
    	ords.add(o7);
    	ords.add(o8);
    	ords.add(o9);
    	ords.add(o10);
    	ords.add(o11);
    	ords.add(o12);
    	ords.add(o13);
    	ords.add(o14);
    	ArrayList<Assignment4Q2> ords2 = listOfOrders(ords);
    	for(Assignment4Q2 ob : ords2) {
    		System.out.println(ob);
    	}
    }
}