package oppchess;

public class Possition
{

	private int row;
	private int col;
	
	public Possition ( int row,int col  )
	{
		this.row=row;
		this.col=col;
		
	}
	
	public void setRow( int row )
	{
		this.row=row;
	}
	
	public void setCol( int col )
	{
		this.col=col;
	}
	
	public int getRow()
	{
		return this.row;
	}
	
	public int getCol()
	{
		return this.col;
	}
	
}
