import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> numMap = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int complement = target - num;
            if (numMap.containsKey(complement)) {
                return new int[]{numMap.get(complement), i};
            }
            
            
            numMap.put(num, i);
        }
        
        return new int[]{};
    }
}