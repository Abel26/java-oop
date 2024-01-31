package ContohAbstrak;

public abstract class Suhu{
    String color;
    
    void setColor(String color){
        this.color = color;
    }
    
    String getColor(){
        return this.color;
    }
    
    abstract double getArea();
}