class MarbleEscape {
    public static void main(String[] args){
        play();
    }

    public static void play(){
        Util util = Util.getInstance();
        String[][] board = util.getBoard(20, 20);
        util.printBoard(board);
    }
    
}