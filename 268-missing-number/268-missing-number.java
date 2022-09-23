class Solution {
    public int missingNumber(int[] nums) {
//        HashSet<Integer> hs = new HashSet<>();
//         int[] res = new int[10000];
//         int index=0;
//         for(int i =0;i < nums.length; i++)
//         {
//             hs.add(nums[i]);
//         }
//         for(int i =0;i<10000;i++)
//         {
//             if(!hs.contains(i))
//             {
//                 res[index++]=i;
//             }
//         }
//         return res[0];
//     }
// }
        Arrays.sort(nums);
        int n = 0;
        for(int i =0;i<nums.length;i++)
        {
            if(nums[i] == n)
                n++;
        }
        return n;
    }
}