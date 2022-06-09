class Solution {
    public int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        int top = 0, bottom = n-1, left = 0 , right = n-1;
        int num =1;
        while(top <= bottom && left <= right)
        {
            for( int i = left; i<= right ;i++)
            {
                res[top][i] = num++;
            }
            if( top > bottom || left > right) break;
            top++;
            
            for(int i = top ; i<= bottom;i++)
            {
                res[i][right]= num++;
            }
             if( top > bottom || left > right) break;
            right--;
            
             for(int i = right ; i>= left;i--)
            {
                res[bottom][i]= num++;
            }
             if( top > bottom || left > right) break;
            bottom--;
            
             for(int i = bottom ; i>= top;i--)
            {
                res[i][left]= num++;
            }
             if( top > bottom || left > right) break;
            left++;
        }
        return res;
    }
}