package oppchess;

public class Pawn extends Pieces
{

	public Pawn(int row, int col, String color, char name, board bref)
	{
		super(row, col, color, name, bref);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void move(Possition st, Possition end)
	{
		//int a=st.getRow();
		//int b=st.getCol();
		st.setRow(end.getRow());
		st.setCol(end.getCol());
	//	end.setRow(a);
	//	end.setCol(b);
	}

	@Override
	public boolean legal(Possition st, Possition end, Players p, int T) 
	{
		
		
			if ((st.getCol()==end.getCol()))
			{
			
				if ( Utility.vertical(st, end) && Cheess.B.Pathver(st, end, T) &&
				(st.getRow()==1 || st.getRow()==6) && Cheess.B.getBoardrc(end.getRow(),end.getCol())==null &&
				(end.getRow()==st.getRow()+2 ||end.getRow()==st.getRow()-2))
					{
						return true;
					}
			else if ( (end.getCol()==st.getCol() && (end.getRow()==st.getRow()+1 && T==1 )
					||(end.getRow()==st.getRow()-1 && T==2))&&
					Utility.vertical(st, end) && Cheess.B.Pathver(st, end, T)
					&&Cheess.B.getBoardrc(end.getRow(),end.getCol())==null )
			        {
			            return true;
			        }

			
			}
			else if ( Cheess.B.getBoardrc(end.getRow(),end.getCol())!=null
					&& Utility.diagonal(st, end)
			        && B.Pathdiag(st, end, T) && T==1)
			        {
			            return true;
			        }
			
			else if ( Cheess.B.getBoardrc(st.getRow()+1,st.getCol()-1)!=null
					|| Cheess.B.getBoardrc(st.getRow()-1,st.getCol()-1)!=null
					&&	Utility.diagonal(st, end)
			        &&B.Pathdiag(st, end, T)&& T==2 )
			        {
			            return true;
			        }
			
			return false;
		
	}

	

	
	
	

}
