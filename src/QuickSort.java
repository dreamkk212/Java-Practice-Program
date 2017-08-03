import java.util.Arrays;


/* PROSPER_LEGAL_LEGEND */

/**
 * CLASS / TYPE DESCRIPTION GOES HERE.
 *
 * @author kjain
 */
public class QuickSort {
    public static Integer[] quickSortnew(Integer[] arr, int low, int high) {
        if (arr == null || arr.length == 0)
            return arr;
 
        if (low >= high)
            return arr;
 
        // pick the pivot
        int middle = low + (high - low) / 2;
        int pivot = arr[middle];
 
        // make left < pivot and right > pivot
        int i = low, j = high;
        while (i <= j) {
            while (arr[i] < pivot) {
                i++;
            }
 
            while (arr[j] > pivot) {
                j--;
            }
 
            if (i <= j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
 
        // recursively sort two sub parts
        if (low < j)
            quickSortnew(arr, low, j);
 
        if (high > i)
            quickSortnew(arr, i, high);
        
        return arr;
    }
    
    public static void main(String[] args) {
        Integer[] a = {1,2,98,76,84,65,23,10,2,1};
        System.out.println(Arrays.toString(quickSortnew(a,0,a.length-1)));
    }
}
