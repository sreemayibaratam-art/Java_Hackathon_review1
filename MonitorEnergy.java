import java.util.*;
class MonitorEnergy
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        double EnergyGenerated = 12.5;
       
        if(EnergyGenerated >= 10)
        {
            System.out.println("Good Energy Generation.");
        }
        else
        {
            System.out.println("Low Energy Generation.");
        }
    }
}