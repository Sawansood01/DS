class Solution {
    public int findDuplicate(int[] nums) {
          int arr[]= new int[nums.length+1], i=0;
        for(i=0;i<nums.length;i++)
        {
         arr[nums[i]]=arr[nums[i]]+1;  
            if(arr[nums[i]]==2)
            {
               return nums[i];
            }
        } 
        return 0;
    }
}
