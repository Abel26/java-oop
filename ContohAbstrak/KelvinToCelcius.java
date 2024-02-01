package ContohAbstrak;

public class KelvinToCelcius extends Suhu{
    private double kelvin;
    
    public KelvinToCelcius(double kelvin){
        this.kelvin = kelvin;
    }
    
    @Override
    double getArea(){
        return kelvin - 273;
    }
}