public class EANValidator {    
    public static boolean validate(final String eanCode) {
     
      int akkOddPositions = 0;
      int akkEvenPositions = 0;
      int sumEanCode = 0;
      int modSumEanCode;
      int checksum;
      
      String delimeters = "((?<=\\d)|(?=\\d))";
      String[] eanCodeArray = eanCode.split(delimeters);
       
    for (int i= 0; i<= (eanCodeArray.length)-2; i=i+2)
    {
     akkOddPositions = Integer.valueOf(eanCodeArray[i]) * 1 + akkOddPositions;
    }
    for (int i= 1; i<= (eanCodeArray.length)-2; i=i+2)
    {
     akkEvenPositions = Integer.valueOf(eanCodeArray[i]) * 3 + akkEvenPositions;
    }  
    
    sumEanCode = akkOddPositions + akkEvenPositions;
    modSumEanCode = sumEanCode % 10;
    
    if ( modSumEanCode == 0)
    {
      checksum = 0;
    }
    else 
    {
      checksum = 10 - (modSumEanCode);
    }
   
    if ((checksum == Integer.valueOf(eanCodeArray[12])))
    {
      return true;
     }
    else 
    {
      return false;
    }
    }
    
}
