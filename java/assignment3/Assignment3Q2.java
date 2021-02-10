import java.util.HashSet;
import java.util.LinkedHashSet;

public class Assignment3Q2 {
    public static void main(String[] args) {
    	
    	
    	System.out.println("LinkedHashSet------------\n");
    	LinkedHashSet<String> lh = new LinkedHashSet<String>();
    	lh.add("A");
    	lh.add("B");
    	LinkedHashSet<String> lhs = ordered(lh);
    	lhs.stream().forEach(i->System.out.println(i));
    	
    	
    	System.out.println("\nHashSet------------------\n");
    	HashSet<String> hs = new HashSet<String>();
    	hs.add("Hridya");
    	hs.add("Adil");
    	HashSet<String> hs2 = unordered(hs);
    	hs2.stream().forEach(i->System.out.println(i));
    	
    }
    public static LinkedHashSet<String> ordered(LinkedHashSet<String> linkedHashSet){
    	linkedHashSet.add("C");
    	linkedHashSet.add("D");
		return linkedHashSet; 
    }
    public static HashSet<String> unordered(HashSet<String> hashSet){
    	hashSet.add("Mohanlal");
    	hashSet.add("Haridas");
		return hashSet;
    }
}