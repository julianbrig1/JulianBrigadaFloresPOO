public class Rectangle {
    //atributos 
    double area ; 
    double length ; 
    double perimeter ; 
    double width ; 
    //metodos 
   // public void Rectangle (double length,width){

    //}
    public void calcArea (){
        area = length*width ; 
    }
    public void calcPerimeter (){
        perimeter = (length*width)/2 ; 
    }
    public double getArea (){
        return area ; 
    }
    public double getPerimeter (){
        return perimeter ; 

    }
    

    
    public void setLength(double length){
     
    }
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle() ;
        Rectangle rectangle2 = new Rectangle() ;
        Rectangle rectangle3 = new Rectangle() ; 

        rectangle1.width = 2.5d ; 
        rectangle2.width = 4.9d ; 
        rectangle3.width = 6.45d ;

        rectangle1.length = 6d ; 
        rectangle2.length = 5d ; 
        rectangle3.length = 3.5d ;

        rectangle1.calcArea() ;
        rectangle2.calcArea() ;
        rectangle3.calcArea() ; 
        System.out.println (" el area del rectangle1 es: " +rectangle1.getArea())  ;
        System.out.println (" el area del rectangle2 es: " +rectangle2.getArea())  ;
        System.out.println (" el area del rectangle3 es: " +rectangle3.getArea())  ;

        rectangle1.calcPerimeter();
        rectangle2.calcPerimeter();
        rectangle3.calcPerimeter();

        System.out.println (" el perimetro del rectangle1 es: " +rectangle1.getPerimeter()) ;
        System.out.println (" el perimetro del rectangle2 es: " +rectangle2.getPerimeter()) ;
        System.out.println (" el perimetro del rectangle3 es: " +rectangle3.getPerimeter()) ;

        

    }

     //crear una clase estudante--nombre--año de nacimieto y constante(año actual)--crear 2 metods
//calcular edad y nombre
//crear un objeto que pina nombre y año y lo guarde-- despues que imprima 








}