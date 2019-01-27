public class Operaciones {
//atributos 

public double a ;
public double b ; 

public double sumarNumeros (){
    return a+b ; 
}
public double restarNumeros ()}{
    return a-b ; 
}
public double dividirNumeros (){
    return a/b ; 
}
public double multiplicarNumeros (){
    return a*b ; 
}
//metodos 

public static void main(String[] args) {
    Operaciones operaciones1 =new Operaciones(); 
    Operaciones1.a = 10 ; 
    Operaciones1.b = 20.2; 

    double suma= operaciones1.sumarNumeros(); 
    System.out.println("el resultuado es "+ suma) ; 

    
    
}






}