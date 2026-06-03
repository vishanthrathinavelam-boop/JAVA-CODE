import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) 
	{
	Scanner scan = new Scanner(System.in);
	int T=scan.nextInt();
	while (T-- > 0) {
            int N = scan.nextInt();
            int sum = 0;

            while (N > 0) {
                int digit= N % 10;
                sum = sum + digit;
                N = N / 10;        
            }

            System.out.println(sum);
        }

	}
}
