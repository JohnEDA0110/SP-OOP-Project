import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class France extends JFrame implements ActionListener
{
	//Declare variables
	private ImageIcon Image = new ImageIcon(getClass().getResource("France.jpg"));
	
	private ImageIcon Arc = new ImageIcon(getClass().getResource("France1.jpg"));
	private ImageIcon Tower = new ImageIcon(getClass().getResource("France2.jpg"));
	private ImageIcon Louvre = new ImageIcon(getClass().getResource("France3.jpg"));
	private ImageIcon Palace = new ImageIcon(getClass().getResource("France4.jpg"));
	
	private JLabel Flag = new JLabel(Image);
	
	private JLabel ArcI = new JLabel(Arc);
	private JTextArea ArcT = new JTextArea("\n\nArc de Triomphe.\n\n"
			+ "Located at: \n"
			+ "Place Charles de Gaulle, 75008 Paris, France. \n\n"
			+ "The Arc de Triomphe de l' Étoile is one of the most famous monuments in Paris, standing\n"
			+ "at the western end Of the Champs-Élysées\n"
			+ "at the center of Place Charles de Gaulle,\n"
			+ "formerly named Place de I'Ét0ile — the ét0ile or\n"
			+ "\"star\" Of the juncture formed by its twelve\nradiating avenues.");
	
	private JLabel TowerI = new JLabel(Tower);
	private JTextArea TowerT = new JTextArea("\n\nEiffel Tower. \n\n"
			+ "Located at: \n"
			+ "Champ de Mars, 5 Avenue Anatole France,\n"
			+ "75007 Paris, France. \n\n"
			+"The Eiffel Tower is a wrought-iron lattice tower on the Champ de Mars in Paris, France. It is\n"
			+ "named after the engineer Gustave Eiffel;\n"
			+ "whose company designed and built the tower.");
	
	private JLabel LouvreI = new JLabel(Louvre);
	private JTextArea LouvreT = new JTextArea("\n\n\n\nLouvre Museum. \n\n"
			+ "Located at: \n"
			+ "Rue de Rivoli, 75001 Paris, France. \n\n"
			+ "The Louvre, or the Louvre Museum, is the\n"
			+ "world's largest art museum and a historic monument in Paris, France. A central landmark of\n"
			+ "the city, it is located on the Right Bank of the \n"
			+ "Seine in the city's 1st arrondissement.");
	
	private JLabel PalaceI = new JLabel(Palace);
	private JTextArea PalaceT = new JTextArea("\n\n\n\nPalace of Versailles. \n\n"
			+ "Located at: \n"
			+ "Place d'Armes, 78000 Versailles, France. \n\n"
			+ "The Palace of Versailles was the principal royal"
			+ "residence of France from 1682, under Louis IV,"
			+ "until the Start Of the French Revolution in 1789,"
			+ "under Louis XVI. It is located at the department of Yvelines, in the region ofile-de-France, about"
			+ "20 kilometers southwest Of the center Of Paris.");
	
	private JButton button1 = new JButton("Food");
	
	//Link other class
	FranceFood ff = null;

	France()
	{
		ff = new FranceFood();//Inherit from other class

		setLayout(new BorderLayout());//Set layout
		
		button1 = new JButton("Food");
        add(button1);
        
        JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		
		panel1.setLayout(new GridLayout(1,1));
		panel1.setBackground(Color.GRAY);
		panel2.setLayout(new GridLayout(2,4));
		panel2.setBackground(Color.WHITE);
		panel3.setLayout(new GridLayout(1,2));
		panel3.setBackground(Color.WHITE);
		
		panel1.add(Flag);
		
		panel2.add(ArcT);
		ArcT.setLineWrap(true);
		panel2.add(ArcI);
		
		panel2.add(TowerT);
		TowerT.setLineWrap(true);
		panel2.add(TowerI);
        
		panel2.add(LouvreT);
		LouvreT.setLineWrap(true);
		panel2.add(LouvreI);
		
		panel2.add(PalaceT);
		PalaceT.setLineWrap(true);
		panel2.add(PalaceI);
		
		panel3.add(button1);
		
        button1.addActionListener(this);//Enable ActionListener on button
        
        add(panel1, BorderLayout.NORTH);
        add(panel2, BorderLayout.CENTER);
        add(panel3, BorderLayout.SOUTH);
        
	}
	
	public void actionPerformed(ActionEvent c)
	{
		if (c.getSource()==button1)//If button("Food") is pressed
        {
            ff.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);//Return to previous page  when closed
            ff.setTitle("Food");//Set the title of program
            ff.setSize(1000,750);//Set size of program
            ff.setVisible(true);//Set visibility to true
        }
	}
	
	public static void main(String[] args)
	{
		France gui = new France();
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);;//Return to previous page  when closed
		gui.setVisible(true);//Set the title of program
		gui.setSize(1000,750);//Set size of program
		gui.setTitle("France");//Set visibility to true
	}
}