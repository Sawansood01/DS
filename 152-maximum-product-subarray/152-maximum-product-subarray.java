class Solution {
    public int maxProduct(int[] A ) {
         if (A.length == 0) return 0;
 int prod1 = A[0],prod2 = A[0],result = A[0];
    
    for(int i=1;i<A.length;i++) {
        int temp = Math.max(A[i],Math.max(prod1*A[i],prod2*A[i]));
        prod2 = Math.min(A[i],Math.min(prod1*A[i],prod2*A[i]));
        prod1 = temp;
        
        result = Math.max(result,prod1);
    }
    
    return result;
        
        
     
        // int p = A[0], max=A[0];
        // for(int i = 0;i< A.length; i++)
        // {
        //     for(int j = i+1 ; j< A.length -1 ; j++)
        //     {
        //         p = A[i]*A[j];
        //         max = Math.max(p, max);
        //     }
        // }
        // return max;
    }
    
}