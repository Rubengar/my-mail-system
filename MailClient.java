
/**
 * Write a description of class mailClient here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MailClient
{
    //servidor
    private MailServer server;
    //usuario
    private String user;
    

    /**
     * Constructor for objects of class mailClient
     */
    public MailClient(String usuario, MailServer servidor)
    {
        // initialise instance variables
       server = servidor;
       user = usuario;
    }
    /**
     * metodo que recupera del servidorel siguiente correo que 
     * tenga el usuario y devuelva dicho objeto.
     */
    public MailItem getNextMailItem()
    {
        return server.getNextMailItem(user);
    }
     //A partir de aqui , ya no fui capaz de hacerlo y lo copie del otro
    /**
     * Print the next mail item (if any) for this user to the text 
     * terminal.
     */
    public void printNextMailItem()
    {
        MailItem item = server.getNextMailItem(user);
        if(item == null) {
            System.out.println("No new mail.");
        }
        else {
            item.print();
        }
    }

    /**
     * Send the given message to the given recipient via
     * the attached mail server.
     * @param to The intended recipient.
     * @param message The text of the message to be sent.
     */
    public void sendMailItem(String to, String message)
    {
        MailItem item = new MailItem(user, to, message);
        server.post(item);
    }
}
