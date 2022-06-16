class Solution {
    public int searchInsert(int[] nums, int target) {
//         int n =nums.length;
//         int res=0;
//         if(nums[n-1] < target)
//             return n;
        
//         for(int i =0;i<n-1;i++)
//         {
//             if(nums[i] < target && nums[i+1]> target || nums[i] == target)
//                 res=i;
           
//         }
//         return res;
//     }
// }
        int l =0;
        int r= nums.length-1;
       int res =0 ;
     while(l <= r)
     {
         int mid = l+(r-l)/2;
         if(nums[mid] == target)
             return mid;
         else if(nums[mid] > target)
             r--;
         else
             l++;
     }
        return l;
    }
}