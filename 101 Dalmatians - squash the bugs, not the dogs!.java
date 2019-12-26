public class ZywOo {

  public static String howManyDalmatians(int number)
      
                    {
  
                    String[] dogs  = {"Hardly any", "More than a handful!", "Woah that's a lot of dogs!", "101 DALMATIANS!!!"};
    
                    String respond = (number>=1 &&  number<= 10) ? dogs[0] : (number >= 11 &&  number <= 50) ? dogs[1] : (number >=51 && number <=100) ? dogs[2] : (number == 101 ) ?  dogs[3]:null;
    
                    return respond;
                    }
  
}
