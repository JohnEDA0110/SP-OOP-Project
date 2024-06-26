import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.util.ResourceBundle;

public class Converter extends JFrame //implements ActionListener
{
	private static final ResourceBundle BUNDLE = ResourceBundle.getBundle("localization.translation");
	private JPanel contentPane;
	private JTextField fieldAmount;
	private ArrayList<CurrencyRates> currencies = CurrencyRates.init();
	
	public Converter()
	{
		setTitle(BUNDLE.getString("MainWindow.this.title"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 589, 300);
		setLocationRelativeTo(null);
		setResizable( false );
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblConvert = new JLabel(BUNDLE.getString("MainWindow.lblConvert.text"));
		lblConvert.setHorizontalAlignment(SwingConstants.RIGHT);
		lblConvert.setBounds(0, 14, 92, 15);
		contentPane.add(lblConvert);
		
		final JComboBox<String> comboBoxCountry1 = new JComboBox<String>();
		comboBoxCountry1.setBounds(147, 7, 240, 28);
		populate(comboBoxCountry1, currencies);
		contentPane.add(comboBoxCountry1);
		
		JLabel lblTo = new JLabel(BUNDLE.getString("MainWindow.lblTo.text"));
		lblTo.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTo.setBounds(66, 54, 26, 15);
		contentPane.add(lblTo);
		
		final JComboBox<String> comboBoxCountry2 = new JComboBox<String>();
		comboBoxCountry2.setBounds(147, 47, 240, 28);
		populate(comboBoxCountry2, currencies);
		contentPane.add(comboBoxCountry2);
		
		final JLabel lblAmount = new JLabel(BUNDLE.getString("MainWindow.lblAmount.text")); //$NON-NLS-1$
		lblAmount.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAmount.setBounds(23, 108, 69, 15);
		contentPane.add(lblAmount);
		
		fieldAmount = new JTextField();
		fieldAmount.setText("0.00");
		fieldAmount.setBounds(147, 101, 103, 29);
		contentPane.add(fieldAmount);
		fieldAmount.setColumns(10);
		fieldAmount.setDocument(new ConverterTextField(8));
		
		final JLabel lblResult = new JLabel("");
		lblResult.setHorizontalAlignment(SwingConstants.LEFT);
		lblResult.setBounds(147, 188, 428, 38);
		contentPane.add(lblResult);

		JButton btnConvert = new JButton(BUNDLE.getString("MainWindow.btnConvert.text")); //$NON-NLS-1$
		btnConvert.setBounds(147, 142, 129, 38);
		btnConvert.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0) 
			{
	        	String nameCurrency1 = comboBoxCountry1.getSelectedItem().toString();
	        	String nameCurrency2 = comboBoxCountry2.getSelectedItem().toString();
	        	String result;
	        	String formattedPrice;
	        	String formattedAmount; 
	        	Double price;
	        	Double amount = 0.0;
	        	DecimalFormat format = new DecimalFormat("#0.00");
	        	
	        	try 
	        	{
	        		amount = Double.parseDouble( fieldAmount.getText() ) ;
	        	} 
	        	catch (NumberFormatException e) 
	        	{
	        	    e.printStackTrace();
	        	    amount = 0.0;
	        	}
	        	
	        	price = convert(nameCurrency1, nameCurrency2, currencies, amount);
	        	
	        	// Format numbers to avoid "E7" problem
	        	formattedPrice = format.format(price);
	        	formattedAmount = format.format(amount);
	        	
	        	result = formattedAmount + " " + nameCurrency1 + " = " + formattedPrice + " " + nameCurrency2;
	        	lblResult.setText(result);	
			}
		});
		contentPane.add(btnConvert);
	}
	
	public static void populate(JComboBox<String> comboBox, ArrayList<CurrencyRates> currencies) 
	{
		for (Integer i = 0; i < currencies.size(); i++) 
		{
			comboBox.addItem( currencies.get(i).getName() );
		}		
	}
	
	public static Double convert(String currency1, String currency2, ArrayList<CurrencyRates> currencies, Double amount)
	{
		String shortNameCurrency2 = null;
		Double exchangeValue;
		Double price = 0.0;
		
		for (Integer i = 0; i < currencies.size(); i++) 
		{
			if (currencies.get(i).getName() == currency2)
			{
				shortNameCurrency2 = currencies.get(i).getShortName();
				break;
			}
		}
		
		if (shortNameCurrency2 != null)
		{
			for (Integer i = 0; i < currencies.size(); i++)
			{
				
				if (currencies.get(i).getName() == currency1) {
					exchangeValue = currencies.get(i).getExchangeValues().get(shortNameCurrency2);
					price = CurrencyRates.convert(amount, exchangeValue);
					break;
				}
			}
		}
		return price;
	}
}
