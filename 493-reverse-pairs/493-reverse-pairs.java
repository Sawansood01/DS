class Solution {
     public int reversePairs(int[] nums) {
        return mergeSort(nums, 0 , nums.length-1);
    }
    // merge sort modified
    private int mergeSort(int[] nums, int start, int end){
        if(start>=end)
            return 0;
        int mid = start + (end-start)/2;
        int reversePairs = 0;
        reversePairs += mergeSort(nums, start, mid);
        reversePairs += mergeSort(nums, mid+1, end);
        reversePairs += merge(nums, start, mid, end);
        return reversePairs;
    }
    
    private int merge(int[] nums, int start, int mid, int end){
        int n1 = mid - start + 1;
        int n2 = end - mid;
        long nums1[] = new long[n1+1];
        nums1[n1] = Long.MAX_VALUE;
        long nums2[] = new long[n2+1];
        nums2[n2] = Integer.MAX_VALUE;
        for(int i=0; i<n1; i++)
            nums1[i] = nums[i+start];
        for(int j=0; j<n2; j++)
            nums2[j] = nums[mid+1+j];
        
        // Here comes our logic to count pairs
        int count=0;
        int i=0, j=0;
        for(i=0; i<n1; i++){
            while(j<n2 && nums1[i]>(2*nums2[j])){
                j++;
            }
            count += j;
        }
        // Logic Ends
        
        i=0;
        j=0;
        // now, putting element in sorted array in original array
        for(int k=start; k<=end; k++){
            if(nums1[i]<=nums2[j]){
                nums[k] = (int)nums1[i++];
            } else {
                nums[k] = (int)nums2[j++];
            }
        }
        
        return count;
    }
    
}

 //// Does not works for some long value cases
//          int count = 0;
//         for (int i = 0; i < arr.length; i++)
//             for (int j = i+1; j < arr.length; j++)
//                 if ((long)arr[i] > (long)2 * arr[j])    // 21,47,483,647, which is max value of int, was given in some test cases
//                     count++;
//         return count;
//     }
// }