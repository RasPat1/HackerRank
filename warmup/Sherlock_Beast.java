import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int testCase = 0; testCase < t; testCase++){ 
            int k = in.nextInt(); 
            // k = 3a + 5b 
            int fiveCount = Solve(k);
            String output = "";
            if (fiveCount < 0) {
              output = "-1";
            } else {
                char[] charsF = new char[fiveCount];
                Arrays.fill(charsF, '5');
                output += new String(charsF);
                int threeCount = k - fiveCount;
                char[] charsT = new char[threeCount];
                Arrays.fill(charsT, '3');
                output += new String(charsT);
            }
            System.out.println(output);
        }
    }
    
    private static int Solve(int k){
        if (k == 1 || k == 2 || k == 4 || k == 7) {
          return -1;
        }
        //Gibberish
        int fiveCount = (int)(k / 3);
        int counter = 0;
        while (fiveCount >= 0) {
          int b = k - (3 * fiveCount);
          if (b % 5 == 0) {
            break;
          } else {
            fiveCount--;
          }
          counter++;
          if (counter == 15) {
            break;
          }
        }

        return fiveCount * 3;

    }
    
    
}