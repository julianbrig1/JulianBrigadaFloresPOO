public class GeometricObject {
	//atributos 
	private String color = "negro";
	private boolean filled;
	private java.util.Date dateCreated;
	
	//constructors
	public GeometricObject()
	{
		dateCreated = new java.util.Date();
	}
	public GeometricObject(String color, boolean filled)
	{
		dateCreated = new java.util.Date();
		this.color = color;
		this.filled = filled;
	}
	
	//metodos
	public String getColor()
	{
		return color;
	}
	public boolean getFilled()
	{
		return filled;
	}
	public java.util.Date getDateCreated()
	{
		return dateCreated;
	}
	
	public void setColor(String color)
	{
		this.color = color;
	}
	public void setFilled(boolean filled)
	{
		this.filled = filled;
	}
	
	
	public String toString(){
    return "dentro " + dateCreated + "\n color: " + color + 
    " lleno " + filled;
	}
	
	public static void main(String[] args) {
		Circle22 circulito1 = new Circle22() ; 
		Circle22 circulito2 = new Circle22(23.5) ; 
		Circle22 circulito3 = new Circle22(23.5, "roro", true) ;

		Rectangle22 rectangulito1 = new Rectangle22() ; 
		Rectangle22 rectangulito2 = new Rectangle22(15.3,30.5) ; 
		Rectangle22 rectangulito3 = new Rectangle22(15.3,30.5,"blue",false) ; 


	}
	




  
}