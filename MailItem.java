
/**
 * Write a description of class MailItem here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MailItem
{
    //de quien es el correo
    private String from;
    //destinatario del correo
    private String to;
    //mensage
    private String message;
    /**
     * Constructor for objects of class MailItem
     */
    public MailItem(String origen, String destino, String mensaje)
    {
        // initialise instance variables
       from = origen;
       to = destino;
       message = mensaje;
    }
    /**
     * Metodo que devuelve de quien es el mensage
     */
    public String getTo()
    {
        return to;
    }
    /**
     * Metodo que devuelve a quien va el mensage
     */
    public String getFrom()
    {
        return from;
    }
    /**
     * Metodo que devuelve cual es el mensage
     */
    public String getMessage()
    {
        return message;
    }
    /**
     * Metodo que muestra por pantalla los datos del email
     */
    public void print()
    {
        System.out.println("Mensage de: " + from);
        System.out.println("Para: " + to);
        System.out.println( message );
    
    }
}
