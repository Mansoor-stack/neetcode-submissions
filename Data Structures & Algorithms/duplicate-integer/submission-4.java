class Solution {
    public boolean hasDuplicate(int[] nums) {

        List<Integer> list = new LinkedList<Integer>();

        for(int item: nums){
            list.add(item);
        }

        Set<Integer> set = new HashSet<Integer>(list);
 
 if(list.size()!=set.size()){

    return true;

 }

 return false;
    }
}
