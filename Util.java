public class Util{

    private static Util instance = new Util();

    private Util(){}

    public static Util getInstance(){
        if(instance == null) instance = new Util();
        return instance;
    }

    public String[][] getBoard(int height, int width){

        String[][] board = new String[height][width];
        
        String block = " ■ ";
        String empty = " □ ";
        String red  = " ♥ ";
        String blue = " ♡ ";
        String door = " ★ ";
        
        int middleBlockX = 0;
        int middleBlockY = 0;

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
        
        int[] middlePoint = makeMiddlePoint(height, board[0].length);
        middleBlockX = middlePoint[0];
        middleBlockY = middlePoint[1];

        board[middleBlockX][middleBlockY] = block;
        
        return board;
    }

    public int[] makeMiddlePoint(int x, int y){
        int[] middlePoint = new int[2];
        
        if(x % 2 == 0){
            int w = (int)(Math.random() * 2) + 0;
            middlePoint[0] = (x / 2) - w;
        }else{
            middlePoint[0] = x / 2;
        }

        if(y % 2 == 0){
            int w = (int)(Math.random() * 2) + 0;
            middlePoint[1] = (y / 2) - w;
        }else{
            middlePoint[1] = y / 2;
        }

        return middlePoint;
    }

    

    public void printBoard(String[][] board){
        for(int i = 0 ; i < board.length ; i++){
            for(int j = 0 ; j < board[0].length ; j++){
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }
}