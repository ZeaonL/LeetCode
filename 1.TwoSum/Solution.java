import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return null;
    }

    public int[] twoSumOther(int[] nums, int target) {
        Map<Integer, Integer> hashtable = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; ++i) {
            if (hashtable.containsKey(target - nums[i])) {
                return new int[]{hashtable.get(target - nums[i]), i};
            }
            hashtable.put(nums[i], i);
        }
        return null;
    }

    public Solution () {
        /*
        本题的目标是，在一个数组中找到两个值的和为target的元素。
        暴力双重循环法可以求解，但是空间复杂度会好一点，时间复杂度比较差，是O(n2)。
        也可以先排序，再求解，那么会进化为O(nlogn)。
        题解中有一个哈希表法，这样可以把时间复杂度退化到O(n)。
        思路也有点稍稍不一样，哈希表先注意循环表中每一个值，然后再找target-x。
        */
    }

    public static void main(String[] args) {
        // System.out.println("Hello Solution!");
        Solution mySolution = new Solution();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        System.out.println(Arrays.toString(mySolution.twoSum(nums, target)));
        System.out.println(Arrays.toString(mySolution.twoSumOther(nums, target)));
    }
}