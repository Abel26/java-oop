package ContohAbstrak;

public class Rectangle extends Shape{
    private float side;
    
    public Rectangle(int side){
        this.side = side;
    }
    
    @Override
    float getArea(){
        return side * side;
    }
}