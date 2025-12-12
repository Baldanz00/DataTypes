import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh)
    {
        /*
        Per ogni numero inserito in input , devo stampare in quali tipi primitivi
        Java può essere memorizzato

        byte -> -128 - 127
        short -> -32 768 - 32 767
        int -> −2³¹ → 2³¹−1
        long -> −2⁶³ → 2⁶³−
         */
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt(); //valore da leggere

        for(int i=0;i<t;i++)
        { //legge ogni numero
            try
            {
                long x=sc.nextLong(); //prima come long
                System.out.println(x+" can be fitted in:");
                if(x>=-128 && x<=127)System.out.println("* byte"); //byte
                if(x >= -32768 && x <= 32767) System.out.println("* short"); //short
                if(x >= -2147483648L && x <= 2147483647L) System.out.println("* int"); //int

                System.out.println("* long");
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }
}