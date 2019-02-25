import java.util.Scanner; 
public class Operaciones2{
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
        
        Operaciones2 op= new Operaciones2 () ; 
    
        op.setA(5);
        op.setB(5);
        Scanner scanner = new Scanner (System.in) ; 
    
        int opc = 0 ; 
        while (opc !=6){
            System.out.println (  "\n 1 sumar \n 2 restar \n 3 multiplicar \n 4 dividir  ") ;
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