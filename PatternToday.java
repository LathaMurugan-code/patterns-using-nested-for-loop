package practice;

public class PatternToday {
	public static void main(String[] args) {
 // TODO Auto-generated method stub
		for(int row=1; row<=5;row++)
		{
 for(int col=1; col<=row; col++)
 {
	 System.out.print(" ");
 }
 for(int star=5; star>=row;star--)
 {
	 System.out.print("* ");
 }
 System.out.println();
		}
	}
}
