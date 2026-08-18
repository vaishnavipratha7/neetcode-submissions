class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int low = 0, high = numbers.length - 1;
       
        while(low <= high){
           int curSum = numbers[low] + numbers[high];
           if(curSum > target){
            high--;
           }
           else if(curSum < target){
            low++;
           }
           else{
            return new int[]{low + 1, high + 1};
           }
        }

        return new int[0];
        
    }
    
}

