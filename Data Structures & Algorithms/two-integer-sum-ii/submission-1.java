class Solution {
    public int[] twoSum(int[] numbers, int target) {

        int [] resArray = new int[2];

        for (int i=0;i<numbers.length;i++){

            for (int j=i+1;j<numbers.length;j++){

if((numbers[i]+numbers[j]==target) && numbers[i]!=numbers[j] && numbers[i]<numbers[j]){

    resArray[0]=i+1;
    resArray[1]=j+1;
}


            }
        }
        return resArray;
    }
}
