class Solution {
    public int numberOfSteps(int num) {
//         int r=0;
//         int c=0;
//         while(num != 0)
//         {
//             c++;
//             if(num%2 == 0)
//                 num=num/2;
//             else
//             {
//                 num=num-1;
//             }
//         }
//         return c;
//     }
// }


int count=0;

while(num != 0)
{
    count++;
    if(num%2 == 0)
        num /= 2;
    else
        num -= 1;
    
}
return count;
}
}