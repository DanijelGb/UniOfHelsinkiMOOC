
public class ArrayPrinter {

    public static void main(String[] args) {
        // You can test your method here
        int[] array = {5, 1, 3, 4, 2};
        printNeatly(array);
    }

    public static void printNeatly(int[] array) {
        
        for (int i = 0; i < array.length; i++) {
           for (int j = 0; j < array[i]; j++) {
                System.out.print("*");
        }
        System.out.println("");
        }
    }
}
