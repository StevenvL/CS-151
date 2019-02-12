package hw2;

/**
   A message left by the caller.
*/
public class Message
{
   /**
      Construct a Message object.
      @param messageText the message text
   */
   public Message(String messageText)
   {
	   if(messageText.charAt(messageText.length()-1) == '#')
		   text = messageText.substring(0, messageText.length()-1);
	   else
		   text = messageText;
   }

   /**
      Get the message text.
      @return message text
   */
   public String getText()
   {
      return text;
   }

   private String text;
}
