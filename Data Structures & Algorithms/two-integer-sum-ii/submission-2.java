class Solution {
    public int[] twoSum(int[] numbers, int target) {

int [] resArray = new int[2];
      int i;
      int j=numbers.length-1;

      for(i=0;i<j;){
      int currentSum = numbers[i]+numbers[j];

      if(currentSum>target){
        j--;

      }else if(currentSum<target){

        i++;
      }
      else {

resArray[0]=i+1;
resArray[1]=j+1;

  return resArray;
      }
    



      }

      return new int[0];
    }
}
