package oppchess;

public class Utility
{
  	
  	public static boolean horizontal( Possition st,Possition end )
  	{
  	
  		if ( st.getRow()==end.getRow() && st.getCol()!=end.getCol()  )
  		{
  			return true;
  		}
  		
  		return false;
  	}
  	
  	public static boolean vertical(Possition st,Possition end )
  	{
  		if ( st.getRow()!=end.getRow() && st.getCol()==end.getCol() )
  		{
  			return true;
  		}
  		return false;
  	}
  	
  	public static boolean diagonal ( Possition st,Possition end )
  	{
  		if(Math.abs(end.getRow()-st.getRow())==Math.abs(st.getCol()-end.getCol()))
  		{
  			return true;
  		}
  		return false;
  	}
  	
  	
  	
}
