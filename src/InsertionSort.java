import java.util.Arrays;

/* PROSPER_LEGAL_LEGEND */

/**
 * CLASS / TYPE DESCRIPTION GOES HERE.
 *
 * @author kjain
 */
public class InsertionSort {

    private static int[] insertionSortASC(int[] num) {

        int key;
        int j;
        for (int i = 1; i < num.length; i++) {
            key = num[i];
            for (j = i - 1; (j >= 0 && num[j] > key); j--) {
                num[j + 1] = num[j];
            }
            num[j + 1] = key;
            System.out.println(Arrays.toString(num));
        }

        return num;
    }
    
    private static int[] insertionSortDSC(int[] num) {

        int key;
        int j;
        for (int i = 1; i < num.length; i++) {
            key = num[i];
            for (j = i - 1; (j >= 0 && num[j] < key); j--) {
                num[j + 1] = num[j];
            }
            num[j + 1] = key;
            System.out.println(Arrays.toString(num));
        }

        return num;
    }

    public static void main(String[] args) {
        int num[] = {1, 80, 96, 15, 23, 2, 4, 90, 76, 82};
        System.out.println("insertionSortASC" + Arrays.toString(insertionSortASC(num)));
        System.out.println("insertionSortDSC" + Arrays.toString(insertionSortDSC(num)));
    }
}
