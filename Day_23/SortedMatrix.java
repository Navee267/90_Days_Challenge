class SortedMatrix {
    public int countNegatives(int[][] grid) {
        int rows = grid.length;
        int row = 0;
        int cols = grid[0].length;
        int col = cols-1;
        int count = 0;

        while(row < rows && col >= 0){
            if(grid[row][col] <0){
                count += rows - row;
                col --;
            }
            else{
                row ++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        SortedMatrix obj = new SortedMatrix();
        int[][] arr = {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
        int res = obj.countNegatives(arr);
        System.out.println(res);
    }
}