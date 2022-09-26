class Solution {
    public void rotate(int[][] a) {
        //transpose
        int n = a.length;
        for(int i = 0;i<n ; i++)
            {
                for(int j = i;j<n;j++)
                {
                    int temp = a[i][j];
                    a[i][j] = a[j][i];
                    a[j][i] = temp;
                }
            }
    
        
            
            //now reverse
            for(int i =0;i<n;i++)
            {
                int li = 0;  // left index
                int ri = a[i].length-1;  //right index
                while(li < ri)
                {
                    int temp = a[i][li];
                    a[i][li] = a[i][ri];
                    a[i][ri] = temp;
                    li++;
                    ri--;
                }
            }
        }
    }


