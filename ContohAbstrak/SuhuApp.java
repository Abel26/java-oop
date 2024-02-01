package ContohAbstrak;
import java.util.Scanner;

public class SuhuApp{
    static double celciusToReamur;
    static double celciusToKelvin;
    static double celciusToFahrenheit;
    static double reamurToCelcius;
    static double reamurToKelvin;
    static double reamurToFahrenheit;
    static double fahrenheitToCelcius;
    static double fahrenheitToReamur;
    static double fahrenheitToKelvin;
    static double kelvinToCelcius;
    static double kelvinToReamur;
    static double kelvinToFahrenheit;
    
    public static void main(String[] args){
        Scanner terminalInput = new Scanner(System.in);
        
        /** Konversi Celcius
         * 
         */
        // Inputan celcius to reamur
        System.out.println("Convert Celcius to Reamur");
        System.out.print("Celcius: ");
        celciusToReamur = terminalInput.nextDouble();
        // obj celcius to reamur
        Suhu cToR = new CelciusToReamur(celciusToReamur);
        
        // Inputan celcius to kelvin
        System.out.println("Convert Celcius to Kelvin");
        System.out.print("Celcius: ");
        celciusToKelvin = terminalInput.nextDouble();
        // obj celcius to kelvin
        Suhu cToK = new CelciusToKelvin(celciusToKelvin);
        
        // Inputan celcius to fahrenheit
        System.out.println("Convert Celcius to Fahrenheit");
        System.out.print("Celcius: ");
        celciusToFahrenheit = terminalInput.nextDouble();
        // obj celcius to fahrenheit
        Suhu cToF = new CelciusToFahrenheit(celciusToFahrenheit);
        /** End konversi Celcius
         * 
         */
        
        /**
         * Konversi Reamur
         */
        // Inputan reamur to celcius
        System.out.println("Reamur to Celcius");
        System.out.print("Reamur: ");
        reamurToCelcius = terminalInput.nextDouble();
        // obj reamur to celcius
        Suhu rToC = new ReamurToCelcius(reamurToCelcius);
        
        // Inputan reamur to kelvin
        System.out.println("Reamur to Kelvin");
        System.out.print("Reamur: ");
        reamurToKelvin = terminalInput.nextDouble();
        // obj reamur to kelvin
        Suhu rToK = new ReamurToKelvin(reamurToKelvin);
        
        // Inputan reamur to fahrenheit
        System.out.println("Reamur to Fahrenheit");
        System.out.print("Reamur: ");
        reamurToFahrenheit = terminalInput.nextDouble();
        // obj reamur to fahrenheit
        Suhu rToF = new ReamurToFahrenheit(reamurToFahrenheit);
        /**
         * End konversi reamur
         */
        
        /**
         * Konversi Fahrenheit
         */
        // Inputan fahrenheit to celcius
        System.out.println("Fahrenheit to Celcius");
        System.out.print("Fahrenheit: ");
        fahrenheitToCelcius = terminalInput.nextDouble();
        // obj fahrenheit to celcius
        Suhu fToC = new FahrenheitToCelcius(fahrenheitToCelcius);
        
        // Inputan fahrenheit to reamur
        System.out.println("Fahrenheit to Reamur");
        System.out.print("Fahrenheit: ");
        fahrenheitToReamur = terminalInput.nextDouble();
        // obj fahrenheit to reamur
        Suhu fToR = new FahrenheitToReamur(fahrenheitToReamur);
        
        // Inputan fahrenheit to kelvin
        System.out.println("Fahrenheit to Kelvin");
        System.out.print("Fahrenheit: ");
        fahrenheitToKelvin = terminalInput.nextDouble();
        // obj fahrenheit to reamur
        Suhu fToK = new FahrenheitToKelvin(fahrenheitToKelvin);
        
        /**
         * End konversi Fahrenheit
         */
        
        /**
         * Konversi Kelvin
         */
        // Inputan kelvin to celcius
        System.out.println("Kelvin to Celcius");
        System.out.print("Kelvin: ");
        kelvinToCelcius = terminalInput.nextDouble();
        // obj kelvin to celcius
        Suhu kToC = new KelvinToCelcius(kelvinToCelcius);
        
        // Inputan kelvin to reamur
        System.out.println("Kelvin to Reamur");
        System.out.print("Kelvin: ");
        kelvinToReamur = terminalInput.nextDouble();
        // obj kelvin to reamur
        Suhu kToR = new KelvinToReamur(kelvinToReamur);
        
        // Inputan kelvin to Fahrenheit
        System.out.println("Kelvin to Fahrenheit");
        System.out.print("Kelvin: ");
        kelvinToFahrenheit = terminalInput.nextDouble();
        // obj kelvin to fahrenheit
        Suhu kToF = new KelvinToFahrenheit(kelvinToFahrenheit);
        
        /**
         * End konversi Kelvin
         */
        
        // Output Celcius
        System.out.print("Celcius To Reamur: " + cToR.getArea());
        System.out.print("\nCelcius To Kelvin: " + cToK.getArea());
        System.out.print("\nCelcius To Fahrenheit: " + cToF.getArea());
        
        // Output Reamur
        System.out.print("\nReamur To Celcius: " + rToC.getArea());
        System.out.print("\nReamur To Kelvin: " + rToK.getArea());
        System.out.print("\nReamur To Fahrenheit: " + rToF.getArea());
        
        // Output Fahrenheit
        System.out.print("\nFahrenheit To Celcius: " + fToC.getArea());
        System.out.print("\nFahrenheit To Reamuur: " + fToR.getArea());
        System.out.print("\nFahrenheit To Reamur: " + fToK.getArea());
        
        // Output Kelvin
        System.out.print("\nKelvin To Celcius: " + kToC.getArea());
        System.out.print("\nKelvin To Celcius: " + kToR.getArea());
        System.out.print("\nKelvin To Celcius: " + kToF.getArea());
        
    }
}
