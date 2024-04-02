import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SingaporeFood extends JFrame
{
	private ImageIcon Image = new ImageIcon(getClass().getResource("Singapore.jpg"));
	
	private ImageIcon Bak = new ImageIcon(getClass().getResource("Singapore5.jpg"));
	private ImageIcon Chili = new ImageIcon(getClass().getResource("Singapore6.jpg"));
	private ImageIcon Pepper = new ImageIcon(getClass().getResource("Singapore7.jpg"));
	private ImageIcon Laksa = new ImageIcon(getClass().getResource("Singapore8.jpg"));
	
	private JLabel Flag = new JLabel(Image);
	
	private JLabel BakI = new JLabel(Bak);
	private JTextArea BakT = new JTextArea("\n\n\nBak Kut Teh.\n\n"
			+ "Bak-kut-teh is a pork rib dish cooked in broth\n"
			+ "popularly served in Malaysia and Singapore\n"
			+ "where there is a predominant Hoklo and\n"
			+ "Teochew community, and also in neighbouring areas like Riau Islands and Southern Thailand.");
	
	private JLabel ChiliI = new JLabel(Chili);
	private JTextArea ChiliT = new JTextArea("\n\nChili Crab. \n\n"
			+ "Chilli crab is a Singaporean seafood dish. "
			+ "Mud crabs are commonly used and are stir-fried in a semi-thick, sweet and savoury tomato and\n"
			+ "chilli based sauce. Despite its name, chilli crab\n"
			+ "is not a very spicy dish. It is listed at number 35"
			+ "on the World's 50 most delicious foods\n"
			+ "compiled by CNN Go in 2011.");
	
	private JLabel PepperI = new JLabel(Pepper);
	private JTextArea PepperT = new JTextArea("\n\n\n\nBlack Pepper Crab. \n\n"
			+ "Black pepper crab is one of the two most\n"
			+ "popular ways that crab is served in\n"
			+ "Singaporean cuisine. It is made with hard-shell crabs, and fried with black pepper. Unlike\n"
			+ "the other popular chilli crab dish, it is not\n"
			+ "cooked in a sauce and therefore has a dry\n"
			+ "consistency.");
	
	private JLabel LaksaI = new JLabel(Laksa);
	private JTextArea LaksaT = new JTextArea("\n\n\n\nLaksa. \n\n"
			+ "Laksa is a spicy noodle soup popular in\n"
			+ "Peranakan cuisine. Laksa consists of thick\n"
			+ "wheat noodles or rice vermicelli with chicken,\n"
			+ "prawn or fish, served in spicy soup based on\n"
			+ "either rich and spicy curry coconut milk or on\n"
			+ "sour asam. Laksa is found in Indonesia,\n"
			+ "Malaysia, Singapore, and Southern Thailand.");
	
	public SingaporeFood()
	{
		setLayout(new BorderLayout());//Set layout
        
        JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		
		panel1.setLayout(new GridLayout(1,1));
		panel1.setBackground(Color.GRAY);
		panel2.setLayout(new GridLayout(2,4));
		panel2.setBackground(Color.WHITE);
		
		panel1.add(Flag);
		
		panel2.add(BakT);
		BakT.setLineWrap(true);
		panel2.add(BakI);
		
		panel2.add(ChiliT);
		ChiliT.setLineWrap(true);
		panel2.add(ChiliI);
        
		panel2.add(PepperT);
		PepperT.setLineWrap(true);
		panel2.add(PepperI);
		
		panel2.add(LaksaT);
		LaksaT.setLineWrap(true);
		panel2.add(LaksaI);

        add(panel1, BorderLayout.NORTH);
        add(panel2, BorderLayout.CENTER);
	}
	
	public static void main(String[] args)
	{
		SingaporeFood gui = new SingaporeFood();
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gui.setVisible(true);
		gui.setSize(1000,750);
		gui.setTitle("Philippines Food");
	}
}
