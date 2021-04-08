package practice;

public class LoopPattern5 {
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int row=5;row>=1;row--)
		{
			for(int col=1;col<=row;col++)
			{
				System.out.print("-");
			}
			for (int star=1;star<=row;star++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
  }
}
