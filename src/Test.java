import java.util.Arrays;



/**
 * CLASS / TYPE DESCRIPTION GOES HERE.
 *
 * @author kjain
 */
public class Test {

    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        // Unsorted array
        Integer[] a = {9, 16, 1, 8, 32,104};

//        // Call merge sort
//        mergeSort(a);
//
//        // Check the output which is sorted array
//        System.out.println(Arrays.toString(a));
//        int[] b = {9, 16, 1, 8, 32,104};
//        mergeSortnew(b);
//        System.out.println(Arrays.toString(b));
        int[] c = new int[] {9, 38,16, 1, 8, 32,104};
        quickSort(c , 0,c.length-1);
      System.out.println(Arrays.toString(c));
      System.out.println("<NULL>".equals("12345678"));
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

        // // Index Position in first array - starting with first element
        // int iFirst = 0;
        //
        // // Index Position in second array - starting with first element
        // int iSecond = 0;
        //
        // // Index Position in merged array - starting with first position
        // int iMerged = 0;
        //
        // // Compare elements at iFirst and iSecond,
        // // and move smaller element at iMerged
        // while (iFirst < first.length && iSecond < second.length)
        // {
        // if (first[iFirst].compareTo(second[iSecond]) < 0)
        // {
        // result[iMerged] = first[iFirst];
        // iFirst++;
        // }
        // else
        // {
        // result[iMerged] = second[iSecond];
        // iSecond++;
        // }
        // iMerged++;
        // }
        //
        //
        // System.arraycopy(first, iFirst, result, iMerged, first.length-iFirst);
        //
        // // copy remaining elements from both halves - each half will have already sorted elements
        // System.arraycopy(first, iFirst, result, iMerged, first.length - iFirst);
        // System.arraycopy(second, iSecond, result, iMerged, second.length - iSecond);
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
    
    public static void quickSort(int[] arr , int low,int high) {
        
        if(arr == null || arr.length == 0) {
            return;
        }
        
        int med = low + (high-low)/2;         
        if (low >= high)
            return;
        
        int i = low;
        int j = high;
        
        while(i <=j) {
            if(arr[i] < arr[med]) {
                i++;
            }
            if(arr[j] > arr[med]) {
                j--;
            }
            
            if(i <=j) {
                int temp =arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
            
        }
        
        if(low < j) {
            quickSort(arr ,low,j) ;
        }
        
        if(high > i) {
            quickSort(arr ,i,high) ; 
        }
        
    }
    
    
    public static void quickSortnew(int[] arr, int low, int high) {
        if (arr == null || arr.length == 0)
            return;
 
        if (low >= high)
            return;
 
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
            quickSort(arr, low, j);
 
        if (high > i)
            quickSort(arr, i, high);
    }


}
