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
            double B = scan.nextDouble();
            double LS = scan.nextDouble();
            double minRS = Math.sqrt((LS * LS) - (B * B));
            double maxRS = Math.sqrt((LS * LS) + (B * B));

            System.out.printf("%.4f %.4f\n", minRS, maxRS);
        }
	}
}
