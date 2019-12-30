package oppchess;

public class Horse extends Pieces
{

	public Horse(int row, int col, String color, char name, board bref) 
	{
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
		
		    if(((Math.abs(st.getRow()-end.getRow())==2 && Math.abs(st.getCol()-end.getCol())==1)) 
		    		||((Math.abs(st.getRow()-end.getRow())==1 && Math.abs(st.getCol()-end.getCol())==2)))
		    {
		        return true;
		    }
		    return false;
		    
	}

}
