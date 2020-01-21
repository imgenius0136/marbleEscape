class MarbleEscape {
    public static void main(String[] args){
        String[][] board = getBoard(9, 10);
        printBoard(board);
    }

    public static String[][] getBoard(int height, int width){

        String[][] board = new String[height][width];
        
        String block = " ■ ";
        String empty = " □ ";
        String red  = " ♥ ";
        String blue = " ♡ ";
        String door = " ★ ";
        
        int middleBlockX = 0;
        int middleBlickY = 0;

        for(int i = 0 ; i < height ; i++){    
            for(int j = 0 ; j < board[0].length ; j++){
                if(i == 0){
                    board[i][j] = block;
                }else if(i == height - 1){
                    board[i][j] = block;
                }else{
                    board[i][j] = empty;
                }

                if(j == 0){
                    board[i][j] = block;
                }else if(j == board[0].length - 1){
                    board[i][j] = block;
                }
            }
        }
        
        if(height % 2 == 0){
            
        }else{
            
        }

        if(width % 2 == 0){

        }else{
            
        }
        
        return board;
    }

    public static void printBoard(String[][] board){
        for(int i = 0 ; i < 9 ; i++){
            for(int j = 0 ; j < board[0].length ; j++){
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }
}