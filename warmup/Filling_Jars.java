import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextInt();
      	long m = in.nextInt();
      	long sum = 0;
        for(long i = 0; i < m; i++){  
            sum += Solve(in.nextInt(), in.nextInt(), in.nextInt());
        }
        long avg = (long)Math.floor(sum / n);
        System.out.println(avg);
    }
    
    private static long Solve(long a, long b, long k){
        
         return (b - a + 1) * k;
    }
    
    
}