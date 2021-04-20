package kalailatha;

public class PascalTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=11,b=0;
		for(int i=1;i<=7;i++)
		{
			for(int j=7;j>=i;j--)
			{
				System.out.print(" ");
			}
			int result=(int)Math.pow(a, b);
			//System.out.print(result);
			digitSpliter(result);
			b++;
			System.out.println();
		}
							}
	public static void digitSpliter(int no)
	{   int rem=0;
	    int temp = no;
		int count=0;
		while(no>0)
		{
			 rem = no%10;
			no=no/10;
			count++;
			}
		int arr[] = new int[count];
		for(int i=arr.length-1;i>=0;i--) {
			rem = temp%10;
			temp=temp/10;
			arr[i]=rem;
			if(temp<0)
				break;
		}
		
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

		}
			


