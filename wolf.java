public class ZywOo 
{
    public static String message="";
    public static String warnTheSheep(String[] array)
    {
        int sheepCounter=0;
        for(int i=array.length-1;i>=0;i--)
        {
            if(array[array.length-1].equals("wolf"))
               message="Pls go away and stop eating my sheep";
            else if(array[i].equals("sheep"))
                {
                sheepCounter++;
                }
             if(array[i].equals("wolf") && i!=array.length-1)
                 message="Oi! Sheep number "+ sheepCounter +"!"+ " You are about to be eaten by a wolf!";
        }
        return message;
    }
    
}
