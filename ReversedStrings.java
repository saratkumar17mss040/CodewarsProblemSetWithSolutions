public class Kata 
{

   public static String solution(String str) 
   {

        String reversedString = "";
        char[] charArray = str.toCharArray();
        for (int i = str.length() - 1; i >= 0; i--) 
        {
            reversedString+= String.valueOf(charArray[i]);
        }
        return reversedString;
    }

}
