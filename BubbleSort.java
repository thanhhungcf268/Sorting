import java.util.Arrays;

public class BubbleSort {
    static int[] array = {3, 45, 6, 5, 43, 45, 4, 45, 5, 7};
    public static void main(String[] args) {
        System.out.println(Arrays.toString(array));
    }
    static int[] sapXep(int[] array) {
        boolean needNextPass = true;
        for (int k = 1; k < array.length && needNextPass; k++) {
            needNextPass = false;
            for (int i = 0; i < array.length - k; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    needNextPass = true;
                }
            }
        }
        return array;
    }
}
