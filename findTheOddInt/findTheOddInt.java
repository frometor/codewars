public class FindOdd {
  public static int findIt(int[] A) {
  for (int i = 0; i <= A.length-1; i++)
    {
    for (int j = 0, cnt = 0; j <= A.length-1; j++)
      {
        if (A[i]==A[j])
          {
          cnt++; // if A[i] occurs several times, increase counter 
          }
        if ((j == A.length-1) && (cnt % 2 == 1)) // Is #A[i]'s odd?
          {
          return A[i];
          }
      }
     }
 return 1337; } //L33T Haxxor skillz :(
}
