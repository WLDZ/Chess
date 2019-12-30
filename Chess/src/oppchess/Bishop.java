package oppchess;

public class Bishop extends Pieces
{

	public Bishop(int row, int col, String color, char name, board bref) 
	{
		super(row, col, color, name, bref);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void move(Possition st, Possition end)
	{
		st.setRow(end.getRow());
		st.setCol(end.getCol());
	//	Cheess.B.updateBoard(st, end);	
	}

	@Override
	public boolean legal(Possition st, Possition end, Players p, int T) 
	{
	
	
		    if((st.getRow()-end.getRow()==0) && (st.getCol()-end.getCol()==0))
		    {
		        return false;
		    }
		    if( Utility.diagonal(st, end) && Cheess.B.Pathdiag(st, end, T) )
		    {
		        return true;
		    }
		    return false;
	}
	
}
