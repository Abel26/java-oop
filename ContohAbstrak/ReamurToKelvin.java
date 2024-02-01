package ContohAbstrak;

public class ReamurToKelvin extends Suhu{
    private double reamur;
    
    public ReamurToKelvin(double reamur){   
        this.reamur = reamur;
    }
    
    @Override
    double getArea(){
        return (1.25 * reamur) + 273;
    }
}
