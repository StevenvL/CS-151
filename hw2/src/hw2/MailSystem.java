package hw2;

import java.util.ArrayList;

/**
   A system of voice mail boxes.
*/
public class MailSystem
{
   /**
      Constructs a mail system with a given number of mailboxes
      @param mailboxCount the number of mailboxes
   */
   public MailSystem(int mailboxCount)
   {
      mailboxes = new ArrayList<>();
      // Initialize mail boxes.

      for (int i = 0; i < mailboxCount; i++)
      {
         String passcode = "" + (i + 1);
         String greeting = "You have reached mailbox " + (i + 1)
               + ". \nPlease leave a message now.";
         mailboxes.add(new Mailbox(passcode, greeting));
      }
   }

   /**
      Locate a mailbox.
      @param ext the extension number
      @return the mailbox or null if not found
 * @throws Exception 
   */
   public Mailbox findMailbox(String ext) throws Exception
   {
      int i = Integer.parseInt(ext);
      if (1 <= i && i <= mailboxes.size())
         return  mailboxes.get(i - 1);
      else {
    	  throw new Exception("Invalid entry, please try again.");
      }
   }

   private ArrayList<Mailbox> mailboxes;
}
