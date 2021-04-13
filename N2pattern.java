package kalailatha;

public class N2pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int row=1;row<=7;row++)
		{
			for(int col=1;col<=row;col++)
			{
				System.out.print(col);
			}
			System.out.println();
		}
		for(int row=7;row>=1;row--)
		{
			for(int col=1;col<row;col++)
			{
				System.out.print(col);
			}
			System.out.println();
		}
	}

}
