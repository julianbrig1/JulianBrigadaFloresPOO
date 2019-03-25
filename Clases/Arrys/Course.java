import java.util.*; 
public class Course
{
  private String courseName;
  private String[] students = new String[100];
  private int numberOfStudents;

  /*Course(String courseName)
  {
    this.courseName = courseName;
  }*/
  public void addStudent(String student)
  {
    students[numberOfStudents] = student;
    numberOfStudents=numberOfStudents+1;
  }
  
  public void deletStudent(String student)
  {
    students[numberOfStudents] = student;
    numberOfStudents=numberOfStudents-1;
  }

  public String[] getStudents()
  {
    return students;
  }
  public int getNumberOfStudents(){
    return numberOfStudents; 
  }

  public static void main(String[] args) 
  {
    Course c = new Course() ;
    Scanner scanner = new Scanner(System.in);
    int opc=0;
    String aux="";
    String name ; 


    while (opc!=6)
    {
      
      System.out.println("-----menu------");
      System.out.println("1 ingrese nombre del grupo ");
      System.out.println("2 ingrese estudiante ");
      System.out.println("3 mostrar estudiante");
      System.out.println("4 mostar total de estudiantes ");
      System.out.println("5 eliminar estudiante");
      System.out.println("6 salir ");
      opc = scanner.nextInt();
      

      switch (opc) 
      {
        case 1 : 
          System.out.println("ingrese nombre del curso ");
          name = scanner.next();
          System.out.println("nombre del curso: "+name);
        break;

        case 2 :
          System.out.println("ingrese estudiante");
          aux = scanner.next();
          c.addStudent(aux); 
        break ; 

        case 3 :
          for(int i=0; i<c.getNumberOfStudents(); i++){
            System.out.println(" estudiantes registrados: "+c.students[i]);
          }
          
        break ; 

        case 4 : 
          System.out.println("Total estudiantes: "+c.getNumberOfStudents());
        break ; 

        case 5 : 
          System.out.println("que estudiante desea eliminar ") ; 
          String rr = scanner.next();
           c.deletStudent(rr);
          for(int i = 0; i< c.getNumberOfStudents(); i++){
            if(rr.equals(c.students[i])) ; 
          }
          //c.students[i] = "";
        break ; 

        default:
         System.out.println("bye");
        break ; 










      }








      

    }






  }
   









}                  