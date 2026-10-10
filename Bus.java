public class Bus
{
    private String linie;
    private int hoehe;
    private boolean ausziehbar;
    
    public String getLinie()
    {
        return linie;
    }
    
    public int getHoehe()
    {
        return hoehe;
    }
    
    public boolean getAusziehbar()
    {
        return ausziehbar;
    }
    
    public void setLinie(String neuLinie)
    {
        linie = neuLinie;
    }
    
    public void setHoehe(int neuHoehe)
    {
        hoehe = neuHoehe;
    }
    
        public void setAusziehbar(boolean neuAusziehbar)
    {
        ausziehbar = neuAusziehbar;
    }
    
    public Bus()
    {
        setLinie("UNKN");
        setHoehe(0);
        setAusziehbar(false);
    }
    
    
}