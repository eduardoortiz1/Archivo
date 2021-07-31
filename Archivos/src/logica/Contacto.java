package logica;

public class Contacto 
{
	private String nombre;
	private String apellido;
	private String correo;
	private int telefono;
	
	//Constructores
	
	public Contacto()
	{
		this.nombre = "";
		this.apellido = "";
		this.correo = "";
		this.telefono = 0 ;
	}
	public Contacto(String nombre, String apellido, String correo, int telefono)
	{
		this.nombre = nombre;
		this.apellido = apellido;
		this.correo = correo;
		this.telefono = telefono ;
	}
	
	
	//getters and setters
	public String getNombre() 
	{
		return nombre;
	}
	public void setNombre(String nombre) 
	{
		this.nombre = nombre;
	}
	public String getApellido() 
	{
		return apellido;
	}
	public void setApellido(String apellido) 
	{
		this.apellido = apellido;
	}
	public String getCorreo() 
	{
		return correo;
	}
	public void setCorreo(String correo) 
	{
		this.correo = correo;
	}
	public int getTelefono() 
	{
		return telefono;
	}
	public void setTelefono(int telefono) 
	{
		this.telefono = telefono;
	}
	public String toString()
	{
 		return this.nombre + " "+ this.apellido + " - Correo: " + this.correo + " - Telefono: " + this.telefono;
	}
	

}
