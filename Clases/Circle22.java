import java.util.Scanner ; 
public class Circle22 extends GeometricObject{
   
    private double radius ;

    //constructor 
    Circle22(){}

    Circle22 (double radius){
        this.radius=radius ; 
    }
    Circle22 (double radius, String color, boolean filled){
        super (color, filled ) ; 
        this.radius=radius ; 
        
        
    }
  
    public double getRadius() {
        return radius;
    }


    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea (){
        return Math.PI * (radius*radius) ; 
    }

    public double getPerimeter (){
        return 2*Math.PI * radius ; 
          
    }

  
    
    /*public static void main(String[] args) {
        Circle22 cir1 = new Circle22(10) ; 
        Scanner scanner = new Scanner(System.in);
        Scanner teclado = new Scanner(System.in);
        Scanner teclado1 = new Scanner(System.in);
        boolean fill = false;

        System.out.println("Que color va a tener : ");
        String color = teclado.nextLine();

        System.out.println("Quieres que tenga relleno \n SI=true \n NO=false");
        boolean filled = teclado1.nextBoolean();
        
        System.out.println("el area es  "+cir1.getArea()) ;
        System.out.println("el perimetro es  "+cir1.getPerimeter()) ;
        System.out.println("EL COLOR ES DE : "+color);
        if (filled==true){
            System.out.println("CON RELLENO");
        }else{
            System.out.println("SIN RELLENO");
        }



    }*/

    

    

}