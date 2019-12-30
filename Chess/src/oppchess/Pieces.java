package oppchess;

public abstract class Pieces 
{
	private String color;
	private Possition pos;
	private char name;
	protected board B;
	
	public Pieces ( int row,int col,String color,char name, board bref )
	{
		this.pos= new Possition(row,col);
		this.color=color;
		this.name=name;
		this.B = bref;
	}
	
	public void setPossition( int row,int col )
	{
		this.pos.setRow(row);
		this.pos.setCol(col);
	}
	
	public int getPossition ( )
	{
		return this.pos.getRow() + this.pos.getCol();
	}
	
	public abstract void move( Possition st,Possition end );
	
	public abstract boolean legal( Possition st,Possition end,Players p,int T  );
	
	public void setColor( String color )
	{
		this.color=color;
	}
	public String getColor()
	{
		return this.color;
	}
	public void setName( char name )
	{
		this.name=name;
	}
	public char getName()
	{
		return this.name;
	}

}
