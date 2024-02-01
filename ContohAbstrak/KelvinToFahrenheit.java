package ContohAbstrak;

public class KelvinToFahrenheit extends Suhu{
    private double kelvin;
    
    public KelvinToFahrenheit(double kelvin){
        this.kelvin = kelvin;
    }
    
    @Override
    double getArea(){
        return 1.8 * (kelvin - 273) + 32;
    }
}