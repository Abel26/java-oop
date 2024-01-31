public class ButtonApp{
    static String title = "Tutorial Anonymous Class";
    
    public static void main(String[] args){
        Button btn = new Button();
        
        String name = "Petani kode";
        
        // membuat class anonymous untuk implementasi interface
        btn.setClickAction(new Clickable(){
            String message = "Belajar Anonymous Class di Java";
            @Override
            public void onClick() {
                System.out.println("Tombol sudah diklik!");
                System.out.println("Yay!");
                // Mengakses varibel
                System.out.println("Hello " + name);
                System.out.println(title);
                System.out.println(message);
                }      
            });
        // mencoba klik tombol
        btn.doClick();
    }
}