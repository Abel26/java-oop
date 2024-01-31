public class PlayerApp{
    public static void main(String [] args){
        // membuat objek pemain
        Player pemain = new Player();
        
        // mengisi atribut player
        pemain.name = "Abel";
        pemain.speed = 50;
        pemain.healthPoin = 0;
        
        // menjalankan method run
        pemain.run();
        
        if(pemain.isDead()){
            System.out.println("GAME OVER!!!");
        }
    }
}