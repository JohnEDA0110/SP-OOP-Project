import javax.swing.*;
import java.awt.*;

public class ConvertionPage
{
	public static void main(String[] args)
	{
		try
		{
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} 
		catch (Throwable e) 
		{
			e.printStackTrace();
		}
		
		EventQueue.invokeLater(new Runnable() 
		{
			public void run()
			{
				try
				{
					// Create and show main window at startup
					Converter convert = new Converter();
					convert.setVisible(true);
				} 
				catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}
}
