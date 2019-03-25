
import java.util.Scanner ; 

public class Rectangle22 extends GeometricObject {
 
private double width ; 
private double height ;


    //constructor 
    Rectangle22(){}

    Rectangle22 (double width, double height){
        this.width= width ; 
        this.height=height ; 

    }
    Rectangle22(double height, double width, String color, boolean filled){
        super (color, filled ) ; 
        this.height = height;
        this.width = width;
    }
       


    public double getWidth() {
        return width;
    }


    public void setWidth(double width) {
        this.width = width;
    }


    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea(){
        return height*width ; 
    }

    public double getPerimeter(){
        return (height*width)/2 ; 
    }
    




   

 /*public static void main(String[] args) {
    Rectangle22 rec1 =new Rectangle22(20, 30) ; 
    Scanner scanner = new Scanner(System.in) ;
    Scanner teclado = new Scanner(System.in);
    Scanner teclado1 = new Scanner(System.in);
    boolean fill = false;
    
    System.out.println("Que color va a tener : ");
    String color = teclado.nextLine();

    System.out.println("Quieres que tenga relleno \n SI=true \n NO=false");
    boolean filled = teclado1.nextBoolean();


   


    System.out.println("el area es"+rec1.getArea()) ;
    System.out.println("el perimetro es "+rec1.getPerimeter()) ;
    


    System.out.println("EL COLOR ES DE : "+color);
            
            
    if (filled==true){
        System.out.println("CON RELLENO");
    }else{
        System.out.println("SIN RELLENO");
    }



 }*/

  

  






}