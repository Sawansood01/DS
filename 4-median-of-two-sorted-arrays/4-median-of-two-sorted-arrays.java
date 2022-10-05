class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n =nums1.length;
        int m= nums2.length;
        int[] res = new int[n+m];
        int i=0,j=0,k=0;
        while(i<nums1.length && j<nums2.length )
        {
        if(nums1[i]<nums2[j])
        {
            res[k]=nums1[i];
                    i++;k++;
        }
            else
            {
                res[k]=nums2[j];
                j++;
                k++;
            }
        }
        while(nums1.length> i)
        {
            res[k]=nums1[i];
            i++;
            k++;
        }
           while(nums2.length> j)
        {
            res[k]=nums2[j];
            j++;
            k++;
        }
       
        double median =0;
    int mid =res.length/2;
        if(res.length%2 == 1)
            median =res[mid];
        else{
            median =(res[mid]+res[mid-1])/2.0;
        }

    return median;
    }
}
//          int o=res.length;
//         if(o%2!=0)
//         {
//             return (double)res[o/2];
//         }
//         else
//    return (double)(res[(o-1)/2] + res[o/2])/2.0;
            
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
