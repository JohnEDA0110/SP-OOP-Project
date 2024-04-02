import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JapanFood extends JFrame
{
	private ImageIcon Image = new ImageIcon(getClass().getResource("Japan.jpg"));
	
	private ImageIcon Ramen = new ImageIcon(getClass().getResource("Japan5.jpg"));
	private ImageIcon Shabu = new ImageIcon(getClass().getResource("Japan6.jpg"));
	private ImageIcon Okonomiyaki = new ImageIcon(getClass().getResource("Japan7.jpg"));
	private ImageIcon Soba = new ImageIcon(getClass().getResource("Japan8.jpg"));
	
	private JLabel Flag = new JLabel(Image);
	
	private JLabel RamenI = new JLabel(Ramen);
	private JTextArea RamenT = new JTextArea("\n\n\nRamen.\n\n"
			+ "Ramen is a Japanese dish. It consists of\n"
			+ "Chinese-style wheat noodles served in a meat or fish-based broth, often flavored with soy\n"
			+ "sauce or miso, and uses toppings such as\n"
			+ "sliced pork, nori, menma, and scallions.");
	
	private JLabel ShabuI = new JLabel(Shabu);
	private JTextArea ShabuT = new JTextArea("\n\n\nShabu. \n\n"
			+ "Shabu-shabu is a Japanese nabemono hotpot dish of thinly sliced meat and vegetables boiled\n"
			+ "in water. The term is onomatopoeic, derived\n"
			+ "from the sound emitted when the ingredients\n"
			+ "are stirred in the cooking pot and served with\n"
			+ "dipping sauces. The food is cooked\n"
			+ "piece by piece by the diner at the table.");
	
	private JLabel OkonomiyakiI = new JLabel(Okonomiyaki);
	private JTextArea OkonomiyakiT = new JTextArea("\n\n\n\nOkonomiyaki. \n\n"
			+ "Okonomiyaki is a Japanese savory pancake\n"
			+ "containing a variety of ingredients. The name is"
			+ "derived from the word okonomi, meaning \"how you like\" or \"what you like\", and yaki meaning\n"
			+ "\"cooked\". Okonomiyaki is mainly associated\n"
			+ "with the Kansai or Hiroshima areas of Japan,\n"
			+ "but is widely available throughout the country.");
	
	private JLabel SobaI = new JLabel(Soba);
	private JTextArea SobaT = new JTextArea("\n\n\n\nSoba. \n\n"
			+ "Soba is the Japanese name for buckwheat. It\n"
			+ "usually refers to thin noodles made from\n"
			+ "buckwheat flour, or a combination of\n"
			+ "buckwheat and wheat flours. They contrast\n"
			+ "to thick wheat noodles, called udon. Soba\n"
			+ "noodles are served either chilled with a dipping sauce, or in hot broth as a noodle soup.");
	
	public JapanFood()
	{
		setLayout(new BorderLayout());//Set layout
        
        JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		
		panel1.setLayout(new GridLayout(1,1));
		panel1.setBackground(Color.GRAY);
		panel2.setLayout(new GridLayout(2,4));
		panel2.setBackground(Color.WHITE);
		
		panel1.add(Flag);
		
		panel2.add(RamenT);
		RamenT.setLineWrap(true);
		panel2.add(RamenI);
		
		panel2.add(ShabuT);
		ShabuT.setLineWrap(true);
		panel2.add(ShabuI);
        
		panel2.add(OkonomiyakiT);
		OkonomiyakiT.setLineWrap(true);
		panel2.add(OkonomiyakiI);
		
		panel2.add(SobaT);
		SobaT.setLineWrap(true);
		panel2.add(SobaI);

        add(panel1, BorderLayout.NORTH);
        add(panel2, BorderLayout.CENTER);
	}
	
	public static void main(String[] args)
	{
		JapanFood gui = new JapanFood();
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gui.setVisible(true);
		gui.setSize(1000,750);
		gui.setTitle("Japan Food");
	}
}
