public class Estudiante22 extends Persona22{
    private double calificasion ; 

    //contructor 
    Estudiante22(){}

    Estudiante22 (double calificasion){
        this.calificasion=calificasion ; 
    } 

    Estudiante22(double calificasion ,String nombre, int edad){
        super(nombre, edad) ; 
        this.calificasion= calificasion ; 

    }






}