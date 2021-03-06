import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// The part of the program involving reading from STDIN and writing to STDOUT has been provided by us.

public class Solution {
   static BufferedReader in = new BufferedReader(new InputStreamReader(
         System.in));
   static StringBuilder out = new StringBuilder();

   public static void main(String[] args) throws NumberFormatException, IOException {
      int numPackets = Integer.parseInt(in.readLine());
      int numKids = Integer.parseInt(in.readLine());
      int[] packets = new int[numPackets];
      int diff = 0;
      int unfairness = Integer.MAX_VALUE;

       
      for(int i = 0; i < numPackets; i ++)
      {
         packets[i] = Integer.parseInt(in.readLine());
      }
      Arrays.sort(packets);

      for (int i = 0; i < numPackets - 1 - numKids; i++) {
          diff = packets[i + numKids - 1] - packets[i];
          unfairness = diff < unfairness ? diff : unfairness;
      }
      
      System.out.println(unfairness);
   }
}
