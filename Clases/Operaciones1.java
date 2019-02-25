import java.util.Scanner; 
public class Operaciones1 {

    private float A ; 
    private float B ;
    
    public void setA(float a) {
        A = a;
    }

    public void setB(float b) {
        B = b;
    }

    public float sumarNumeros(){
        return A+B ; 
    }

    public float restarNumeros(){
        return A-B ; 
    }

    public float multiplicarNumeros(){
        return A*B ; 
    }

    public float dividirNumeros(){
        return A/B ; 
    }

 public static void main(String[] args) {
    Operaciones1 op= new Operaciones1 () ; 
    
    op.setA(2);
    op.setB(3);
    Scanner scanner = new Scanner (System.in) ; 

    int opc = 0 ; 

    while (opc !=0){
        System.out.println ("1 sumar---\n 2 restar----\n 3 multiplicar----\4 dividir  ") ;
        opc = scanner.nextInt() ; 

        switch (opc){
            case 1 : 
            System.out.println(op.sumarNumeros()) ;

            break ; 

            case 2 : 
            System.out.println(op.restarNumeros()) ;

            break ; 

            case 3 : 
            System.out.println(op.multiplicarNumeros()) ;

            break ;
            
            case 4 : 
            System.out.println(op.dividirNumeros()) ;

            break ; 




        }
    }
 }


 
    

















}