class Solution {
    public int findKthPositive(int[] arr, int k) {
        int n =arr.length, index=0;
        int[] a = new int[10000];
        HashSet <Integer> hs = new HashSet<Integer>();
        for(int i =0;i<n;i++)
        {
            hs.add(arr[i]);
        }
        for(int i =1;i<10000;i++)
        {
            if(!hs.contains(i))
                a[index++]=i;
        }
        return a[k-1];
    }
}
