public class Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int row=0;row<=6;row++)
		{    
			for(int col=0;col<=6;col++)
			{
				if(col==row)
					System.out.print(row+" ");
				else
					System.out.print("0 ");
			}
			System.out.println();
		}
	}
}
