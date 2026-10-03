class EnergyGenerated
{
       void calculateTotalEnergy(double morningEnergy, double eveningEnergy)
         {
              double totalEnergy = morningEnergy + eveningEnergy;
              System.out.println("Total Energy Generated: " + totalEnergy);
         }
    public static void main(String args[])
    {
        EnergyGenerated sc = new EnergyGenerated();
        sc.calculateTotalEnergy(3.5, 9);
    }
    

    
       

         
}