class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

Arrays.sort(nums);

List<List<Integer>> list1 = new LinkedList<List<Integer>>();
HashSet<List<Integer>> set = new HashSet<>();
for(int i=0;i<nums.length;i++){
    for(int j=i+1;j<nums.length;j++){
        for(int k=j+1;k<nums.length;k++){

            if((nums[i]+nums[j]+nums[k]==0)&& i!=j && j!=k&& i!=k){

List<Integer> list2 = Arrays.asList(nums[i], nums[j], nums[k]);

set.add(list2);

            }
        }
    }


}
   return new LinkedList(set);     
    }
}
