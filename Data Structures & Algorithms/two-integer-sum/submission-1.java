class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> mapping = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {

            mapping.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];

            if (mapping.containsKey(diff) && mapping.get(diff) != i) {
                return new int[] { i, mapping.get(diff) };
            }

        }

        return new int[] {};

    }
}