package oppchess;

public class Knight extends Pieces
{

	public Knight(int row, int col, String color, char name, board bref) 
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
		if (( Utility.horizontal(st, end)&& Cheess.B.Pathhor(st, end, T))||
		        (Utility.vertical(st, end))&& Cheess.B.Pathver(st, end, T))
		        {
		            return true;
		        }
		        return false;
	}

}
