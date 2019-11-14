public class Solution
{
    public static int[] indices = new int[2];

    public static int[] twoSum(int[] ele,int targetNumber) 
    {
        for(int i=0;i<ele.length;i++)
        {
            for(int j=i+1;j<ele.length;j++)
            {
                if(targetNumber == ele[i] + ele[j])
                    {
                    indices[0] = i;
                    indices[1] = j;
                    }
            }
        }
     return indices;
    }
}
