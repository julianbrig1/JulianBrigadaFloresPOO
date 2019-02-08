public class Tv
 {

    private int channel ; 
    private int volumeLevel ; 
    private boolean on ; 
    public int getChannel (){
        return channel ; 
    }
    public int getVolumeLevel(){
        return volumeLevel ; 
    }
    public boolean getOn (){
        return on ; 
    }

    public void turnOn ()
    {
        on= true ; 
    }
    public void turnOff()
    {
        on = false ; 
    }
    public void setChannel(int newChannel)
    {
        if (on && newChannel >=1 && newChannel <=120)  {
            channel=newChannel ;
        }   
         
     
    }
    public void setVolume(int newVolumeLevel)
    {
        if(on && newVolumeLevel >=1 && newVolumeLevel <=7){
            volumeLevel=newVolumeLevel ;
        }

        
         
    }
    public void volumeUp()
    {
        if (on && volumeLevel <7 ){
            volumeLevel++ ;
        }
         
    }
    public void volumeDown ()
    {
        if(on && volumeLevel>1 ){
            volumeLevel-- ;
        }
         
    }
    public void chanelUp()
    {
        if (on && channel<112){
            channel++ ;
        }
        
    }
    public void chaneldown ()
    {
        if (on && channel>1 ){
            channel-- ; 
        }
       
    }

    public static void main(String[] args) {
        Tv sony= new Tv () ; 
        sony.turnOn() ; 
        sony.setChannel(212) ; 
        sony.setVolume(7); 
        System.out.println("the tv is "+sony.getOn()) ; 
        System.out.println("the tv is "+sony.getChannel()) ; 
        System.out.println("the tv is "+sony.getVolumeLevel()) ; 

        sony.volumeDown();
        System.out.println(sony.getVolumeLevel());
        sony.volumeDown();
        System.out.println(sony.getVolumeLevel());
        sony.volumeDown();
        System.out.println(sony.getVolumeLevel());

        sony.turnOff() ; 
    }





}