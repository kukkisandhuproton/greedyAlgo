class Solution {
    public int jump(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        int currentreach = 0;
        int jump = 0;
        int currentmax = 0;

        for(int i=0;i<nums.length-1;i++){
            currentmax = Math.max(currentmax,nums[i]+i);
            if(i == currentreach){
                jump++;
                currentreach=currentmax;
            }
        }
        return jump;
    }
}

/*
For greedy algorithm check the jump to the maximum and then go back and check if previous ones effect the current reach.
Check if i == current reach then increase jump and make current reach equals current max. 
Where check nums[i]+i -> jump check if the jump is possible.
No need for checking last element in the array as it is already there.
*/
