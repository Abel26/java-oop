package ContohAbstrak;

public class FahrenheitToCelcius extends Suhu{
    private double fahrenheit;
    
    public FahrenheitToCelcius(double fahrenheit){
        this.fahrenheit = fahrenheit;
    }
    
    @Override
    double getArea(){
        return 0.55 * (fahrenheit - 32);
    }
}