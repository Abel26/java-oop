package ContohAbstrak;
import java.util.Scanner;

public class SuhuApp{
    static double celcius;
    public static void main(String[] args){
        Scanner terminalInput = new Scanner(System.in);
        
        // Inputan celcius
        System.out.print("Celcius: ");
        celcius = terminalInput.nextDouble();
        // obj celcius
        Suhu c = new CelciusToReamur(celcius);
        
        
        System.out.print("Celcius To Reamur: " + c.getArea());
    }
}
