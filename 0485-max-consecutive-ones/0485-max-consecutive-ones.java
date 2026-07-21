class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int temp=0;
       for(int i=0;i<nums.length;i++){
        if(nums[i]==0){
            temp = 0;
        }else{
            temp++;
            count = (count>temp)? count : temp;
        }
       } 
       return count;
    }
}