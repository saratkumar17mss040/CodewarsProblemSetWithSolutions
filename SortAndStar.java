public class SortAndStar 
{

  public static String twoSort(String[] s)
    {

        int strLen = s.length;
        int i;
        String temp;
        String[] words = new String[strLen];

        for(i=0;i<strLen;i++)
        {
            words[i] = s[i];
        }

        for(i=0;i<strLen;i++)
        {
            for(int j=i+1;j<strLen;j++)
            {
                if(words[i].compareTo(words[j])>0)
                {
                    temp = words[i];
                    words[i] = words[j];
                    words[j] = temp;
                }
            }
        }
        
        char[] charArray = words[0].toCharArray();
        temp = "";
        
         for(i=0;i<charArray.length;i++)
         {
             if(i !=charArray.length-1)
                temp+= charArray[i] + "***";
             else
                temp+= String.valueOf(charArray[i]) ;
         }

        return temp;
    }
}
