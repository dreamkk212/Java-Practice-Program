public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer,Integer> num1 = new HashMap<>();
        
    for(int i : nums1) {
        if(num1.containsKey(i)){
            num1.put(i,nums1[1]+1);
        } else{
            num1.put(i,1);
        }
    }
    List<Integer> intersect =  new ArrayList<Integer>();
    for(int i : nums2){
        if(num1.containsKey(i)){
            if(num1.get(i) > 1){
            num1.put(i,num1.get(i)-1);
        }else {
            num1.remove(i);
        }
        intersect.add(i);
    }
    }
    
    int[] result = new int[intersect.size()];
    
    int i = 0;
    while(i <intersect.size()){
        result[i]=intersect.get(i);
        i++;
    }
    return result;
        
    }
}