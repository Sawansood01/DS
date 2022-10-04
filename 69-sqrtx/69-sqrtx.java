class Solution {
    public int mySqrt(int x) {
        // int l=1,r =x;
        // int res=0;
        // while(l <= r){
        // int mid =l+(r-l)/2;
        // if(mid*mid < x)
        // {
        //     res=mid;
        //     l=mid+1;
        // }
        // else if(mid*mid > x)
        // {
        //     r=mid-1;
        // }
        // else
        // {
        //     return (int)mid;
        // }
        // }
        // return (int)res;
        
        
        return (int)Math.sqrt(x);
        
      //   long r =x;
      // while(r*r >x)
      // {
      //    r=(r+x/r)/2;
      // }  
      //   return (int)r;
    }
}
  