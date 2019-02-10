import java.util.*;

public class Operacion{
    private double calf1;
    private double calf2;
    private double calf3;
    private double promedio ;

    
    public double setCalf1(double calf1)
    {
        return this.calf1 = calf1;
    }  

    
    public double setCalf2(double calf2)
    {
        return this.calf2 = calf2;
    } 
    
    public double setCalf3(double calf3)
    {
        return this.calf3 = calf3;
    } 

    public double promedio()
    {
        return promedio=(calf1+calf2+calf3)/3;
    }

    
    public static void main(String[] args) {
        Operacion operacion = new Operacion();
        Scanner scanner = new Scanner(System.in);


        System.out.println("Cual es la calificacion 1: ");
        double calf1 = scanner.nextDouble();
        operacion.setCalf1(calf1);

        
        System.out.println("Cual es la calificacion 2: ");
        double calf2 = scanner.nextDouble();
        operacion.setCalf2(calf2);
        
        
        System.out.println("Cual es la calificacion 3: ");
        double calf3 = scanner.nextDouble();
        operacion.setCalf3(calf3);
        
        
        System.out.println(operacion.promedio());

    }
}


