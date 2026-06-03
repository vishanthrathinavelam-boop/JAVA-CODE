import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) 
	{
	    Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        while (T-- > 0) {
            int N = scan.nextInt();
            long fact = 1;
            for (int i = 1; i <= N; i++) {
                fact = fact * i;
            }
            System.out.println(fact);
        }

	}
}
