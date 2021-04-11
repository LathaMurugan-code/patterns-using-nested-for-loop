public class Sandclock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int row=1;row<=7;row++)
		{
			for(int col=1;col<=row;col++)
			{
				System.out.print(" ");
			}
			int a=1;
			for(int n=7;n>=row;n--)
			{
			  System.out.print(a+" ");
			  a++;
			}
			System.out.println();
		}
		for(int row=1;row<=7;row++)
		{
			for(int col=7;col>=row;col--)
			{
				System.out.print(" ");
			}
			int a=1;
			for(int n=1;n<=row;n++)
			{
			  System.out.print(a+" ");
			  a++;
			}
			System.out.println();
		}

	}

}
