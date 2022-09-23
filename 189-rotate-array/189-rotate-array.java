class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        reverse(nums , 0 , n-1); // this will reverse full array first  5,4,3,2,1
          reverse(nums , 0 , k-1);  // reverse 0 to k-1 ,k = 3  3,4,5,2,1
         reverse(nums , k , n-1);  // reverse k to n-1 3,4,5,1,2
    }
        public void reverse(int[] nums , int start , int end)
        {
            while(start < end)
            {
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;
                end--;
            }
        }
        
}     
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
