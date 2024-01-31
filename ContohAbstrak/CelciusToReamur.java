package ContohAbstrak;

public class CelciusToReamur extends Suhu{
    private double celcius;
    
    public CelciusToReamur(double celcius){
        this.celcius = celcius;
    }
    
    @Override
    double getArea(){
        return  celcius * 0.8;
    }
}
