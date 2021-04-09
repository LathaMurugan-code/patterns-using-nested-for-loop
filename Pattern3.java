package practice;

public class Pattern3 {
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern3 p = new Pattern3();
		p.createDiamond();
	}
 public void createDiamond() {
		// TODO Auto-generated method stub
		for (int row=1; row<=5;row++)
		{   for(int col=5;col>=row;col--)
		     {
		       System.out.print(" ");
		      }
		     for(int star=1;star<=row;star++)
		      {
			   System.out.print("* ");
		       }
		     for(int col=5;col>=row;col--)
		     {
		       System.out.print(" "+" ");
		      }
		     for(int star=1;star<=row;star++)
		      {
			   System.out.print("* ");
		       }
		   row++;
			System.out.println();
		   }
			for(int row=3; row>=1;row--)
			{
				for(int col=5;col>=row;col--)
				{
					System.out.print(" ");
				 }
				for(int star=1;star<=row;star++)
				{
					System.out.print("* ");
				}
				for(int col=5;col>=row;col--)
				{
					System.out.print(" "+" ");
				}
				for(int star=1;star<=row;star++)
				{
					System.out.print("* ");
				}
				row--;
				System.out.println();
			}
		}
	}
