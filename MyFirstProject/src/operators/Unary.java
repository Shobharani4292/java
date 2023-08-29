package operators;

public class Unary {
   public static void main(String[] args)
   {
        int x = 10, y = 20;
        int m = 15, n = 21;
        System.out.println("Value of x before incrementing is "+x);
        x++;
        System.out.println("Post increment value of x is "+x);
        System.out.println("Value of y before incrementing is "+y);
        ++y;
        System.out.println("Pre increment value of y is "+y);

        System.out.println("Value of m before decrementing is "+m);
        m--;
        System.out.println("Value of m after post-decrement is "+m);

        System.out.println("Value of m before decrementing is "+n);
        --n;
        System.out.println("Value of m after pre-decrement is "+n);

   } 
    
}
