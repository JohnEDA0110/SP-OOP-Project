import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Countries extends JFrame implements ActionListener
{
	//Declare buttons
	private JButton button1, button2, button3, button4, button5;
	//Declare label
	private JLabel label1;
	
	//Link other classes to this class
	France f = null;
	Japan j = null;
	Korea k = null;
	Philippines p = null;
	Singapore s = null;
	
	public Countries()
	{
		//Inherit from other class
		f = new France();
		j = new Japan();
		k = new Korea();
		p = new Philippines();
		s = new Singapore();
		
		//Set layout
		setLayout(new FlowLayout());
		
		//Add label "Select a country"
		label1 = new JLabel("          Select a country          ");
		add(label1);
		
		//Add button France
		button1 = new JButton("France");
        add(button1);
        
        //Add button Japan
        button2 = new JButton("Japan");
        add(button2);
        
        //Add button Korea
        button3 = new JButton("Korea");
        add(button3);
        
        //Add button Philippines
        button4 =new JButton("Philippines");
        add(button4);
        
        //Add button Singapore
        button5 = new JButton("Singapore");
        add(button5);
        
        //Enable ActionListner on buttons
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent c)
	{
		if (c.getSource()==button1)//If button1("France") is pressed
        {
			//Show France page
            f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);//Return to previous page  when closed
            f.setTitle("France");//Set the title of program
            f.setSize(1000,750);//Set size of program
            f.setVisible(true);//Set visibility to true
        }
		else if (c.getSource()==button2)//If button1("Japan") is pressed
        {
			//Show Japan page
        	j.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);//Return to previous page  when closed
            j.setTitle("Country Selection");//Set the title of program
            j.setSize(1000,750);//Set size of program
            j.setVisible(true);//Set visibility to true
        }
		else if (c.getSource()==button3)//If button1("Korea") is pressed
        {
			//Show Korea page
        	k.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);//Return to previous page  when closed
            k.setTitle("Country Selection");//Set the title of program
            k.setSize(1000,750);//Set size of program
            k.setVisible(true);//Set visibility to true
        }
		else if (c.getSource()==button4)//If button1("Philippines") is pressed
        {
			//Show Philippines page
        	p.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);//Return to previous page  when closed
            p.setTitle("Country Selection");//Set the title of program
            p.setSize(1000,750);//Set size of program
            p.setVisible(true);//Set visibility to true
        }
		else if (c.getSource()==button5)//If button1("Singapore") is pressed
        {
			//Show Singapore page
        	s.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);//Return to previous page  when closed
            s.setTitle("Country Selection");//Set the title of program
            s.setSize(1000,750);//Set size of program
            s.setVisible(true);//Set visibility to true
        }
	}
	
	//Main method
	public static void main(String[] args)
	{
		Countries gui = new Countries();
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Return to previous page  when closed
        gui.setTitle("Locat-E");//Set the title of program
        gui.setSize(250, 250);//Set size of program
        gui.setVisible(true);//Set visibility to true
	}
}
