import java.util.Scanner;

public class DroneApp{
    public static void main(String[] args){
        Scanner terminalInput = new Scanner(System.in);
        // Membuat objek pemain
        Drone pemain = new Drone();
        final String merk = "DJI";
        
        // Input
        System.out.print("Input energi:");
        int energi = terminalInput.nextInt();
        
        System.out.print("Input ketinggian:");
        int ketinggian = terminalInput.nextInt();
        
        System.out.print("\nInput kecepatan:");
        int kecepatan = terminalInput.nextInt();
        
        
        
        // Mengisi atribut pemain
        pemain.energi = energi;
        pemain.ketinggian = ketinggian;
        pemain.kecepatan = kecepatan;
        pemain.merk = merk;
        
        // Output
        pemain.terbang();
        pemain.matikanMesin();
        pemain.turun();
        pemain.belok();
        pemain.maju();
        pemain.mundur();
    }
}