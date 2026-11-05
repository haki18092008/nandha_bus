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
    
    public void setSitzplaetze(int neuSitzplaetze)
    {
        sitzplaetze = neuSitzplaetze;
    }
    
    public void setNiederflur(boolean neuNiederflur)
    {
        niederflur = neuNiederflur;
    }
    
    
}
