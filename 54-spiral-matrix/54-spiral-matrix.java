class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
     int top =0 , bottom = matrix.length-1, left =0, right= matrix[0].length-1;
        ArrayList<Integer> res = new ArrayList<Integer>();
        while(top<=bottom && left <= right)
        {
        for(int i =left;i<=right;i++)
        {
           res.add(matrix[top][i]);
        }
              if(left > right || top > bottom) break;
            
            top++;
            for(int i =top;i<=bottom;i++)
            {
                res.add(matrix[i][right]);
            }
             if(left > right || top > bottom) break;
            right--;
            for(int i =right;i>= left;i--)
            {
                res.add(matrix[bottom][i]);
            }
            if(left > right || top > bottom) break;
            bottom--;
            for(int i =bottom;i>= top;i--)
            {
                res.add(matrix[i][left]);
            }  if(left > right || top > bottom) break;
            left++;
        }
            return res;
    }
    }
        
        
        
        
        
        
        
        
        
        
        
        
        
        