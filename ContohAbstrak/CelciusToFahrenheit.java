package ContohAbstrak;

public class CelciusToFahrenheit extends Suhu{
    private double celcius;
    
    public CelciusToFahrenheit(double celcius){
        this.celcius = celcius;
    }
    
    @Override
    double getArea(){
        return (1.8 * celcius)  + 32;
    }
}
