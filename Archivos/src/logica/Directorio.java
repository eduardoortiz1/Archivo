package logica;
import java.util.ArrayList;

public class Directorio 
{
	private ArrayList<Contacto> contactos = new ArrayList<Contacto>();
	// Para adicionar un conatcto
	public void addContacto(Contacto c)
	{
		contactos.add(c);
	}
	
	// Para optener todos los contactos:
	public ArrayList<Contacto> getContactos()
	{
		return this.contactos;
	}
	
	//Para optener un solo contacto:
	public Contacto getContacto (int index)
	{
		return this.contactos.get(index);
	}
	// Para borrar un contacto:
	public void deleteContacto(int index)
	{
		this.contactos.remove(index);
	}


}

