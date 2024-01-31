public class Samsung implements Phone{
    private int volume;
    private boolean isPowerOn;
    
    public Samsung(){
        this.volume = 30;
    }
    
    @Override
    public void powerOn(){
        isPowerOn = true;
        System.out.println("HP ON");
        System.out.println("WELCOME TO SAMSUNG");
    }
    
    @Override
    public void powerOff(){
        isPowerOn = false;
        System.out.println("HP OFF");
        System.out.println("SHUTDOWN PHONE");
    }
    
    @Override
    public void volumeUp(){
        if(isPowerOn){
            if(this.volume == MAX_VOLUME){
                System.out.println("Volume Full!!!");
                System.out.println("Sudah " + this.getVolume() + "%");
            }else{
                this.volume += 10;
                System.out.println("Volume sekarang: " + this.getVolume() + "%");
            }
        }
    }
    
    @Override
    public void volumeDown(){
        if(isPowerOn){
            if(this.volume == MIN_VOLUME){
                System.out.println("Volume = 0%");
            }else{
                this.volume -= 10;
                System.out.println("Volume sekarang: " + this.getVolume() + "%");
            }
        }
    }
    
    public int getVolume(){
        return this.volume;
    }
}