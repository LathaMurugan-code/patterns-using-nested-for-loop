package kalailatha;

public class Heart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 *   * *     * * 
		 *  * * * * * * *
		 *  * * * * * * *
		 *   * * * * * *
		 *     * * * *
		 *       * *
		 *        *
		 */
		Heart b =new Heart();
		for(int r=1;r<=1;r++)
		{
			for(int c=3;c>=r;c--)
			{
				System.out.print(" ");
			}
			b.star(2);
			b.space(3);
			b.star(2);
			System.out.println();
		}
		for(int r=1; r<=2;r++)
		{
			b.space(2);
			b.star(7);
			System.out.println();
		}
		b.space(3);
		b.star(6);
		System.out.println();
		b.space(4);
		b.star(5);
		System.out.println();
		b.space(6);
		b.star(3);
		System.out.println();
		b.space(8);
		b.star(1);
		System.out.println();
		

	}
	public void space(int n)
	{
		for(int c=n;c>=1;c--)
		{
			System.out.print(" ");
		}
	}
	public void star(int n)
	{
		for(int s=1;s<=n;s++)
		{
			System.out.print("* ");
		}
	}

}
