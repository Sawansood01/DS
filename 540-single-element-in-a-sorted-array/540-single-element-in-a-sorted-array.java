class Solution {
    public int singleNonDuplicate(int[] nums) {
        // int left = 0, right = nums.length-1;
        // while(left < right){
        //     int mid = (left + right)/2;
        //     if( (mid % 2 == 0 && nums[mid] == nums[mid +1]) || (mid %2 == 1 && nums[mid] == nums[mid - 1]) )
        //         left = mid + 1;
        //     else
        //         right = mid;
        // }
        // return nums[left];
        int res =0;
        if(nums.length == 1)
            return 1;
        for(int i =1 ;i<nums.length-1; i=i+2)
        {
            if(nums[i] != nums[i-1])
            {
                return nums[i-1];
            }
        }
        return nums[nums.length-1];
    }   
}