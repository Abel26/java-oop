package ContohAbstrak;
import java.util.Scanner;

public class ShapeApp{
    static int base;
    static int height;
    static float radius;
    static int side;
    public static void main(String[] args){
        Scanner terminalInput = new Scanner(System.in);
        // Inputan Triangle
        System.out.println("Menghitung luas segitiga");
        System.out.print("Alas: ");
        base = terminalInput.nextInt();
        System.out.print("Tinggi: ");
        height = terminalInput.nextInt();
        // Membuat objek Triangle
        Shape segitiga = new Triangle(base,height);
        
        
        // Inputan Circle
        System.out.println("\nMenghitung luas lingkaran");
        System.out.print("Radius: ");
        radius = terminalInput.nextFloat();
        // Membuat objek Circle
        Shape lingkaran = new Circle(radius);
        
        // Inputan Rectangle
        System.out.println("\nMenghitung luas persegi");
        System.out.print("Sisi: ");
        side = terminalInput.nextInt();
        // Membuat objek Circle
        Shape persegi = new Rectangle(side);
        
        System.out.println("\nLuas Segitiga  : " + segitiga.getArea());
        System.out.println("Luas Lingkaran : " + lingkaran.getArea());
        System.out.println("Luas Persegi : " + persegi.getArea());
    }
}
