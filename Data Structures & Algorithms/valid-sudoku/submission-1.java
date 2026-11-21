class Solution {
    public boolean isValidSudoku(char[][] board) {
        int rowb;
        int colb;


        for (int row=0;row<9;row++){
            HashSet<Character> hashSet = new HashSet<>();
            for (int col=0;col<9;col++){

                if (board[row][col] == '.') 
                {continue;
                }
                if (hashSet.contains(board[row][col])){
 return false;
                }
                hashSet.add(board[row][col]);



            }

        }


        for(int col =0; col<9;col++){
              HashSet<Character> hashSet = new HashSet<>();
            for (int row =0;row<9;row++){

                if(board[row][col]== '.') {
                    continue;}
                if(hashSet.contains(board[row][col])){
return false;
                }
                hashSet.add(board[row][col]);
            }
        } 


        for (int subbox = 0;subbox<9;subbox++){
            
            HashSet<Character> hashSet = new HashSet<>();
            for ( int i =0;i<3;i++){
                for (int j=0;j<3;j++){

                    rowb = (subbox/3)*3 +i;
                    colb = (subbox%3)*3 +j;
                       if(board[rowb][colb]== '.') {
                    continue;}
                if(hashSet.contains(board[rowb][colb])){
return false;
                }
                hashSet.add(board[rowb][colb]);
                    

                }
                
               

            }


        }
        
   return true; 
    }
}
