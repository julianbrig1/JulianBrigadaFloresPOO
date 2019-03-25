import java.util.Scanner ; 
public class Arrys{

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner (System.in) ; 
        System.out.println(" ingrese numero de calificaciones :") ; 
        int nc= scanner.nextInt() ;

        float[]argss;  
        argss= new float[nc] ;
        float cont=0 ; 
        
        for(int i =0; i<argss.length; i++){
            System.out.println(" ingrese calificasion "+(i+1)+":") ; 
            argss[i]=scanner.nextFloat() ; 
         

        }

        for(int i=0 ; i<nc; i++){
            System.out.println(" calificasion :"+i) ; 
            System.out.println(argss[i]) ; 
            cont=cont + argss[i] ;
            
            
        }
        System.out.println(" el promedio es: "+cont/nc) ; 
    }











}