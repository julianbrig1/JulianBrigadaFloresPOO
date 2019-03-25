import java.util.Scanner ; 
public class Palindromof {

   private String palabra ;

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }
   
    public String cambiarPalabra(){
        String palabraCambiada=""; 
        int longitud = palabra.length() ; 
        while(longitud>0){
            palabraCambiada += palabra.charAt(longitud-1) ; 
            longitud-- ; 

        }
        return palabraCambiada ; 
    }
    public void evaluarPalabras (String palabra2 ) {
        if (palabra.equalsIgnoreCase(palabra2)){
            System.out.println("es un palindromo ");
        }else {
            System.out.println("no es un palindromo "); 
        }




    }
   

public static void main(String[] args) {
    Palindromo p = new Palindromo() ; 
    Scanner scanner = new Scanner(System.in) ; 
    int n ;  
    int opc=0  ; 
    String aux="" ;
    int a ; 
    System.out.println("numero de veces ");
    a= scanner.nextInt() ; 
    for(n=0; n <=a; n++){
        System.out.println("--------palindromos------\n 1 pedir palabra \n 2 evaluar palabra \n 3 salir ");
        opc = scanner.nextInt() ;
         
        switch (opc) {
            case 1:
            System.out.println("escribe una palabra ") ; 
             aux = scanner.next() ; 
                break;
        

            case 2 : 
            p.setPalabra(aux); 
            String cambiada = p.cambiarPalabra() ; 
            p.evaluarPalabras(cambiada);

            break ; 

            default:
            System.out.println("hey tu lee el menu ");
                break;
        }




    }




   

   


 }









}