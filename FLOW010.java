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
            char ch = sc.next().charAt(0);
            switch (ch) {
                case 'B':
                case 'b':
                    System.out.println("BattleShip");
                    break;

                case 'C':
                case 'c':
                    System.out.println("Cruiser");
                    break;

                case 'D':
                case 'd':
                    System.out.println("Destroyer");
                    break;

                case 'F':
                case 'f':
                    System.out.println("Frigate");
                    break;
            }
        }

	}
}
