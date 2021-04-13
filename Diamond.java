package kalailatha;

public class Diamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int row=1;row<=5;row++)
		{
			for(int col=5;col>=row;col--)
			{
				System.out.print("* ");
					}
			for(int at=1;at<=2*row-1;at++)
			{
				System.out.print("@ ");
			}
			for(int s=5;s>=row;s--)
			{
				System.out.print("* ");
			}
			System.out.println();
			}
		for(int a=1;a<=11;a++)
{
	System.out.print("@ ");
}
		System.out.println();
		for(int row=5;row>=1;row--)
		{
			for(int col=5;col>=row;col--)
			{
				System.out.print("* ");
					}
			for(int at=1;at<=2*row-1;at++)
			{
				System.out.print("@ ");
			}
			for(int s=5;s>=row;s--)
			{
				System.out.print("* ");
			}
			System.out.println();
			}
		}
}
