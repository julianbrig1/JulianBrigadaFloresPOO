import java.util.*;


public class Estudiante{
    private  String courseName;
    private String[] nombre = new String [100];
    private String[] a_paterno = new String [100];
    private String[] a_materno = new String [100];
    private String[] anio_nacimiento = new String [100];
    private String[] correo = new String [100];
    private int numberOfNameStudents;
    private int numberOfcorreoStudents ;
    private int numberOfanio_nacimientoStudents;
    private int numberOfa_maternoStudents; 
    private int numberOfa_paternoStudents;

    public void addNombre(String nombres)
    {
        nombre[numberOfNameStudents] = nombres;
        numberOfNameStudents++;
    }

    public void deletNombre(String nombres)
    {
        nombre[numberOfNameStudents] = nombres;
        numberOfNameStudents--;
    }

    public String[] getNombre() 
    {
        return nombre;
    }
    public int getNumberOfNameStudents() 
    {
        return numberOfNameStudents;
    }

    public void addApaterno(String Apaternos)
    {
        a_paterno[numberOfa_paternoStudents] = Apaternos;
        numberOfa_paternoStudents++;
    }

    public void deletApaterno(String Apaternos)
    {
        a_paterno[numberOfa_paternoStudents] = Apaternos;
        numberOfa_paternoStudents--;
    }

    public String[] getApaterno() 
    {
        return a_paterno;
    }
    public int getNumberOfApaternoStudents() 
    {
        return numberOfa_paternoStudents;
    }

    public void addAmaterno(String Amaternos)
    {
        a_materno[numberOfa_maternoStudents] = Amaternos;
        numberOfa_maternoStudents++;
    }

    public void deletAmaterno(String Amaterno)
    {
        a_materno[numberOfa_maternoStudents] = Amaterno;
        numberOfa_maternoStudents--;
    }

    public String[] getAmaterno() 
    {
        return a_materno;
    }
    public int getNumberOfAmaternoStudents()
     {
        return numberOfa_maternoStudents;
    }
    
    public void addAnio_nacimiento(String anio_nacimientos)
    {
        anio_nacimiento[numberOfanio_nacimientoStudents] = anio_nacimientos;
        numberOfanio_nacimientoStudents++;
    }

    public void deletAnio_nacimiento(String anio_nacimientos)
    {
        anio_nacimiento[numberOfanio_nacimientoStudents] = anio_nacimientos;
        numberOfanio_nacimientoStudents--;
    }

    public String[] getAnio_nacimiento()
     {
        return anio_nacimiento;
    }
    public int getNumberOfAnio_nacimientoStudents()
     {
        return numberOfanio_nacimientoStudents;
    }
    
    public void addCorreo(String correos)
    {
        correo[numberOfcorreoStudents] = correos;
        numberOfcorreoStudents++;
    }

    public void deletCorreos(String correos)
    {
        correo[numberOfcorreoStudents] = correos;
        numberOfcorreoStudents--;
    }

    public String[] getcorreo()
     {
        return correo;
    }
    public int getNumberOfcorreoStudents()
     {
        return numberOfcorreoStudents;
    }
    
    public static void main(String[] args) 
    {
        Estudiante c1= new Estudiante();
        Scanner scanner = new Scanner(System.in);

        int opc=0;
        while (opc!=6)
        {

            System.out.println("-----menu------");
            System.out.println("1: ingrese nombre de curso");
            System.out.println("2: ingrese estudiante");
            System.out.println("3: mostrar estudiante ");
            System.out.println("4: mostrar estudiantes ");
            System.out.println("5: eliminar estudiante ");
            System.out.println("6: salir ");
            opc = scanner.nextInt();
            switch (opc)
            {
                case 1:
                    System.out.println("curso : ");
                    c1.courseName = scanner.next();
                break;
                case 2:
                    System.out.println("nombre de estudiante");
                    String a = scanner.next();
                    c1.addNombre(a);
                    System.out.println("apellido paterno ");
                    String b = scanner.next();
                    c1.addApaterno(b);
                    System.out.println("apelido materno ");
                    String c = scanner.next();
                    c1.addAmaterno(c);
                    System.out.println("año de nacimiento");
                    String d = scanner.next();
                    c1.addAnio_nacimiento(d);
                    System.out.println("e-mail");
                    String e = scanner.next();
                    c1.addCorreo(e);
                break;
                case 3:
                    System.out.println(c1.courseName);
                    for(int i=0; i < c1.getNumberOfNameStudents(); i++)
                    {
                     System.out.println("nombre Estudiante "+(i+1)+": "+c1.nombre[i]);
                     System.out.println("apellido paterno "+(i+1)+": "+c1.a_paterno[i]);
                     System.out.println("apellido materno "+(i+1)+": "+c1.a_materno[i]);
                     System.out.println("año de nacimiento  "+(i+1)+": "+c1.anio_nacimiento[i]);
                     System.out.println("e-mail de estudiante "+(i+1)+": "+c1.correo[i]);
                    
                    }

                break;
                case 4:
                    System.out.println("total de estudiantes: "+c1.getNumberOfNameStudents());

                break;
                case 5:
                    System.out.println("eliminar estudiante");
                    String ok = scanner.next();
                        c1.deletNombre(ok);
                        c1.deletApaterno(ok);
                        c1.deletAmaterno(ok);
                        c1.deletAnio_nacimiento(ok);
                        c1.deletCorreos(ok);

                break;
                default: System.out.println("bye");
                break;
            }
    }
    }
}
