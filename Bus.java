public class Bus
{
    private String linie;
    private int sitzplaetze;
    private boolean niederflur;
    
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
    
    public Bus()
    {
        setLinie("UNKN");
        setSitzplaetze(0);
        setNiederflur(false);
    }
    
    
    
}
