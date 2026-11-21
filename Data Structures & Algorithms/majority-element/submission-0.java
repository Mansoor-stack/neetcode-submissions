class Solution {
    public int majorityElement(int[] nums) {

        int majority;

        HashMap<Integer, Integer> frequencyCount = new HashMap<>();

        for(int item:nums){

            frequencyCount.put(item, frequencyCount.getOrDefault(item,0)+1);
        }

//         for(Map.Entry<Integer, Integer>  entry : frequencyCount.entrySet()){

//            int value = entry.getValue();
//            //  majority = entry.getValue();

// if(value>(nums.length/2)){

   

// return value;

// }

for(Integer item : frequencyCount.keySet()){

    if(frequencyCount.get(item)>(nums.length/2)){

        majority = item;

        return majority;

    }
}
 return 0;
        }
        
      
    }
