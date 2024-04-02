import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Singapore extends JFrame implements ActionListener
{
	//Declare variables
	private ImageIcon Image = new ImageIcon(getClass().getResource("Singapore.jpg"));
	
	private ImageIcon Bird = new ImageIcon(getClass().getResource("Singapore1.jpg"));
	private ImageIcon USS = new ImageIcon(getClass().getResource("Singapore2.jpg"));
	private ImageIcon Bay = new ImageIcon(getClass().getResource("Singapore3.jpg"));
	private ImageIcon Night = new ImageIcon(getClass().getResource("Singapore4.jpg"));
	
	private JLabel Flag = new JLabel(Image);
	
	private JLabel BirdI = new JLabel(Bird);
	private JTextArea BirdT = new JTextArea("\n\nJurong Bird Park. \n\n"
			+ "Located at: \n"
			+ "2 Jurong Hill, 628925. \n\n"
			+ "Jurong Bird Park is an aviary and tourist\n"
			+ "attraction in Jurong, Singapore. The bird park, managed by Wildlife Reserves Singapore,\n"
			+ "covers an area of 0.2 square kilometres on the western slope of Jurong Hill, the highest point\n"
			+ "in the Jurong region.");
	
	private JLabel USSI = new JLabel(USS);
	private JTextArea USST = new JTextArea("\n\nUniversal Studios Singapore. \n\n"
			+ "Located at: \n"
			+ "8 Sentosa Gateway, 098269. \n\n"
			+ "Universal Studios Singapore is a theme park\n"
			+ "located within Resorts World Sentosa on\n"
			+ "Sentosa Island, Singapore. It features 28 rides, shows, and attractions in seven themed zones."
			+ "It was a key component of Genting's bid for the right to build Singapore's second integrated\n"
			+ "resort.");
	
	private JLabel BayI = new JLabel(Bay);
	private JTextArea BayT = new JTextArea("\n\nGardens by the Bay. \n\n"
			+ "Located at: \n"
			+ "18 Marina Gardens Dr, Singapore 018953. \n\n"
			+ "Gardens by the Bay is a nature park spanning 101 hectares of reclaimed land in the Central\n"
			+ "Region of Singapore, adjacent to the Marina\n"
			+ "Reservoir. The park consists of three\n"
			+ "waterfront gardens: Bay South Garden,\n"
			+ "Bay East Garden and Bay Central Garden.\n"
			+ "The largest of the gardens is Bay South\n"
			+ "Garden at 54 hectares.");
	
	private JLabel NightI = new JLabel(Night);
	private JTextArea NightT = new JTextArea("\n\nNight Safari. \n\n"
			+ "Located at: \n"
			+ "80 Mandai Lake Rd, Singapore 729826. \n\n"
			+ "The Night Safari is the world's first nocturnal\n"
			+ "zoo and is one of the most popular tourist\n"
			+ "attractions in Singapore. The concept of a\n"
			+ "nocturnal park in Singapore was suggested\n"
			+ "in the 1980s by the former executive chairman of the Singapore Zoo, Dr Ong Swee Law.");
	
	private JButton button1 = new JButton("Food");
	
	//Link other class
	SingaporeFood sf = null;

	Singapore()
	{
		sf = new SingaporeFood();//Inherit from other class

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
		
		panel2.add(BirdT);
		BirdT.setLineWrap(true);
		panel2.add(BirdI);
		
		panel2.add(USST);
		USST.setLineWrap(true);
		panel2.add(USSI);
        
		panel2.add(BayT);
		BayT.setLineWrap(true);
		panel2.add(BayI);
		
		panel2.add(NightT);
		NightT.setLineWrap(true);
		panel2.add(NightI);
		
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
            sf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);//Return to previous page  when closed
            sf.setTitle("Food");//Set the title of program
            sf.setSize(1000,750);//Set size of program
            sf.setVisible(true);//Set visibility to true
        }
	}
	
	public static void main(String[] args)
	{
		Singapore gui = new Singapore();
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);;//Return to previous page  when closed
		gui.setVisible(true);//Set the title of program
		gui.setSize(1000,750);//Set size of program
		gui.setTitle("Singapore");//Set visibility to true
	}
}