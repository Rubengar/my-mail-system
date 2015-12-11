
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
    
    private int emails;
    
    private MailItem lastMail;
    
    
    

    /**
     * Constructor for objects of class mailClient
     */
    public MailClient(String user, MailServer server)
    {
        // initialise instance variables
       this.server = server;
       this.user = user;
       emails = 0;
    }
    /**
     * metodo que recupera del servidorel siguiente correo que 
     * tenga el usuario y devuelva dicho objeto.
     */
    public MailItem getNextMailItem()
    {
        MailItem email = server.getNextMailItem(user);
        
        if (email.getMessage().contains("trabajo"))
        {
        
        }
        else 
        {
           if (email.getMessage().contains("promocion")|| email.getMessage().contains("regalo"))
           {
            email = null;
        
            }
        }
        
        
        if (email != null) 
        {
            lastMail = email;
        }
   
        return email;
        
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
        else if(item.getMessage().contains("trabajo"))
        {
           item.print();
        }
        else
        {
            if(item.getMessage().contains("promocion")|| item.getMessage().contains("regalo"))
            {
                System.out.println("Ha recibido spam");
            }
       
            else
            {
                item.print();
            }
        }
    }
    

    /**
     * Send the given message to the given recipient via
     * the attached mail server.
     * @param to The intended recipient.
     * @param message The text of the message to be sent.
     */
    public void sendMailItem(String to, String message, String subject)
    {
        MailItem item = new MailItem(user, to, message, subject);
        server.post(item);
    }
    public void howManyMailItemsIHave()
    {
        System.out.println("Emails pendientes en el servidor: " + 
                           server.howManyMailItems(user));
    }
    
    /**
     * Recibe un correo y responde automaticamente indicando
     * que estamos fuera de la oficina
     */
    public void getNextMailItemAndSendAutomaticRespond()
    {   
        MailItem email = getNextMailItem();
        if (email != null)
        {
            sendMailItem(email.getFrom(),
                         "No estoy en la oficina. " + email.getMessage(),
                         "RE: " + email.getSubject());
        }
    }
    /**
     * Muestra por pantalla los datos del ultimo email recibido.
     * En caso de no haber recibido aun ningun email, informa de ello.
     */
    public void muestraUltimoEmail() 
    {
        if(lastMail != null) {
            lastMail.print();
        }
        else {
        System.out.println("No hay ningún mensaje.");
        }
    }
}
