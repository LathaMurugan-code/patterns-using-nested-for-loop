package practice;

public class Pattern2 {
		public static void main(String[] args) {
		// TODO Auto-generated method stub
			char c= 'a';
			for(int row=1; row<=5;row++)
			{
	 for(int col=1; col<=row; col++)
	 {
		 System.out.print(" ");
	 }
	 for(int star=5; star>=row;star--)
	 {
		 System.out.print(c+" ");
		/* System.out.print((char)(row+65)+" ");
		 B B B B B  Ascii value-A-65
		  C C C C 
		   D D D 
		    E E 
		     F */
       c++;   
	 }
	// c++;
	/* a a a a a 
	  b b b b 
	   c c c 
	    d d 
	     e */
 System.out.println();
			}
		}
}
