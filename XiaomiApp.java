import java.util.Scanner;

public class XiaomiApp{
    public static void main(String[] args){
        // membuat objek hp
        Phone pocoC65 = new Xiaomi();
        
        // membuat objek user
        PhoneUser abel = new PhoneUser(pocoC65);
        
        // nyalakan hp
        abel.turnOnThePhone();
        
        Scanner terminalInput = new Scanner(System.in);
        String aksi;
        
        while(true){
            System.out.println("=== APLIKASI INTERFACE ===");
            System.out.println("[1] Nyalakan HP");
            System.out.println("[2] Matikan HP");
            System.out.println("[3] Perbesar Volume");
            System.out.println("[4] Kecilkan Volume");
            System.out.println("[0] Keluar");
            System.out.println("--------------------------");
            System.out.print("Pilih aksi: ");
            aksi = terminalInput.nextLine();
            
            if(aksi.equalsIgnoreCase("1")){
                abel.turnOnThePhone();
            } else if (aksi.equalsIgnoreCase("2")){
                abel.turnOffThePhone();
            } else if (aksi.equalsIgnoreCase("3")){
                abel.makePhoneLouder();
            } else if (aksi.equalsIgnoreCase("4")){
                abel.makePhoneSilent();
            } else if (aksi.equalsIgnoreCase("0")){
                System.exit(0);
            } else {
                System.out.println("Kamu memilih aksi yang salah!");
            }
        
        }
        
    }
}