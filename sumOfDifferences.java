public class ZywOo {
  public static int sumOfDifferences(int[] arr)
    {
        int sum=0;
        if(arr.length<=1)
            return sum;
        else
        {
            int temp=0;
            for(int i=0;i<arr.length;i++)
            {
                for(int j=i+1;j<arr.length;j++)
                if(arr[i]<arr[j])
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

            }
            for(int i=0;i<arr.length;i++)
            {
                for(int j=i+1;j<arr.length;j++)
                {
                    sum+=arr[i]-arr[j];
                    i++;
                }
            }
        }
        return sum;
    }
}
