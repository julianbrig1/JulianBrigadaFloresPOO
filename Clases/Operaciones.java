import java.util.Scanner ;

public class Operaciones{

    public double numero1;
    public double numero2 ;
//metodos
    public double sumarNumeros()
    {
        return numero1 + numero2 ;
    }

    public double restarNumeros()
    {
        return numero1 - numero2;
    }

    public double multiplicarNumeros()
    {
        return numero1 * numero2 ;
    }


    public static void main(String[] args)
    {
        Operaciones operaciones1 = new Operaciones();
        Scanner scanner = new Scanner(System.in);

        System.out.println("numero 1  ");
        operaciones1.numero1 = scanner.nextDouble();
        
        System.out.println("nuemro2  ");
        operaciones1.numero2 = scanner.nextDouble();


        double suma = operaciones1.sumarNumeros();
        System.out.println("el resultado es : " + suma) ;

    }
}


