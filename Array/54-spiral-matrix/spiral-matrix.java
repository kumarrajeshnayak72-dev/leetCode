class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
      ArrayList<Integer>list= new ArrayList<>();
      int m = matrix.length;
      int n = matrix[0].length;
      int rowBegin = 0;
      int rowEnd = m-1;
      int colBegin = 0;
      int colEnd = n-1;

      while (rowBegin <= rowEnd && colBegin <= colEnd){
          for (int i = colBegin; i <= colEnd; i++) {
              list.add(matrix[rowBegin][i]);
          }
          rowBegin++;
          for (int i = rowBegin; i <= rowEnd; i++) {
              list.add(matrix[i][colEnd]);
          }
          colEnd--;
          if (rowBegin <= rowEnd){
              for (int i = colEnd; i >= colBegin; i--) {
                  list.add(matrix[rowEnd][i]);
              }
          }
          rowEnd--;
          if (colBegin <= colEnd){
              for (int i = rowEnd; i >= rowBegin; i--) {
                  list.add(matrix[i][colBegin]);
              }
          }
          colBegin++;
      }
       return list;
    }
}