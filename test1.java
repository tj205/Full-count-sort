import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class test1 {
    class node
    {
        int index;
        int count;
        String str;
        node()
        {
        	index=0;
        	count=0;
        	str="";
        }
    }
    static void sort(int ar[],String s[])
    {
        node c[]=new node[100];
        for(int i=0;i<ar.length;i++)
        {
            c[ar[i]].index=ar[i];
            c[ar[i]].count++;
            c[ar[i]].str=c[ar[i]].str+" "+s[i];
        }
        for(int i=0;i<100;i++)
        {
            System.out.print(c[i].str.trim()+" ");
        }
        
    }



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        int [] Int=new int[n];
        String str[]=new String[n];

        for (int i = 0; i < n; i++) {
            String[] xs = scanner.nextLine().split(" ");

            int x = Integer.parseInt(xs[0]);
            Int[i]=x;

            String s = xs[1];
            if(i<=n/2)
                str[i]="-";
            else
                str[i]=s;
        }
        sort(Int,str);
        scanner.close();
    }
}

