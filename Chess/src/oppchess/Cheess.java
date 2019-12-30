package oppchess;
import java.util.Scanner;
public class Cheess 
{
	public static Scanner cin;
	public static board B;
	public static void main(String arr[])
	{
		B = new board();
		B.Printboard();
		cin=new Scanner(System.in ); 
		Possition st =new Possition(0,0);
		Possition end =new Possition(0,0);
		st.setRow(cin.nextInt());
		st.setCol(cin.nextInt());
		end.setRow(cin.nextInt());
		end.setCol(cin.nextInt());		
		B.updateBoard(st, end);
		
	}

}
