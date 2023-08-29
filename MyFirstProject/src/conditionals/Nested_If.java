package conditionals;

import java.util.Scanner;

public class Nested_If {
    public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		num = sc.nextInt();
		if(num >= 10)
		{
			if(num%2==0)
			{
				System.out.println(num+ " is an even number");
			}
			else
			{
				System.out.println(num+ " is not an even number");
			}
		}
		else
		{
			System.out.println(num+ " is less than 10");
		}
        sc.close();
	}
   
}
