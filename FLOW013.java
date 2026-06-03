import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) 
	{
	    Scanner scan = new Scanner(System.in);
	    int T = scan.nextInt();
	    while(T-- > 0)
	    {
	        int A = scan.nextInt();
            int B = scan.nextInt();
            int C = scan.nextInt();
            int D = A+B+C;

            if (D == 180) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
	    }
	}
}
