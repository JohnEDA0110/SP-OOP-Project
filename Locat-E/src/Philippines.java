import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Philippines extends JFrame implements ActionListener
{
	//Declare variables
	private ImageIcon Image = new ImageIcon(getClass().getResource("Philippines.jpg"));
	
	private ImageIcon Hills = new ImageIcon(getClass().getResource("Philippines1.jpg"));
	private ImageIcon River = new ImageIcon(getClass().getResource("Philippines2.jpg"));
	private ImageIcon Rice = new ImageIcon(getClass().getResource("Philippines3.jpg"));
	private ImageIcon Enchanted = new ImageIcon(getClass().getResource("Philippines4.jpg"));
	
	private JLabel Flag = new JLabel(Image);
	
	private JLabel HillsI = new JLabel(Hills);
	private JTextArea HillsT = new JTextArea("\n\n\nChocolate Hills. \n\n"
			+ "Located at: Chocolate Hills. \n"
			+ "The Chocolate Hills are a geological formation\n"
			+ "in the Bohol province of the Philippines. There are at least 1,260 hills but there may be as\n"
			+ "many as 1,776 hills spread over an area of\n"
			+ "more than 50 square kilometres. They are\n"
			+ "covered in green grass that turns brown during the dry season, hence the name.");
	
	private JLabel RiverI = new JLabel(River);
	private JTextArea RiverT = new JTextArea("\n\nPuerto Princesa Subterranean River\n"
			+ "National Park. \n\n"
			+ "Located at: \n"
			+ "Puerto Princesa, Palawan, Philippines. \n\n"
			+ "The Puerto Princesa Subterranean River\n"
			+ "National Park is a protected area of the\n"
			+ "Philippines. The park is located in the Saint\n"
			+ "Paul Mountain Range on the western coast of\n"
			+ "the island, about 80 kilometres north of the city centre of Puerto Princesa, Palawan, and\n"
			+ "contains the Puerto Princesa Subterranean\n"
			+ "River.");
	
	private JLabel RiceI = new JLabel(Rice);
	private JTextArea RiceT = new JTextArea("\n\nBanaue Rice Fields. \n\n"
			+ "Located at: \n"
			+ "Nueva Vizcaya - Ifugao - Mountain Province\n"
			+ "Rd, Banaue, Ifugao, Philippines. \n\n"
			+ "The Banaue Rice Terraces are terraces that\n"
			+ "were carved into the mountains of Ifugao in the Philippines by the ancestors of the indigenous people. "
			+ "The terraces are occasionally\n"
			+ "called the \"Eighth Wonder of the World\". It is\n"
			+ "commonly thought that the terraces were built with minimal equipment, largely by hand.");
	
	private JLabel EnchantedI = new JLabel(Enchanted);
	private JTextArea EnchantedT = new JTextArea("\n\nEnchanted Kingdom. \n\n"
			+ "Located at: \n"
			+ "San Lorenzo Rd, Laguna, Santa Rosa, 4026\n"
			+ "Laguna, Philippines. \n\n"
			+ "Enchanted Kingdom, often abbreviated EK, is a"
			+ "theme park in the Philippines. It is located in\n"
			+ "Santa Rosa, Laguna. It has a land area of 25\n"
			+ "hectares. The park is managed and operated\n"
			+ "by Enchanted Kingdom Inc. Enchanted\n"
			+ "Kingdom is a member of the International\n"
			+ "Association of Amusement Parks and\n"
			+ "Attractions.");
	
	private JButton button1 = new JButton("Food");
	
	//Link other class
	PhilippinesFood pf = null;

	Philippines()
	{
		pf = new PhilippinesFood();//Inherit from other class

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
		
		panel2.add(HillsT);
		HillsT.setLineWrap(true);
		panel2.add(HillsI);
		
		panel2.add(RiverT);
		RiverT.setLineWrap(true);
		panel2.add(RiverI);
        
		panel2.add(RiceT);
		RiceT.setLineWrap(true);
		panel2.add(RiceI);
		
		panel2.add(EnchantedT);
		EnchantedT.setLineWrap(true);
		panel2.add(EnchantedI);
		
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
            pf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);//Return to previous page  when closed
            pf.setTitle("Food");//Set the title of program
            pf.setSize(1000,750);//Set size of program
            pf.setVisible(true);//Set visibility to true
        }
	}
	
	public static void main(String[] args)
	{
		Philippines gui = new Philippines();
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);;//Return to previous page  when closed
		gui.setVisible(true);//Set the title of program
		gui.setSize(1000,750);//Set size of program
		gui.setTitle("Philippines");//Set visibility to true
	}
}