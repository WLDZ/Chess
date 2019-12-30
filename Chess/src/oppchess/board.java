package oppchess;

public class board 
{
  private Pieces  board[][];

  
  public board()
  {
	  init();
  }
  
  public void init()
  {
	  board=new Pieces[8][8];
         for(int i=0;i<8;i++)
      {
          for(int j=0;j<8;j++)
          {
              if(i==1)
                  board[i][j] =new Pawn(i,j,"Black",'P', this) ;
              else if(i==6)
                  board[i][j] = new Pawn(i,j,"White",'p',this);
              else if(i==0 && (j==0||j==7))
                  board[i][j] = new Knight(i,j,"Black",'R',this);
              else if(i==7 && (j==0||j==7))
                  board[i][j] = new Knight(i,j,"White",'r',this);
              else if(i==0 && (j==1||j==6))
                              board[i][j] =new Horse(i,j,"Black",'H',this);
              else if(i==7 && (j==1||j==6))
                              board[i][j] = new Horse(i,j,"White",'h',this);
              else if(i==0 && (j==2||j==5))
                              board[i][j] = new Bishop(i,j,"Black",'B',this);
              else if(i==7 && (j==2||j==5))
                              board[i][j] = new Bishop(i,j,"White",'b',this);
              else if(i==0 && j==3)
                              board[i][j] = new Queen(i,j,"Black",'Q',this);
              else if(i==7 && j==3)
                              board[i][j] = new Queen(i,j,"White",'q',this);
              else if(i==0 && j==4)
                              board[i][j] = new King(i,j,"Black",'K',this);
              else if(i==7 && j==4)
                              board[i][j] = new King(i,j,"White",'k',this);
              else
                                  board[i][j]=null;

          }
      }

  }
  
  
  public void Printboard()
  {
	  for(int i=0;i<8;i++)
	  {
		  for(int j=0;j<8;j++)
		  {
			if (board[i][j]!=null)  
			System.out.print(board[i][j].getName());
			else
				System.out.print(board[i][j]);	
		  }
		  System.out.print("\n");
	  }  
	  
  }
  
  
   public boolean Pathhor ( Possition st,Possition end,int T  )
  {
      int maxcol=0;
      int mincol=0;
      if ( st.getCol()>end.getCol() )
      {
          maxcol=st.getCol();;
          mincol=end.getCol();
      }
      else
      {
          maxcol=end.getCol();
          mincol=st.getCol();
      }
      for ( int i=mincol+1;i<maxcol;i++ )
      {
          if (!Character.isLowerCase(board[st.getRow()][i].getName()) && T==1&& board[st.getRow()][i]!=null)
          return false;
          else if(Character.isLowerCase(board[st.getRow()][i].getName()) && T==2&& board[st.getRow()][i]!=null)
          return false;
      }
      return true;
  }
   public boolean Pathver ( Possition st,Possition end,int T  )
   {
       int maxrow=0;
       int minrow=0;
       if ( st.getRow()>end.getRow() )
       {
           maxrow=st.getRow();
           minrow=end.getRow();
       }
       else
       {
           maxrow=end.getRow();
           minrow=st.getRow();
       }
       for ( int i=minrow+1;i<maxrow;i++ )
       {
    	   if (!Character.isLowerCase(board[i][st.getCol()].getName()) && T==1&& board[i][st.getCol()]!=null)
           return false;
    	   else if(Character.isLowerCase(board[i][st.getCol()].getName()) && T==2&& board[st.getRow()][i]!=null)
           return false;
       }
       return true;
   }
   
   public boolean Pathdiag( Possition st,Possition end,int T )
   {
    int minr,minc;
       int maxr,maxc;
       if(st.getRow()<end.getRow())
       {
           minr=st.getRow();
           maxr=end.getRow();
       }
       else
       {
           minr=end.getRow();
           maxr=st.getRow();
       }
       if(st.getCol()<end.getCol())
       {
           minc=st.getCol();
           maxc=end.getCol();
       }
       else
       {
           minc=end.getCol();
           maxc=st.getCol();
       }
      if((maxr==st.getRow() && maxc==st.getCol()) || (maxr==end.getRow() && maxc==end.getCol()))
      {

           for(int i=minr+1,j=minc+1;i<maxr;i++,j++)
           {
               if ( board[i][j]!=null)
               return false;
           }

      }
      else
      {
           for(int i=maxr-1,j=minc+1;i>minr;i--,j++)
           {
               if (  board[i][j]!=null)
               return false;
           }

      }
       return true;
   }
   
   public Pieces getBoardrc( int row,int col  )
   {
	   return board[row][col];
   }
   
   public void updateBoard( Possition st,Possition end )
   {
	   
	   board[end.getRow()][end.getCol()]=board[st.getRow()][st.getCol()];
	   System.out.println( board[end.getRow()][end.getCol()].getName());
	//   board[st.getRow()][st.getCol()]=null;
	   System.out.println( board[st.getRow()][st.getCol()]);
	   board[st.getRow()][st.getCol()].move(st, end);
	   System.out.println( board[st.getRow()][st.getCol()]);
	   Printboard();
	   
	   
   }
   

}
