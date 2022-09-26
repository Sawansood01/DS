class Solution {
    public List<Integer> majorityElement(int[] nums) {
//         int n = nums.length;
//     ArrayList < Integer > ans = new ArrayList < > ();
//     for (int i = 0; i < n; i++) {
//       int cnt = 1;
//       for (int j = i + 1; j < n; j++) {
//         if (nums[j] == nums[i])
//           cnt++;
//       }

//       if (cnt > (n / 3))
//         ans.add(nums[i]);
//     }

//     return ans;
        
    int number1 = -1, number2 = -1, count1 = 0, count2 = 0, len = nums.length;
    for (int i = 0; i < len; i++) {
      if (nums[i] == number1)
        count1++;
      else if (nums[i] == number2)
        count2++;
      else if (count1 == 0) {
        number1 = nums[i];
        count1 = 1;
      } else if (count2 == 0) {
        number2 = nums[i];
        count2 = 1;
      } else {
        count1--;
        count2--;
      }
    }
    ArrayList < Integer > ans = new ArrayList < Integer > ();
    count1 = 0;
    count2 = 0;
    for (int i = 0; i < len; i++) {
      if (nums[i] == number1)
        count1++;
      else if (nums[i] == number2)
        count2++;
    }
    if (count1 > len / 3)
      ans.add(number1);
    if (count2 > len / 3)
      ans.add(number2);
    return ans;
  

    }
}