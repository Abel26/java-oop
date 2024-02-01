package ContohAbstrak;

public class FahrenheitToKelvin extends Suhu{
    private double fahrenheit;
    
    public FahrenheitToKelvin(double fahrenheit){
        this.fahrenheit = fahrenheit;
    }
    
    @Override
    double getArea(){
        return 0.55 * (fahrenheit - 32) + 273;
    }
}
