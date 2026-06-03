import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) 
	{
	    Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();

        while (tc-- > 0) {
            String s = sc.next();
            String t = sc.next();

            String m = "";

            for (int i = 0; i < 5; i++) {
                if (s.charAt(i) == t.charAt(i))
                    m += "G";
                else
                    m += "B";
            }

            System.out.println(m);
        }
	}
}
