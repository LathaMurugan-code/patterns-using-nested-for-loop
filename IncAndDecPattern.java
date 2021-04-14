public class IncAndDecPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int row=1;row<=7;row++)
		 {
			 for(int col=1;col<row;col++)
			 {
				 System.out.print(col+" ");
			 }
			 for(int r=row;r>=1;r--)
			 {
				 System.out.print(r+" ");
			 }
			 System.out.println();
		 }

	}

}
