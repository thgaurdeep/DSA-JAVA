public class nQueen {
    public static boolean issafe(char board[][],int row,int col)
    {
        //for vertically up

        for(int i=row-1;i>=0;i--)
        {
            if(board[i][col]=='Q')
            {
                return false;
            }
        }

        //diagonaly left
        for(int i=row-1,j=col-1;i>=0&&j>=0;i--,j--)
        {
            if(board[i][j]=='Q')
            {
                return false;
            }

        }

        for(int i=row-1,j=col+1;i>=0&&j<board.length;i--,j++)
        {
            if(board[i][j]=='Q')
            {
                return false;
            }
        }

        return true;

        
    }

    public static void nQueen(char board[][],int ro)
    {
        if(ro==board.length)
        {
            System.err.println("----------------nquen");
            print(board);
            return;
        }

        for(int j=0;j<board.length;j++)
        {
            if(issafe(board,ro,j))

            {
            board[ro][j]='Q';
            nQueen(board, ro+1);// recurssion
            board[ro][j]='x';//backtracking
            }
        }
    }
        public static void print(char board[][])
        {
            for(int i=0;i<board.length;i++)
            {
                for(int j=0;j<board.length;j++)
                {
                    System.err.print(board[i][j]+" ");
                }
                System.err.println();
            }
            
        }
    
    public static void main (String[] args)
    {
        int n=4;
        char board[][]=new char[n][n];

        //initialize the board

        for (int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                board[i][j]='x';
            }
        }
        nQueen(board,0);

    }
    
}
