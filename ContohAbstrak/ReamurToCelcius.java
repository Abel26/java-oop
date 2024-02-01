package ContohAbstrak;

public class ReamurToCelcius extends Suhu{
    private double reamur;
    
    public ReamurToCelcius(double reamur){
        this.reamur = reamur;
    }
    
    @Override
    double getArea(){
        return 1.25 * reamur;
    }
}
