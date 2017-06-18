public class SearchforaRange {
    public int[] searchRange(int[] nums, int target) {
      int[] result = {-1,-1};
        if(nums == null || nums.length == 0){
            return result;
        }
      result = binarySearch(nums,0 , nums.length-1, target,result);
      return result;  
    }
    
    private int[] binarySearch(int[] nums,int left , int right,int target,int[] result) {
       if(right < left) {
           return result;
       }
       
       if(nums[left]==nums[right] && nums[left] == target){
           result[0]=left;
           result[1]=right;
           return result;
       }
       int mid = (left+right)/2;    
        
       if(nums[mid] < target ){
            binarySearch(nums,mid+1 , right, target,result);
        } else if(nums[mid] > target){
            binarySearch(nums,left , mid-1, target,result);
        } else {
            result[0]=mid;
            result[1]=mid;
            
            //handle left duplicates
            int t1=mid;
            while(t1 > left && nums[t1]==nums[t1-1]) {
               t1--; 
                result[0]=t1;
            }
            
            //handle right duplicates
            int t2=mid;
            while(t2 < right && nums[t2]==nums[t2+1]) {
               t1++; 
                result[1]=t2;
            }
            
        }
        return result;
    }
}