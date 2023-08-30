package arrays;

//importing java.util.Arrays; to use array methods
import java.util.Arrays;

public class ArrayOperations {

    public static void main(String[] args) {
		// Creating an array of type int 
		int[] myArray = {10, 5, 8, 3, 1};

        // Accessing elements
        int firstElement = myArray[0];  // 10
        System.out.println("First Element: " + firstElement);
		        
        // Updating an element
		myArray[2] = 15;  // [10, 5, 15, 3, 1]
		System.out.println("Updated Array: " + Arrays.toString(myArray)); 
		        
           
        // Searching for an element
        int index = -1;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == 3) {
		        index = i;
                break;
            }
        }
        System.out.println("Index of element 3 is " + index);

	    // Sorting the array using Arrays.sort(myArray); 
        Arrays.sort(myArray);
	    System.out.println("Elements of sortes array in ascending order: ");
        for(int k = 0; k < myArray.length; k++){
            System.out.print(myArray[k]);
        }
		        
	    //Reversing an array
	    System.out.println("Reverse Array: ");
	    for(int i=myArray.length-1;i>=0;i--) {
	   	    System.out.println(myArray[i]);
    	}
	}

}
