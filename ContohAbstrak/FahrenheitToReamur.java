package ContohAbstrak;

public class FahrenheitToReamur extends Suhu{
    private double fahrenheit;
    
    public FahrenheitToReamur(double fahrenheit){
        this.fahrenheit = fahrenheit;
    }
    
    @Override
    double getArea(){
        return 0.44 * (fahrenheit - 32);
    }
}