import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {5, 8, 1, 6, 3};
        bubbleSortWithLogging(array);
    }

    public static void bubbleSortWithLogging(int[] array) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("log.txt"))) {
            boolean swapped;
            int n = array.length;
            for (int i = 0; i < n - 1; i++) {
                swapped = false;
                for (int j = 0; j < n - i - 1; j++) {
                    if (array[j] > array[j + 1]) {
                        int temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                        swapped = true;
                    }
                }
                writer.write(Arrays.toString(array) + "\n");
                if (!swapped) {
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
