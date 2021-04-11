public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int row=1;row<=7;row++)
		{
			for(int col=1;col<=row;col++)
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
