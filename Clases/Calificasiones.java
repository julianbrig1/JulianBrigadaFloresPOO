import java.util.Scanner ; 
public class Calificasiones{

private double promedio ;
private int numeroCalificasiones; 
    


    public double getPromedio() {
        return promedio;
    }

  
    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
    public int getNumeroCalificasiones() {
        return numeroCalificasiones;
    }


    public void setNumeroCalificasiones(int numeroCalificasiones) {
        this.numeroCalificasiones = numeroCalificasiones;
    }




    public void calcularPromedio(double sumaria){
        promedio= sumaria /numeroCalificasiones ; 

    }
    public static void main(String[] args) {
        

        Calificasiones c = new Calificasiones () ; 
        Scanner scanner = new Scanner(System.in) ; 
        System.out.println("cuantas calificasiones vas a promediar ") ; 
        int n =scanner.nextInt() ; 

        c.setNumeroCalificasiones(n); 
        double sumatoria =0 ; 

        for (int i= 0 ; i<c.getNumeroCalificasiones(); i++ ){
            System.out.println("ingresa la califcasion "+(i+1)); 
            double aux = scanner.nextDouble() ; 
            sumatoria=sumatoria+aux ; 


        }
        c.calcularPromedio(sumatoria);
        System.out.println("el promedio es " + c.getPromedio());











    }













}