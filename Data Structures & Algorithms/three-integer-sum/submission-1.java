class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> list = new LinkedList<>();


Arrays.sort(nums);

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i=0;i<nums.length;i++){
            map.put(nums[i], i);

        }


HashSet<String> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            for (int j=i+1;j<nums.length;j++){

                int kNum = (nums[i]+nums[j]);

                if(map.containsKey(-(kNum))){


int kIndex = map.get(-kNum);

                    if((set.add(nums[i]+":"+nums[j]+":"+nums[kIndex]))&& kIndex>j && kIndex>i){


list.add(Arrays.asList(nums[i], nums[j], nums[kIndex]));

                    }



                }
            }
        }
return list;
    }
}




