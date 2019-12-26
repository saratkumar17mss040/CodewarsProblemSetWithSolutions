public class Calculate 
{
   public static String bmi(double weight, double height) 
   {
        float bodyMassIndex =(float) (weight/(Math.pow(height,2)));
        String bmiMessage = (bodyMassIndex<=18.5) ? "Underweight" : (bodyMassIndex<=25.0) ? "Normal" : (bodyMassIndex<=30.0) ? "Overweight" : 
        (bodyMassIndex>30) ? "Obese" : null;
        return bmiMessage;
    }
}
