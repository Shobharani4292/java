package simple;
import java.util.Scanner;

class Example
{
   private int age;
   public void get()
   {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age:");
        age = sc.nextInt();
        sc.close();
   }

   public void display()
    {
        System.out.println("Age is:"+age);
    }
}
class Main{
  public static void main(String[] args)
  {
    Example ex= new Example();
    ex.get();
    ex.display();
   }
}