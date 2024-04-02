import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PhilippinesFood extends JFrame
{
	private ImageIcon Image = new ImageIcon(getClass().getResource("Philippines.jpg"));
	
	private ImageIcon Kare = new ImageIcon(getClass().getResource("Philippines5.jpg"));
	private ImageIcon Sisig = new ImageIcon(getClass().getResource("Philippines6.jpg"));
	private ImageIcon Isaw = new ImageIcon(getClass().getResource("Philippines7.jpg"));
	private ImageIcon Halo = new ImageIcon(getClass().getResource("Philippines8.jpg"));
	
	private JLabel Flag = new JLabel(Image);
	
	private JLabel KareI = new JLabel(Kare);
	private JTextArea KareT = new JTextArea("\n\n\nKare-Kare.\n\n"
			+ "DescriptionKare-kare is a Philippine stew\n"
			+ "complemented with a thick savory peanut\n"
			+ "sauce. It is made from a variation base of\n"
			+ "stewed oxtail, pork hocks, calves feet, pig feet, beef stew meat, and occasionally offal or tripe. "
			+ "Kare-kare can also be made with seafood or\n"
			+ "vegetables.");
	
	private JLabel SisigI = new JLabel(Sisig);
	private JTextArea SisigT = new JTextArea("\n\nSisig. \n\n"
			+ "Sisig is a Kapampangan dish made from parts "
			+ "of pig head and chicken liver, usually seasoned"
			+ "with calamansi, onions and chili peppers. Sisig was first mentioned in a Kapampangan\n"
			+ "dictionary in the 17th Century meaning \n"
			+ "\"to snack on something sour\" and \"salad\".");
	
	private JLabel IsawI = new JLabel(Isaw);
	private JTextArea IsawT = new JTextArea("\n\n\nIsaw. \n\n"
			+ "Isaw is a street food from the Philippines,\n"
			+ "made from barbecued pig or chicken \n"
			+ "intestines. The intestines are cleaned, turned\n"
			+ "inside out, and cleaned again, repeating the\n"
			+ "process several times; they are then either\n"
			+ "boiled, then grilled, or immediately grilled on\n"
			+ "sticks.");
	
	private JLabel HaloI = new JLabel(Halo);
	private JTextArea HaloT = new JTextArea("\n\n\n\nHalo-Halo. \n\n"
			+ "Halo-halo is a popular Filipino cold dessert\n"
			+ "which is a concoction of crushed ice,\n"
			+ "evaporated milk and various ingredients\n"
			+ "including, among others, ube, sweetened\n"
			+ "beans, coconut julienes, sago, gulaman, pinipig"
			+ "rice, boiled root crops in cubes, fruit slices,\n"
			+ "flan, and topped with a scoop of ice cream.");
	
	public PhilippinesFood()
	{
		setLayout(new BorderLayout());//Set layout
        
        JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		
		panel1.setLayout(new GridLayout(1,1));
		panel1.setBackground(Color.GRAY);
		panel2.setLayout(new GridLayout(2,4));
		panel2.setBackground(Color.WHITE);
		
		panel1.add(Flag);
		
		panel2.add(KareT);
		KareT.setLineWrap(true);
		panel2.add(KareI);
		
		panel2.add(SisigT);
		SisigT.setLineWrap(true);
		panel2.add(SisigI);
        
		panel2.add(IsawT);
		IsawT.setLineWrap(true);
		panel2.add(IsawI);
		
		panel2.add(HaloT);
		HaloT.setLineWrap(true);
		panel2.add(HaloI);

        add(panel1, BorderLayout.NORTH);
        add(panel2, BorderLayout.CENTER);
	}
	
	public static void main(String[] args)
	{
		PhilippinesFood gui = new PhilippinesFood();
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gui.setVisible(true);
		gui.setSize(1000,750);
		gui.setTitle("Philippines Food");
	}
}
