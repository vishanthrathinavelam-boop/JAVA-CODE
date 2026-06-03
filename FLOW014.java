import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) 
	{
	     Scanner sc = new Scanner(System.in);

        int T = sc.nextInt(); 

        while (T-- > 0) {

            int hardness = sc.nextInt();
            double carbon = sc.nextDouble();
            int tensile = sc.nextInt();

            boolean cond1 = hardness > 50;
            boolean cond2 = carbon < 0.7;
            boolean cond3 = tensile > 5600;

            if (cond1 && cond2 && cond3) {
                System.out.println(10);
            } 
            else if (cond1 && cond2) {
                System.out.println(9);
            } 
            else if (cond2 && cond3) {
                System.out.println(8);
            } 
            else if (cond1 && cond3) {
                System.out.println(7);
            } 
            else if (cond1 || cond2 || cond3) {
                System.out.println(6);
            } 
            else {
                System.out.println(5);
            }
        }
	}
}
