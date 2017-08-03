import java.util.Arrays;


/* PROSPER_LEGAL_LEGEND */

/**
 * CLASS / TYPE DESCRIPTION GOES HERE.
 *
 * @author kjain
 */
public class MergeSort {
    
    public static void main(String[] args) {
        Integer[] a = {9, 16, 1, 8, 32,104};

//      // Call merge sort
      mergeSort(a);
//      // Check the output which is sorted array
      System.out.println(Arrays.toString(a));
      int[] b = {9, 16, 1, 8, 32,104};
      mergeSortnew(b);
      System.out.println(Arrays.toString(b));
    }
    
    @SuppressWarnings("rawtypes")
    public static Comparable[] mergeSort(Comparable[] list)
    {
        if (list.length <= 1) {
            return list;
        }

        Comparable[] first = new Comparable[list.length / 2];
        Comparable[] second = new Comparable[list.length - first.length];
        System.arraycopy(list, 0, first, 0, first.length);
        System.arraycopy(list, first.length, second, 0, second.length);

        mergeSort(first);
        mergeSort(second);

        merge(first, second, list);

        return list;
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    private static void merge(Comparable[] first, Comparable[] second, Comparable[] result)
    {

        int iFirst = 0;
        int iSecond = 0;
        int iMerged = 0;

        while (iFirst < first.length && iSecond < second.length) {
            if (first[iFirst].compareTo(second[iSecond]) < 0) {
                result[iMerged] = first[iFirst];
                iFirst++;
            } else {
                result[iMerged] = second[iSecond];
                iSecond++;
            }
            iMerged++;
        }

        System.arraycopy(first, iFirst, result, iMerged, first.length - iFirst);
        System.arraycopy(second, iSecond, result, iMerged, second.length - iSecond);
    }

    public static int[] mergeSortnew(int[] arr) {
        if (arr.length <= 1) {
            return arr;
        }

        int[] leftArr = new int[arr.length / 2];
        int[] rightArr = new int[arr.length - leftArr.length];
        System.arraycopy(arr, 0, leftArr, 0, leftArr.length);
        System.arraycopy(arr, leftArr.length, rightArr, 0, rightArr.length);
        mergeSortnew(leftArr);
        mergeSortnew(rightArr);
        mergeNew(leftArr, rightArr, arr);
        return arr;
    }

    public static void mergeNew(int[] leftArr, int[] rightArr, int[] result) {
        int iFirst = 0;
        int iSecond = 0;
        int iResult = 0;

        while (iFirst < leftArr.length && iSecond < rightArr.length) {
            if (leftArr[iFirst] < rightArr[iSecond]) {
                result[iResult] = leftArr[iFirst];
                iFirst++;
            } else {
                result[iResult] = rightArr[iSecond];
                iSecond++;
            }
            iResult++;
        }
        System.arraycopy(leftArr, iFirst, result, iResult, leftArr.length - iFirst);
        System.arraycopy(rightArr, iSecond, result, iResult, rightArr.length - iSecond);
    }

}
