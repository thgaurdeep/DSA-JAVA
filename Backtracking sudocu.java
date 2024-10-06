public class sudocu {

    public static boolean issafe(int sudocu[][],int row,int col,int digit)
    {
        //row

        for(int i=0;i<=8;i++)
        {
            if(sudocu[i][col]==digit)
            {
                return false;
            }
        }

        //colunm

        for (int j=0;j<=8;j++)
        {
            if(sudocu[row][j]==digit)
            {
                return false;
            }
        }

        //for gride

        int sc = (col/3)*3;
        int sr= (row/3)*3;
        for(int i=sr;i<sr+3;i++)
        {
            for(int j =sc;j<sc+3;j++)
            {
                if(sudocu[i][j]==digit)
                {
                    return false;
                }
            }
        }

        return true;


    }
    public static boolean sudocusol(int sudocu[][],int row,int col)
    {
        if(row==9)
        {
            return true;
        }

        int nextrow=row,nextcol=col+1;
        if(col+1==9)
        {
            nextrow=row+1;
            nextcol=0;
        }
        if(sudocu[row][col]!=0)
        {
            return sudocusol(sudocu,nextrow,nextcol);
        }
    
        for(int digit=0;digit<=9;digit++)
        {
            if(issafe(sudocu,row,col,digit))
            {
                sudocu[row][col]=digit;
                if(sudocusol(sudocu,nextrow,nextcol))
                {
                    return true;
                }
                sudocu[row][col]=0;
            }
        }
        return false;

    }

    public static void printgride(int sudocu[][])
    {
        
        for(int i=0;i<9;i++)
        {
            for(int j =0;j<9;j++)
            {
                System.err.print(sudocu[i][j]+" ");
            }
            System.err.println();
            

        }
    
    }



    public static void main (String[]args)
    {
        int sudocu[][]={
            {0,0,8,0,0,0,0,0,0},
            {4,9,0,1,5,7,0,0,2},
            {0,0,3,0,0,4,1,9,0},
            {1,8,5,0,6,0,0,2,0},
            {0,0,0,0,2,0,0,6,0},
            {9,6,0,4,0,5,3,0,0},
            {0,3,0,0,7,2,0,0,4},
            {0,4,9,0,3,0,0,5,7},
            {8,2,7,0,0,9,0,1,3},
    
            
        };
        if(sudocusol(sudocu,0,0))
        {
            System.err.println("solution exist");
        
            printgride(sudocu);
        }
    }
}
    


