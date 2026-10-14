class Solution {
    public int uniquePaths(int m, int n) {
        // if(m==1 && n==1) return 1;
        // if(m==0 || n==0) return 0;
        // int right= uniquePaths(m,n-1);
        // int left=uniquePaths(m-1,n);
        // return right+left;
//total number of paths is unchanged when the dimensions are swapped.
int [][] grid=new int[n][m];
for(int i=0;i<n;i++){
    for(int j=0;j<m;j++){
        if(i==0) grid[0][j]=1;
        if(j==0) grid[i][0]=1;
        if(i!=0 && j!=0){
            int down=grid[i-1][j];
            int right=grid[i][j-1];
            grid[i][j]=down+right;
        } 
    }
}       
return grid[n-1][m-1];
        
    }
}