public class Geometry
{
      public static double squareArea(double A)
     {
       double areaOfSq = Math.round(Math.pow(2*A/Math.PI,2) * 100.0) / 100.0;
        return areaOfSq;   
     }
}
