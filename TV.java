package tv;

public class TV 
{
    private int channel;
    private int volumeLevel;
    private boolean on;
    TV()
    {
        channel=60;
        volumeLevel=4;
        on=false;
    }
    
    void turnOn()
    {
        on=true;
    }
    
    void turnOff()
    {
        on=false;
    }
    
    void setChannel(int newChannel)
    {
        channel = newChannel;
    }
    
    void setVolume(int newVolumeLevel)
    {
        volumeLevel=newVolumeLevel;
    }
    
    void channelUp()
    {
        channel++;
    }
    
    void channelDown()
    {
        channel--;
    }
    
    void volumeUp()
    {
        volumeLevel++;
    }
    
    void volumeDown()
    {
        volumeLevel--;
    }
    
    public static void main(String[] args) 
    {
        TV tv=new TV();
        tv.turnOn();
        tv.setChannel(45);
        tv.setVolume(6);
        tv.channelUp();
        tv.volumeDown();
        tv.channelDown();
        tv.volumeUp();
        tv.turnOff();
    }
    
}
