import java.util.Arrays;
import java.util.Collections;

/* PROSPER_LEGAL_LEGEND */

/**
 * CLASS / TYPE DESCRIPTION GOES HERE.
 *
 * @author kjain
 */
public class SelectionSort {

    private static Integer[] insertionSortASC(Integer[] num) {
        int j , i ;
        
        for(j=0; j < num.length -1 ; j++) {
         int iMin =j;
         
         for(i=j+1 ; i < num.length; i++) {
             if(num[i] < num[iMin]) {
                 iMin=i;
             }
         }
            
         if(iMin != j) {
             num[iMin] = num[iMin] ^ num[j];
             num[j] = num[iMin] ^ num[j];
             num[iMin] = num[iMin] ^ num[j];
         }
            
        }
        
//        for (j = 0; j < num.length-1; j++) 
//        {
//          /* find the min element in the unsorted a[j .. n-1] */
//
//          /* assume the min is the first element */
//          int iMin = j;
//          /* test against elements after j to find the smallest */
//          for (i = j+1; i < num.length; i++) {
//              /* if this element is less, then it is the new minimum */
//              if (num[i] < num[iMin]) {
//                  /* found new minimum; remember its index */
//                  iMin = i;
//              }
//          }
//
//          if(iMin != j) 
//          {
//            num[iMin] = num[iMin] ^ num[j];
//            num[j] = num[iMin] ^ num[j];
//            num[iMin] = num[iMin] ^ num[j];
//          }
//      }

        return num;
    }
    
    

    public static void main(String[] args) {
        Integer num[] = {1, 80, 96, 15, 23, 2, 4, 90, 76, 82};
        System.out.println("insertionSortASC" + Arrays.toString(insertionSortASC(num)));
    }
}
