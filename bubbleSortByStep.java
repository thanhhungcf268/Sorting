public class bubbleSortByStep {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        bubbleSortByStep(array);
    }
    public static void bubbleSortByStep(int[] array) {
        boolean needNextPass = true;
        for (int i = 1; i < array.length; i++) {
            needNextPass = false;
            for (int j = 0; j < array.length - i; j++) {
                if (array[j] > array[j + 1]) {
                    System.out.println(" Swap " + array[j] + " with " + array[j + 1]);
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    needNextPass = true;
                }
            }
            if (!needNextPass){
                System.out.println("Array may be sorted and next pass not needed");
            break;
            }
            System.out.println(" array after the " + i +" sort : ");
            for (int j : array) {
                System.out.println(j + " \t ");
            }
            System.out.println();
        }
    }
}
