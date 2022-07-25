class Solution {
    public int maxProduct(int[] A ) {
         if (A.length == 0) return 0;
   int max = A[0], min = A[0], totalMax = A[0];
   for (int i = 1; i < A.length; i++) {
       int tempMax = A[i] * max;
       int tempMin = A[i] * min;
       max = Math.max(Math.max(tempMax,tempMin), A[i]);
       min = Math.min(Math.min(tempMax,tempMin), A[i]);
       totalMax = Math.max(totalMax, max);
   }
   return totalMax;
}
        
        
//         if(nums.length == 1)
//             return nums[0];
//         int p = 1 , mp =0;
//         for(int i =0;i<nums.length-1;i++)
//         {
//             p *= nums[i];
//             if(p > mp)
//             {
//                 mp = p;
//             }
           
//         }
//         return mp;
    
}