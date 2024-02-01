package ContohAbstrak;

public class CelciusToKelvin extends Suhu{
    private double celcius;
    
    public CelciusToKelvin(double celcius){
        this.celcius = celcius;
    }
    
    @Override
    double getArea(){
        return celcius + 273;
    }
}
