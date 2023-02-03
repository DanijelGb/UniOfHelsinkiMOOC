import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        
        int[] numbers = {6, 5, 3, 0, 1, 2, 4};
        MainProgram.sort(numbers);
    }
    public static int smallest(int[] array) {
        
        int smallz = 110;
        for (Integer small: array) {
            if (small < smallz) {
                smallz = small;
            }
        }
        return smallz;
    }
    public static int indexOfSmallest(int[] numbers){
        int smallz = 110;
        int index = -1;
        for (Integer small: numbers) {
            if (small < smallz) {
                smallz = small;
            }
        }
        for (Integer smalls: numbers) {
            index++;
            if (smalls == smallz) {
                break;
            }
        }
        return index;
    }
    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int min_el = startIndex;
        for (int i = startIndex + 1; i < table.length; i++) {
             if (table[i] < table[min_el]) {
                min_el = i;
            }
        }
        return min_el;
    }
    public static void swap(int[] array, int index1, int index2) {
        int replace = array[index2];
        
        array[index2] = array[index1];
        array[index1] = replace;
    }
    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int f = MainProgram.indexOfSmallestFrom(array, i);
            MainProgram.swap(array, f, i);
            System.out.println(Arrays.toString(array));
        }
    }
}
