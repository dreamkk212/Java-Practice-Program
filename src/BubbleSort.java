import java.util.Arrays;

/* PROSPER_LEGAL_LEGEND */

/**
 * CLASS / TYPE DESCRIPTION GOES HERE.
 *
 * @author kjain
 */
public class BubbleSort {
    
    private int[] sortNumbersASC(int[] unSortedArray) {

        for (int i = 0; i < unSortedArray.length - 1; i++) {
            for (int j = 1; j < unSortedArray.length - i; j++) {
                if (unSortedArray[j-1] > unSortedArray[j]) {
                    int temp = unSortedArray[j-1];
                    unSortedArray[j-1] = unSortedArray[j];
                    unSortedArray[j] = temp;
                }
            }
            System.out.println("Iteration " + (i + 1) + ": " + Arrays.toString(unSortedArray));
        }
        return unSortedArray;
    }
    
    private int[] sortNumbersDSC(int[] unSortedArray) {

        for (int i = 0; i < unSortedArray.length - 1; i++) {
            for (int j = 1; j < unSortedArray.length - i; j++) {
                if (unSortedArray[j-1] < unSortedArray[j]) {
                    int temp = unSortedArray[j-1];
                    unSortedArray[j-1] = unSortedArray[j];
                    unSortedArray[j] = temp;
                }
            }
            System.out.println("Iteration " + (i + 1) + ": " + Arrays.toString(unSortedArray));
        }
        return unSortedArray;
    }
    
    private int[] sortNumbersAsc(int[] unsortedArray) {
        
        for(int i=0;i< unsortedArray.length -1 ; i++) {
            for(int j=1; j < unsortedArray.length-i; j++) {
                if(unsortedArray[j-1] > unsortedArray[j]) {
                    unsortedArray[j-1] = unsortedArray[j-1] ^ unsortedArray[j];
                    unsortedArray[j] = unsortedArray[j-1] ^ unsortedArray[j];
                    unsortedArray[j-1] = unsortedArray[j-1] ^ unsortedArray[j];
                }
            }
            System.out.println("Iteration " + (i + 1) + ": " + Arrays.toString(unsortedArray));
        }
        
        return unsortedArray;
    }

    public static void main(String[] args) {
        BubbleSort bbSort = new BubbleSort();
        System.out.println("ASC" + Arrays.toString(bbSort.sortNumbersASC(new int[] {9, 4, 7, 2, 1, 7, 3, 18, 16, 12, 15})));
        System.out.println("DSC" + Arrays.toString(bbSort.sortNumbersDSC(new int[] {9, 4, 7, 2, 1, 7, 3, 18, 16, 12, 15})));
        System.out.println("ASC" + Arrays.toString(bbSort.sortNumbersAsc(new int[] {9, 4, 7, 2, 1, 7, 3, 18, 16, 12, 15})));
    }
    
}
