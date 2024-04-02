import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class ConverterTextField extends PlainDocument
{
	private int limit;
	  private boolean toUppercase = false;
	  
	  ConverterTextField(int limit)
	  {
	   super();
	   this.limit = limit;
	  }
	   
	  ConverterTextField(int limit, boolean upper) 
	  {
	   super();
	   this.limit = limit;
	   toUppercase = upper;
	  }
	 
	  public void insertString
	    (int offset, String  str, AttributeSet attr)
	      throws BadLocationException 
	  {
	   if (str == null) return;

	   if ((getLength() + str.length()) <= limit)
	   {
	     if (toUppercase) str = str.toUpperCase();
	     super.insertString(offset, str, attr);
	   }
	  }
}
