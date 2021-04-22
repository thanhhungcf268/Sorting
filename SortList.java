import java.util.Arrays;

public class SortList {
    static int[] array = {1,2,2,87,32,6,3};
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sotList(array)));
    }
    public static int[] sotList(int[] array){
        for (int i=0;i<array.length;i++){
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
            System.out.println(Arrays.toString(array) + " sort lần  : " +i);}

        return array;
    }
}
