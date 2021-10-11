package test.programmers.level1;

public class Test4 {
    public static void main(String[] args) {
        int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
        int[] moves = {1,5,3,5,1,2,1,4};

        int count = 0;
        int[] stack = new int[1000];
        int stackLoc = -1;

        for(int j = 0; j < moves.length ; j++) {
            System.out.println("moves[j] = " + moves[j]);
            for (int i = 0; i < board.length; i++) {


                if (board[i][moves[j]-1] != 0) {

                    // DEBUG
                    for(int[] b : board){
                        System.out.print("[");
                        for(int bb : b){
                            System.out.print(bb + ", ");
                        }
                        System.out.println("]");
                    }


                    stack[++stackLoc] = board[i][moves[j]-1];
                    board[i][moves[j]-1] = 0;
                    // DEBUG
                    System.out.print("stack: ");
                    for(int d = 0 ; d <= stackLoc; d++){
                        System.out.print(stack[d] + ", ");
                    }
                    System.out.println();

                    while(stackLoc >= 1){
                        if(stack[stackLoc] == stack[stackLoc-1]){
                            count= count +2;
                            stackLoc = stackLoc-2;

                            // DEBUG
                            for(int d = 0 ; d <= stackLoc; d++){
                                System.out.print(stack[d] + ", ");
                            }
                            System.out.println();

                        }else {
                            break;
                        }
                    }

                    break;
                }
            }
        }

        System.out.println("count = " + count);

    }

    public void showNow(){

    }

}
