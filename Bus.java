public class Bus
{
    private String linie;
    private int sitzplaetze;
    private boolean niederflur;
    
    
    //constructor
    public Bus (String neuLinie, int neuSitzplaetze, boolean neuNiederflur)
    {
        setLinie(neuLinie);
        setSitzplaetze(neuSitzplaetze);
        setNiederflur(neuNiederflur);
    }
    
    public Bus(String neuLinie, int neuSitzplaetze)
    {
        setLinie(neuLinie);
        setSitzplaetze(neuSitzplaetze);
        setNiederflur(false);
    }
    
    public Bus(String neuLinie)
    {
        setLinie(neuLinie);
        setSitzplaetze(0);
        setNiederflur(false);
    }
    
    public Bus()
    {
        setLinie("UNKN");
        setSitzplaetze(0);
        setNiederflur(false);
    }
    
    
    //get-Methoden
    public String getLinie()
    {
        return linie;
    }
    
    public int getSitzplaetze()
    {
        return sitzplaetze;
    }
    
    public boolean getNiederflur()
    {
        return niederflur;
    }
    
    
   //set-Methoden
   public void setLinie(String neuLinie)
    {
        linie = neuLinie;
    }
    
    
   // set-methode
   // add this methode
   public void setlinie(String linie)
   {
       this.linie = linie;
   }
   
   
   /*parameterprüfung
    * watt muss zwischen 1 und 2000 sein
    */ 
   public void setSitzplaetze(int sitzplaetze)
   {
       if((sitzplaetze >= 1) && (sitzplaetze < 2000))
       {
       this.sitzplaetze = sitzplaetze;
       }
       else
       {
           System.out.println("Fehler: sitzplaetze muss zwischen 1 und 2000 sein!");
           this.sitzplaetze = 1;
       }
    }
   
    
    
   public void setNiederflur(boolean niederflur)
   {
       this.niederflur = niederflur;
   }
   
   
   
   // print-methode 
   // System.out.println("Lautsprecher "+hersteller+" - bluetooth: "+bluetooth+" - " + " - "+watt+" watt");
   
   // add ifPrint
   public void printBus()
   {
     if (niederflur == true)
     {
        System.out.println("Bus "+linie+" - niederflur - " + " - "+sitzplaetze+" sitzplaetze");
     }
     else
     {
        System.out.println("Bus "+linie+" - kein niederflur - " + " - "+sitzplaetze+" sitzplaetze");
     }
   
    }
    
    
}
