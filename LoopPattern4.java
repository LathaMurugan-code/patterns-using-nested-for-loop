package practice;

public class LoopPattern4 {
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int row=5;row>=1;row--)
		{
			for(int col=1;col<=row;col++)
				/*for(int col=1;col<row;col++)
				----*
				---*
				--*
				-*
				*  */
			{
				System.out.print("-");
			}
			System.out.println("*");
		}
	}
}
