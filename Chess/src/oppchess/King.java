package oppchess;

public class King extends Pieces
{

	public King(int row, int col, String color, char name, board bref) {
		super(row, col, color, name, bref);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void move(Possition st, Possition end)
	{
		
		st.setRow(end.getRow());
		st.setCol(end.getCol());
	}

	@Override
	public boolean legal(Possition st, Possition end, Players p, int T) 
	{
		if((st.getRow()-end.getRow()==0) && (st.getCol()-end.getCol()==0))
	    {
	        return false;
	    }
	    if(Math.abs(st.getRow()-end.getRow())<=1 &&  Math.abs(st.getCol()-end.getCol())<=1)
	    {
	        if  (( Utility.horizontal(st, end)&& Cheess.B.Pathhor(st, end, T))||
	    	        (Utility.vertical(st, end)&& Cheess.B.Pathver(st, end, T))||
	    	        ( Utility.diagonal(st, end)&& Cheess.B.Pathdiag(st, end, T)) )
	        {
	            return true;
	        }
	    }
	    return false;
	}

}
