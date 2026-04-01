class Solution {
    public boolean checkValid(int[][] matrix) {

     HashSet<Integer> hs = new HashSet<>();
        int n = matrix.length;
      

        for(int column=0 ; column<n ;column++){
            for(int row=0 ;row<n ;row++){
                //for storing elements in hashtable row wise
                hs.add(matrix[row][column]);
            }
            if(hs.size()<n){
                return false ;
            }

            hs.clear();
        }

         for(int row=0 ; row<n ;row++){
             //for storing elements in hashtable row wise
            for(int column=0 ;column<n ;column++){
                hs.add(matrix[row][column]);
            }
            if(hs.size()<n){
                return false ;
            }

            hs.clear();
        }



        return true;
        
    }
}