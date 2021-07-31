package presentacion;
import javax.swing.JOptionPane;
import logica.Directorio;
import logica.Contacto;
import java.util.ArrayList;

public class Pantalla 
{
	//De la clase logica, metodo Directorio creamos un directorio:
	private Directorio directorio;
	
	public void presentarManu()
	{
		String [] opciones = 
			{
					"Listar contactos",
					"Ingresar nuevo contacto",
					"Borrar un contacto",
					"Salir"
			};
		String opcion = (String) JOptionPane.showInputDialog(null, 
													"Seleccione una opción",
													"Menú principal",
													JOptionPane.DEFAULT_OPTION,
													null,
													opciones,
													opciones[0]);
		//Ciclo:
		do
		{
		
			if (opcion.equals(opciones[0]))
			{
				//Listar contactos
				ArrayList<Contacto> contactos = directorio.getContactos();
				//Para la siguiente instruccion se creo un metodo toString en clase Contacto: ???? Para que el toString?
				String mensaje = "";
				for (int i = 0; i < contactos.size(); i++)
				{
					mensaje = mensaje + i + "" + directorio.getContacto(i) + "\n";
				}
				JOptionPane.showMessageDialog(null, mensaje);
				
			}
			else if (opcion.equals(opciones[1]))
			{
				//Ingresar contactos
				String nombre= JOptionPane.showInputDialog(null, "Ingrese nombre nuevo contacto");
				String apellido=JOptionPane.showInputDialog(null, "Ingrese apellido nuevo contacto");
				String correo= JOptionPane.showInputDialog(null, "Ingrese correo nuevo contacto");
				int telefono= Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese telefono nuevo contacto"));
				Contacto c = new Contacto(nombre, apellido, correo, telefono);
				directorio.addContacto(c);
				
			}
			
			//TODO completar las siguientes opciones.
			else if (opcion.equals(opciones[2]))
			{
				// Borrar contacto
			}
			else
			{
				//Salir
				JOptionPane.showMessageDialog(null, "Programa terminado");
				break;
			}
			
		} while(true);
		
	}
	
	
	

}
