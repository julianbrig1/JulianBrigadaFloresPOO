public class Rectangulo {
 //atributos 
 double largo ; 
 double alto ; 
 //contructor 
 Rectangulo(){}

 Rectangulo (double alto ){

 }
 Rectangulo (int largo){

 }

 Rectangulo(double alto , double largo ){
     this.alto = alto ;
     this.largo = largo ;  
 }
    

 //metodos 
 
    public double getLargo() {
        return largo;
    }
  
    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double calcularArea (){
        return largo*alto ; 
    }



    public static void main(String[] args) {
        Rectangulo rec1 = new Rectangulo(10,20) ; 

        //rec1.setAlto(10);
        //rec1.setLargo(20);


        System.out.println("el area es "+rec1.calcularArea()) ; 
    }



}




















