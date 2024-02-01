package ContohAbstrak;

public class ReamurToFahrenheit extends Suhu{
    private double reamur;
    
    public ReamurToFahrenheit(double reamur){
        this.reamur = reamur;
    }
    
    @Override
    double getArea(){
        return (2.25 * reamur) + 32;
    }
}
