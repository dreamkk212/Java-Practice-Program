import java.util.HashMap;

/* PROSPER_LEGAL_LEGEND */

/**
 * CLASS / TYPE DESCRIPTION GOES HERE.
 *
 * @author kjain
 */
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> sum = new HashMap<Integer, Integer>();
        int[] indicies = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (sum.containsKey(target - nums[i])) {
                indicies[0] = sum.get(nums[i]);
                indicies[1] = sum.get(target - nums[i]);
                return indicies;
            } else {
                sum.put(nums[i], i);
            }
        }

        return null;

    }
}
