import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
	public static void main (String[] args) 
	{
	    Scanner scan = new Scanner(System.in);
	    int T=scan.nextInt();
	    while(T-- > 0){
	        int N=scan.nextInt();
	        int lastDigit = N % 10;
            int firstDigit = N;
            while (firstDigit >= 10) {
                firstDigit /= 10;
            }
            int sum = firstDigit + lastDigit;
            System.out.println(sum);
        }
	}
}
