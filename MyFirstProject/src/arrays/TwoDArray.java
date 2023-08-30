package arrays;

//Two dimentional array example
public class TwoDArray {
    public static void main(String[] args) {
        int rows = 5;
        int cols = 4;
 
        int[][] array = new int[rows][cols];
        
        //Storing value in arrray
        int value = 1;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = value;
                value++;
            }
        }
 
        System.out.println("The formed 2D array is ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(array[i][j] + "  ");
            }
            System.out.println();
        }
    }

    
}
