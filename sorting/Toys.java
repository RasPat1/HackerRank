import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Arrays;

public class Toys {
    public static void main(String[] args) {
        Scanner stdin=new Scanner(System.in);
        int n=stdin.nextInt();
        int k=stdin.nextInt();
        int prices[]=new int[n];
        for(int i=0;i<n;i++) prices[i]=stdin.nextInt();
        
        int answer = 0;
        Arrays.sort(prices);
        int total = 0;
        int i = 0;
        while(total <= k && i < n) {
            total += prices[i];
            i++;
            if(total <= k) {
                answer++;                
            }
        }
            
        System.out.println(answer);
    }
}
