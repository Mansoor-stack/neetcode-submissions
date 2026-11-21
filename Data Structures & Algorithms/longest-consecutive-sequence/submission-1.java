class Solution {
    public int longestConsecutive(int[] nums) {

int longest=0;
        HashSet<Integer> removeDuplicates = new HashSet<>();

        for (int num:nums){
            removeDuplicates.add(num);
        }

        for(int item : nums){

int sequenceLength=0; int currNum = item;
if(!removeDuplicates.contains(item-1)){
            while(removeDuplicates.contains(currNum)){

                sequenceLength++;
                currNum++;


            }

            longest = Math.max(longest,sequenceLength);



        }
        }
        return longest;
        
    }
}
