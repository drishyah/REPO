import java.util.Comparator;
import java.util.TreeSet;

class Person{
    private String name;
    private int height;
    private double weight;
    public Person() {
    	
    }
	public Person(String name, int height, double weight) {
		super();
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String objValues = "Name: "+name+" Height: "+height+" Weight: "+weight;
		return objValues;
	}
	
	
	
    
}
class compareWH implements Comparator<Person>{

	@Override
	public int compare(Person p1, Person p2) {
		
		if(p1.getWeight()>p2.getWeight()) {
			return 1;
		}else if(p1.getWeight() == p2.getWeight() && p1.getHeight()>p2.getHeight()) {
			return 1;
		}
		else
			return -1;
	}
	
}

public class Assignment3Q1 {
    public static void main(String[] args) {
    	TreeSet<Person> ts = new TreeSet<>(new compareWH());
    	ts.add(new Person("Drishya",162,62.6));
    	ts.add(new Person("Priya",162,55));
    	ts.add(new Person("Prince",158,48.6));
    	ts.add(new Person("Hridya",158,60.2));
    	ts.add(new Person("Rahul",160,52));
    	ts.add(new Person("Sneha",165,80.2));
    	ts.add(new Person("Haridas",160,39));
    	ts.add(new Person("Sindhu",148,50));
    	ts.add(new Person("Bhavya",142,50));
    	ts.add(new Person("Karthik",158,52));
    	for(Person p: ts) {
    		System.out.println(p);
    	}
    	
    }
}