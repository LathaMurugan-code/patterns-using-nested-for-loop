public class Pattern6
{
	public static void main(String args[]) {
	for(int row=1;row<=7;row++)
	{    
		for(int col=1;col<=7;col++)
		{
			if(col==1||col==3||col==5||col==7)
				System.out.print("1 ");
			else
				System.out.print("0 ");
		}
		System.out.println();
	}
}
}
