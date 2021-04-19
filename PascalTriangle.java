package kalailatha;

public class PascalTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=11,b=0;
		for(int i=1;i<=4;i++)
		{
			for(int j=4;j>=i;j--)
			{
				System.out.print(" ");
			}
			System.out.print((int)Math.pow(a, b)+" ");
			b++;
			System.out.println();
		}
			
				}
		}
			


