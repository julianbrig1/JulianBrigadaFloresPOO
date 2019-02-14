import java.util.Scanner ; 
public class Password2 {
    //atributos 
    private int longitud ; 
    private String password ;

 
    public int getLongitud() {
        return longitud;
    }

  
    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

 
    public String getPassword() {
        return password;
    }


    public void setPassword(String password) {
        this.password = password;
    }
public boolean esFuerte (){
    if (password.length()<8){
        return false ; 

    }else {
        return true ; 
    }
}
public static void main(String[] args) {
    Password2 p1= new Password2(); 
    p1.setPassword("hola que hace amigo xd ") ; 

    if(p1.esFuerte()){
        System.out.println("es fuerte");

    }else{
        System.out.println("cambia tu contraseña");
    }
}

}


