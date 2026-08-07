class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int min=0;
        int max=matrix.length-1;
        while(min<=max){
            int mid=min+(max-min)/2;
            if(target<matrix[mid][0]){
                max=mid-1;
            }
            else if(target>matrix[mid][matrix[0].length-1]){
                min=mid+1;
            }
            else{
                return searchInRow(matrix[mid],target);
            }
        }
        return false;
    }
    public boolean searchInRow(int[] row, int target){
        int min=0;
        int max=row.length-1;
        while(min<=max){
            int mid=min+(max-min)/2;
            if(target<row[mid]){
                max=mid-1;
            }else if(target>row[mid]){
                min=mid+1;
            }
            else{
                return true;
            }
        }
        return false;
    }
}
