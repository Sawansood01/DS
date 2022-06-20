class Solution {
    public int findPeakElement(int[] arr) {
       int n = arr.length;
        int max = 0;
        for(int i = 0 ; i< n-1 ; i++)
        {
            if(arr[i] < arr[i+1])
            {
                max = i+1;
            }
        }
        return max;
        }
}