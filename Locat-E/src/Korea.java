import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Korea extends JFrame implements ActionListener
{
	//Declare variables
	private ImageIcon Image = new ImageIcon(getClass().getResource("Korea.jpg"));
	
	private ImageIcon Palace = new ImageIcon(getClass().getResource("Korea1.jpg"));
	private ImageIcon Tower = new ImageIcon(getClass().getResource("Korea2.jpg"));
	private ImageIcon Lotte = new ImageIcon(getClass().getResource("Korea3.jpg"));
	private ImageIcon Garden = new ImageIcon(getClass().getResource("Korea4.jpg"));
	
	private JLabel Flag = new JLabel(Image);
	
	private JLabel PalaceI = new JLabel(Palace);
	private JTextArea PalaceT = new JTextArea("\n\nGyeongbokgung Palace. \n\n"
			+ "Located at: \n"
			+ "161 Sajik-ro, Sejongno, Jongno-gu, Seoul,\n"
			+ "South Korea. \n\n"
			+ "Gyeongbokgung, also known as\n"
			+ "Gyeongbokgung Palace or Gyeongbok Palace, was the main royal palace of the Joseon\n"
			+ "dynasty. Built in 1395, it is located in northern\n"
			+ "Seoul, South Korea.");
	
	private JLabel TowerI = new JLabel(Tower);
	private JTextArea TowerT = new JTextArea("\n\nNamsan Seoul Tower. \n\n"
			+ "Located at: \n"
			+ "105 Namsangongwon-gil, Yongsan\n"
			+ "2(i)ga-dong, Yongsan-gu, Seoul, South Korea. \n\n"
			+ "The N Seoul Tower, officially the YTN Seoul\n"
			+ "Tower and commonly known as the Namsan\n"
			+ "Tower or Seoul Tower, is a communication\n"
			+ "and observation tower located on Namsan\n"
			+ "Mountain in central Seoul, South Korea. At 236 metres, it marks the second highest point in\n"
			+ "Seoul.");
	
	private JLabel LotteI = new JLabel(Lotte);
	private JTextArea LotteT = new JTextArea("\nLotte World. \n\n"
			+ "Located at: \n"
			+ "240 Olympic-ro, Jamsil-dong, Songpa-gu,\n"
			+ "Seoul, South Korea. \n\n"
			+ "Lotte World is a major recreation complex in\n"
			+ "Seoul, South Korea. It consists of the world's\n"
			+ "largest indoor theme park, an outdoor\n"
			+ "amusement park called \"Magic Island\", an\n"
			+ "artificial island inside a lake linked by monorail, shopping malls, a luxury hotel, a Korean folk\n"
			+ "museum, sports facilities, and movie theaters.");
	
	private JLabel GardenI= new JLabel(Garden);
	private JTextArea GardenT = new JTextArea("\nThe Garden of Morning Calm. \n\n"
			+ "Located at: \n"
			+ "432 Sumogwon-ro, Sang-myeon,\n"
			+ "Gapyeong-gun, Gyeonggi-do, South Korea. \n\n"
			+ "The Garden of Morning Calm is an arboretum\n"
			+ "located at the east of Seoul, in the Gapyeong\n"
			+ "district of South Korea. On 300,000 m², it\n"
			+ "houses 5,000 species of plants, some rare or\n"
			+ "endangered and attracts 600,000 tourists per\n"
			+ "year.");
	
	private JButton button1 = new JButton("Food");
	
	//Link other class
	KoreaFood kf = null;

	Korea()
	{
		kf = new KoreaFood();//Inherit from other class

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
		
		panel2.add(PalaceT);
		PalaceT.setLineWrap(true);
		panel2.add(PalaceI);
		
		panel2.add(TowerT);
		TowerT.setLineWrap(true);
		panel2.add(TowerI);
        
		panel2.add(LotteT);
		LotteT.setLineWrap(true);
		panel2.add(LotteI);
		
		panel2.add(GardenT);
		GardenT.setLineWrap(true);
		panel2.add(GardenI);
		
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
            kf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);//Return to previous page  when closed
            kf.setTitle("Food");//Set the title of program
            kf.setSize(1000,750);//Set size of program
            kf.setVisible(true);//Set visibility to true
        }
	}
	
	public static void main(String[] args)
	{
		Korea gui = new Korea();
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);;//Return to previous page  when closed
		gui.setVisible(true);//Set the title of program
		gui.setSize(1000,750);//Set size of program
		gui.setTitle("Korea");//Set visibility to true
	}
}