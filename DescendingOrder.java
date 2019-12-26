public class DescendingOrder {
   public static int sortDesc(final int num) {

       char temp;
       String s= Integer.toString(num);
       char[] charArray  = s.toCharArray();

       for(int i=0;i<charArray.length;i++)
       {
           for(int j=i+1;j<charArray.length;j++)
           {
               if(charArray[i]<charArray[j])
               {
                   temp = charArray[i];
                   charArray[i] = charArray[j];
                   charArray[j] = temp;
               }
           }
       }
       return  Integer.parseInt(String.valueOf(charArray));
    }
}
