package kalailatha;

public class N1Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int row=1;row<=7;row++)
		{
			for(int col=6;col>=row;col--)
			{
				System.out.print("1");
			}
			for(int col=1;col<=row;col++)
			{
				System.out.print(row);
			}
			System.out.println();
		}

	}

}
