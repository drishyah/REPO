import java.util.ArrayList;
import java.util.ListIterator;

public class Assignment3Q3 {
      
  public static void main(String[] args) {
     ArrayList<String> aList = new ArrayList<String>();
     aList.add("A");
     aList.add("B");
     aList.add("C");
     aList.add("D");
  
     ListIterator<String> list = aList.listIterator();
     while(list.hasNext()) {
      list.next();
     }
     while(list.hasPrevious()) {
        System.out.println(list.previous()); 
     }
  }
}

