class SingletonInheritanceCheck{
 private static SingletonInheritanceCheck instance=null;
 public String add;
 private SingletonInheritanceCheck() {
   add= "hello";
 }

  public static SingletonInheritanceCheck getInstance(){
    if(instance == null){
         instance = new SingletonInheritanceCheck();
    }

   return instance;
  }
}
public class Assignment2Q1{
  public static void main(String[] args)
   {
   SingletonInheritanceCheck obj1 =SingletonInheritanceCheck.getInstance();
   
   }
}