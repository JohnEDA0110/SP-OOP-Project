import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.*;
import java.text.*;
import java.util.*;

public class Main extends JFrame implements ActionListener
{
	//Declare Buttons
    private JButton button1;
    private JButton button2;
    
    //Declare labels
    private JLabel label1, label2;
    
    //Link other classes to this class
    Countries cs = null;
    Converter cc = null;

    Main()
    {
    	//Inherit from other class
        cs = new Countries();
        cc = new Converter();
        
        //Set layout of GUI
        setLayout(new FlowLayout());
        
        //Add label "Main Menu"
        label1 = new JLabel("              Main Menu");
        add(label1);
        label2 = new JLabel("            ");
        add(label2);
        
        //Add button "Countries"
        button1 = new JButton("Countries");
        add(button1);

        //Add button "Currency Conversion"
        button2 = new JButton("Currency Conversion");
        add(button2);
        
        //Enable ActionListener to buttons
        button1.addActionListener(this);
        button2.addActionListener(this);
    }

    public void actionPerformed(ActionEvent c)
    {
        if (c.getSource()==button1)//If button1("Countries") is pressed
        {
        	//Show Country Selection page
            cs.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);//Return to previous page  when closed
            cs.setTitle("Country Selection");//Set the title of program
            cs.setSize(250,250);//Set size of program
            cs.setVisible(true);//Set visibility to true
        }
        else if (c.getSource()==button2)//If button2("Currency Converter") is pressed
        {
        	//Show Currency Converter page
        	cc.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);//Return to previous page  when closed
            cc.setTitle("Country Selection");//Set the title of program
            cc.setSize(500, 500);//Set size of program
            cc.setVisible(true);//Set visibility to true
        }
    }
    
    //main method
    public static void main(String[] args)
    {
    	//Show Main page
        Main gui = new Main();
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Terminates program when closed
        gui.setTitle("Locat-E");//Set size of program
        gui.setSize(250, 250);//Set size of program
        gui.setVisible(true);//Set visibility to true
    }
}