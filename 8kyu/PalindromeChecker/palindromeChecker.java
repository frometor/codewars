public class PalindromChecker {
  public boolean isPalindrome(String str) {
  //Replace all unwanted characters with nothing
  String strReplaced = str.replaceAll("[^a-zA-Z0-9]","");
  // Turn all Uppercase Letters into Lowercase letters
  String strLower = strReplaced.toLowerCase();
  
  int i=0; 
  int j = strLower.length()-1;
  
  while (i<=j)
    {
    if ((int) strLower.charAt(i) == (int) strLower.charAt(j))
      {
      i++;
      j--;
      }
    else {return false;}
    }
    return true;
  }
}
