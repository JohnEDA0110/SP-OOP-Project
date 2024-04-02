import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Japan extends JFrame implements ActionListener
{
	//Declare variables
	private ImageIcon Image = new ImageIcon(getClass().getResource("Japan.jpg"));
	
	private ImageIcon Fuji = new ImageIcon(getClass().getResource("Japan1.jpg"));
	private ImageIcon Himeji = new ImageIcon(getClass().getResource("Japan2.jpg"));
	private ImageIcon Shrine = new ImageIcon(getClass().getResource("Japan3.jpg"));
	private ImageIcon Taisha = new ImageIcon(getClass().getResource("Japan4.jpg"));
	
	private JLabel Flag = new JLabel(Image);
	
	private JLabel FujiI = new JLabel(Fuji);
	private JTextArea FujiT = new JTextArea("\n\nMount Fuji (Fuji-san).\n\n"
			+ "Located at: \n"
			+ "Mount Fuji, Kitayama, Fujinomiya, Shizuoka \n"
			+ "418-0112. \n\n"
			+ "Japan’s Mt. Fuji is an active volcano about 100 kilometers southwest of Tokyo. Commonly\n"
			+ "called “Fuji-san,” it’s the country’s tallest peak, at 3,776 meters. A pilgrimage site for centuries,"
			+ "it’s considered one of Japan’s 3 sacred\n"
			+ "mountains, and summit hikes remain a popularactivity.");
	
	private JLabel HimejiI = new JLabel(Himeji);
	private JTextArea HimejiT = new JTextArea("\n\nHimeji Castle (Himeji-jo). \n\n"
			+ "Located at: \n"
			+ "68 Honmachi, Himeji, Hyogo 670-0012. \n\n"
			+ "Himeji Castle is a hilltop Japanese castle\n"
			+ "complex situated in the city of Himeji which is\n"
			+ "located in the Hyogo Prefecture of Japan.");
	
	private JLabel ShrineI = new JLabel(Shrine);
	private JTextArea ShrineT = new JTextArea("\nItsukushima Shrine. \n\n"
			+ "Located at: \n"
			+ "1-1 Miyajimacho, Hatsukaichi, Hiroshima\n"
			+ "739-0588. \n\n"
			+ "It is a Shinto shrine on the island of\n"
			+ "Itsukushima (popularly known as Miyajima),\n"
			+ "best known for its \"floating\" torii gate. It is in the city of Hatsukaichi in Hiroshima Prefecture in\n"
			+ "Japan. The shrine complex is listed as a\n"
			+ "UNESCO World Heritage Site, and the\n"
			+ "Japanese government has designated several buildings and possessions as National Treasures.");
	
	private JLabel TaishaI= new JLabel(Taisha);
	private JTextArea TaishaT = new JTextArea("\nFushimi Inari Taisha (Fushimi Inari Shrine). \n\n"
			+ "Located at: \n"
			+ "68 Fukakusa Yabunouchicho, Fushimi, Kyoto, Kyoto 612-0082. \n\n"
			+ "Fushimi Inari Taisha is the head shrine of the\n"
			+ "god Inari, located in Fushimi Ward in Kyoto,\n"
			+ "Japan. The shrine sits at the base of a\n"
			+ "mountain also named Inari which is 233 metres"
			+ "(764 ft) above sea level, and includes trails up\n"
			+ "the mountain to many smaller shrines which\n"
			+ "span 4 kilometres (2.5 mi) and take\n"
			+ "approximately 2 hours to walk up.");
	
	private JButton button1 = new JButton("Food");
	
	//Link other class
	JapanFood jf = null;

	Japan()
	{
		jf = new JapanFood();//Inherit from other class

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
		
		panel2.add(FujiT);
		FujiT.setLineWrap(true);
		panel2.add(FujiI);
		
		panel2.add(HimejiT);
		HimejiT.setLineWrap(true);
		panel2.add(HimejiI);
        
		panel2.add(ShrineT);
		ShrineT.setLineWrap(true);
		panel2.add(ShrineI);
		
		panel2.add(TaishaT);
		TaishaT.setLineWrap(true);
		panel2.add(TaishaI);
		
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
            jf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);//Return to previous page  when closed
            jf.setTitle("Food");//Set the title of program
            jf.setSize(1000,750);//Set size of program
            jf.setVisible(true);//Set visibility to true
        }
	}
	
	public static void main(String[] args)
	{
		Japan gui = new Japan();
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);;//Return to previous page  when closed
		gui.setVisible(true);//Set the title of program
		gui.setSize(1000,750);//Set size of program
		gui.setTitle("Japan");//Set visibility to true
	}
}