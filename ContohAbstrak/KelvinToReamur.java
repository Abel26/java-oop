package ContohAbstrak;

public class KelvinToReamur extends Suhu{
    private double kelvin;
    
    public KelvinToReamur(double kelvin){
        this.kelvin = kelvin;
    }
    
    @Override
    double getArea(){
        return 0.8 * (kelvin - 732);
    }
}