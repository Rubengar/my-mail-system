
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
    //asunto
    private String subject;
    
    /**
     * Constructor for objects of class MailItem
     */
    public MailItem(String from, String to, String message,String subject)
    {
        // initialise instance variables
       this.from = from;
       this.to = to;
       this.subject = subject;
       this.message = message;
        
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
     * Metodo que devuelve el asunto del mensage
     */
    public String getSubject()
    {
        return subject;
    }
    /**
     * Metodo que muestra por pantalla los datos del email
     */
    public void print()
    {
            System.out.println("Mensage de: " + from);
            System.out.println("Para: " + to);
            System.out.println("Asunto: " + subject);
            System.out.println( message );
    }
  
}
