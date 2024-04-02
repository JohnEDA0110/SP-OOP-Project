import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class KoreaFood extends JFrame
{
	private ImageIcon Image = new ImageIcon(getClass().getResource("Korea.jpg"));
	
	private ImageIcon Soup = new ImageIcon(getClass().getResource("Korea5.jpg"));
	private ImageIcon Stew = new ImageIcon(getClass().getResource("Korea6.jpg"));
	private ImageIcon Pumpkin = new ImageIcon(getClass().getResource("Korea7.jpg"));
	private ImageIcon Pat = new ImageIcon(getClass().getResource("Korea8.jpg"));
	
	private JLabel Flag = new JLabel(Image);
	
	private JLabel SoupI = new JLabel(Soup);
	private JTextArea SoupT = new JTextArea("\n\n\nSeolleongtang.\n\n"
			+ "Seolleongtang or ox bone soup is a Korean\n"
			+ "broth tang made from ox bones, brisket and\n"
			+ "other cuts. Seasoning is generally done at the\n"
			+ "table according to personal taste by adding\n"
			+ "salt, ground black pepper, red pepper, minced garlic, or chopped spring onions. It is a local\n"
			+ "dish of Seoul.");
	
	private JLabel StewI = new JLabel(Stew);
	private JTextArea StewT = new JTextArea("\n\nSundubu-jjigae. \n\n"
			+ "Sundubu-jjigae or soft tofu stew is a jjigae in\n"
			+ "Korean cuisine. The dish is made with freshly\n"
			+ "curdled soft tofu, vegetables, sometimes\n"
			+ "mushrooms, onion, optional seafood, optional meat, and gochujang or gochu garu.");
	
	private JLabel PumpkinI = new JLabel(Pumpkin);
	private JTextArea PumpkinT = new JTextArea("\n\nHobak-juk. \n\n"
			+ "Hobak-juk or pumpkin porridge is a variety of\n"
			+ "juk made with pumpkin and glutinous rice flour. It is a smooth and naturally sweet porridge that is "
			+ "traditionally served to recovering patients or\n"
			+ "the elderly.");
	
	private JLabel PatI = new JLabel(Pat);
	private JTextArea PatT = new JTextArea("\n\nPatbingsu. \n\n"
			+ "Patbingsu is a popular Korean shaved ice\n"
			+ "dessert with sweet toppings that may include\n"
			+ "chopped fruit, condensed milk, fruit syrup, and red beans. Varieties with ingredients"
			+ "other than red beans are called bingsu. The food originally"
			+ "began as ice shavings with red bean paste.");
	
	public KoreaFood()
	{
		setLayout(new BorderLayout());//Set layout
        
        JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		
		panel1.setLayout(new GridLayout(1,1));
		panel1.setBackground(Color.GRAY);
		panel2.setLayout(new GridLayout(2,4));
		panel2.setBackground(Color.WHITE);
		
		panel1.add(Flag);
		
		panel2.add(SoupT);
		SoupT.setLineWrap(true);
		panel2.add(SoupI);
		
		panel2.add(StewT);
		StewT.setLineWrap(true);
		panel2.add(StewI);
        
		panel2.add(PumpkinT);
		PumpkinT.setLineWrap(true);
		panel2.add(PumpkinI);
		
		panel2.add(PatT);
		PatT.setLineWrap(true);
		panel2.add(PatI);

        add(panel1, BorderLayout.NORTH);
        add(panel2, BorderLayout.CENTER);
	}
	
	public static void main(String[] args)
	{
		KoreaFood gui = new KoreaFood();
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gui.setVisible(true);
		gui.setSize(1000,750);
		gui.setTitle("Korea Food");
	}
}
