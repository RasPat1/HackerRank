/* Sample program illustrating input/output methods */
import java.util.*;

class Flowers{
   public static void main( String args[] ){
      
// helpers for input/output      

      Scanner in = new Scanner(System.in);
      
      int N, K;
      N = in.nextInt();
      K = in.nextInt();
      
      int C[] = new int[N];
      for(int i=0; i<N; i++){
         C[i] = in.nextInt();
      }
 
      int result = 0;
      Arrays.sort(C);

      int fInd = 0;
      int fPP = 0;   //Flowers per person
      while(fInd < N) {
         result += (fPP + 1) * C[N - fInd - 1];
         fInd++;
         if (fInd != 0 && fInd % K == 0){
            fPP++;
         }
      }

      System.out.println( result );
      
   }
}
