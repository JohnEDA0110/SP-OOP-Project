import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FranceFood extends JFrame
{
	private ImageIcon Image = new ImageIcon(getClass().getResource("France.jpg"));
	
	private ImageIcon Boulette = new ImageIcon(getClass().getResource("France5.jpg"));
	private ImageIcon Soupe = new ImageIcon(getClass().getResource("France6.jpg"));
	private ImageIcon Tarte = new ImageIcon(getClass().getResource("France7.jpg"));
	private ImageIcon Chouquette = new ImageIcon(getClass().getResource("France8.jpg"));
	
	private JLabel Flag = new JLabel(Image);
	
	private JLabel BouletteI = new JLabel(Boulette);
	private JTextArea BouletteT = new JTextArea("\n\n\n\nBoulette d'Avesnes.\n\n"
			+ "Avesnes Meatball is a cow's milk cheese made"
			+ "in Avesnes , a village on the French-Belgian\n"
			+ "border. It is flavored with parsley, pepper,\n"
			+ "tarragon, and cloves and later shaped into a\n"
			+ "cone by hand.");
	
	private JLabel SoupeI = new JLabel(Soupe);
	private JTextArea SoupeT = new JTextArea("\n\nSoupe de Poisson. \n\n"
			+ "Clean celery and leek and cut into pieces. Cut carrots, leaves of fennel, onion and garlic\n"
			+ "coarsely. Put a large pot on low heat with 2\n"
			+ "tablespoons of oil of olive, vegetables and stop fish.");
	
	private JLabel TarteI = new JLabel(Tarte);
	private JTextArea TarteT = new JTextArea("\n\n\n\nTarte Tatin. \n\n"
			+ "The tarte Tatin, named after the hotel serving it "
			+ "as its signature dish, is an upside-down pastry "
			+ "in which the fruit are caramelized in butter "
			+ "and sugar before the tart is baked. It originated in\n"
			+ "France but has spread to other countries over\n"
			+ "the years.");
	
	private JLabel ChouquetteI = new JLabel(Chouquette);
	private JTextArea ChouquetteT = new JTextArea("\n\n\n\nChouquette. \n\n"
			+ "A chouquette is a type of Choux pastry\n"
			+ "consisting of a small portion of dough sprinkled"
			+ "with pearl sugar. A chouquette can also be\n"
			+ "dipped in chocolate or covered in chocolate\n"
			+ "chips.");
	
	public FranceFood()
	{
		setLayout(new BorderLayout());//Set layout
        
        JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		
		panel1.setLayout(new GridLayout(1,1));
		panel1.setBackground(Color.GRAY);
		panel2.setLayout(new GridLayout(2,4));
		panel2.setBackground(Color.WHITE);
		
		panel1.add(Flag);
		
		panel2.add(BouletteT);
		BouletteT.setLineWrap(true);
		panel2.add(BouletteI);
		
		panel2.add(SoupeT);
		SoupeT.setLineWrap(true);
		panel2.add(SoupeI);
        
		panel2.add(TarteT);
		TarteT.setLineWrap(true);
		panel2.add(TarteI);
		
		panel2.add(ChouquetteT);
		ChouquetteT.setLineWrap(true);
		panel2.add(ChouquetteI);

        add(panel1, BorderLayout.NORTH);
        add(panel2, BorderLayout.CENTER);
	}
	
	public static void main(String[] args)
	{
		FranceFood gui = new FranceFood();
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gui.setVisible(true);
		gui.setSize(1000,750);
		gui.setTitle("France Food");
	}
}
