import java.util.*;

public class Dinglemouse 
{

     private static final Map<String, MyNumber> cache = new LinkedHashMap<>();

     static enum MyNumber
{
        ONE(1, "one", "ichi", "un"),
        TWO(2, "two", "ni", "deux"),
        THREE(3, "three", "san", "trois"),
        FOUR(4, "four", "shi", "quatre")
        ;

        private final int val;
        private final String[] names;

        private MyNumber(int val, String ...names)
        {
            this.val = val;
            this.names = names;
        }
        
        public int intValue()
        {
            return this.val;
        }
        
}
        
        static 
        {
            for (final MyNumber n : MyNumber.values()) 
                for(final String s : n.names)
                cache.put(s, n);
        }


      static MyNumber getNumber(final String name)
    {
        return cache.get(name);
    }

  
}
