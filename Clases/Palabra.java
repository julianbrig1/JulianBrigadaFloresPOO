import java.util.*;


public class Palabra{
    private int longitud;
    private String palabra;



    public void setPalabra(String palabra)
    {
        this.palabra = palabra;
    }    
    public String getPalabra(){
        
        return palabra;
    }
    
   // public String contarLetras()
  //  {

   //     String mensaje ="la palabra "+palabra+" tiene "+palabra.length();
   //     return mensaje;
   // }
   public boolean esMayor (){
    if (palabra.length()>8){
        return false ; 

    }else {
        return true; 
    }
}

    public void setLongitud(int longitud)
    {
        this.longitud = longitud;
    }    
    public int getLongitud(){
        return longitud;
    } 

    public static void main(String[] args) 
    {
        Palabra newpalabra = new Palabra();
        Scanner scanner = new Scanner(System.in);


        System.out.println("Cual es la palabra");
        String palabra = scanner.next();
        newpalabra.setPalabra(palabra);


        //System.out.println(newpalabra.contarLetras());
        if(newpalabra.esMayor())
        {
            System.out.println(" el nombre tiene menos de 8 letras ");
        }
        
            
    
        else{
            System.out.println("el nombre tiene mass de 8 letras ");
        }

    }
}



















