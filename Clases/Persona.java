public class Persona {

    private String nombre ; 
    private char sexo ; 
    private String rfc ; 
    private double altura ; 
    private double peso ; 
    private int edad ; 

    public int calcularImc(){
        double imc=peso/Math.pow(altura,2) ; 
        int res=0 ; 
        if(imc<20){
            res= -1 ; 
        } else if (imc >=20 && imc <=25){
            res=0 ; 
        } else {
            res= 1 ; 
        }
       return res ; 

    }
    public boolean esMayordeEdad (){ 
        boolean mayor=false ; 
        if (edad<=18){
            mayor=true ; 
        }
        return mayor  ; 
    }
    public toString() {
        System.out.println("nombre"+nombre + 
                                        "\n sexo:"+sexo + 
                                        "\n RFC"+rfc +
                                        "\n peso"+peso +
                                        "\n altura"+ altura +
                                        "\n edad"+edad) ; 

    }
    //public double calcularAltura(){
        //return 0 ; 
    //}
    //public int calcularEdad (){
        //return 0 ; 
    //}
      
public static void main(String[] args) {
    Persona= persona1 = new persona ();
    System.out.println("ingresa tu nombre ") ; 
    Scanner scanner= new scanner (System.in) ; 
    String n = scanner.next() ; 
    persona1.setNombre(n) ; 

    System.out.println("ingresa tu edad ") ;
    int e = next 










   /* public void setNombre (String nombre) {
        this.nombre=nombre ; 
    } 

    public void setSexo (char sexo){
        this.sexo= sexo ; 
    }
    public void setRfc (String rfc){
        this.rfc=rfc ; 
    }
    public void setAltura (double altura){
        this.altura=altura ; 
    }
    public void setPeso (double peso ){
        this.peso=peso ; 
    }
    public void setEdad ( int edad){
        this.edad = edad ; 
    }


    public String getNombre(){
        return nombre ; 
    }
    public String getSexo (){
        retun sexo ; 
    }*/









}

 






}