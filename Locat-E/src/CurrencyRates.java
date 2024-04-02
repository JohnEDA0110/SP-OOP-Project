import java.util.ArrayList;
import java.util.HashMap;

public class CurrencyRates
{
	private String name;
	private String shortName;
	private HashMap<String, Double> exchangeValues = new HashMap<String, Double>();
	
	// "Currency" Constructor
	public CurrencyRates(String nameValue, String shortNameValue) 
	{
		this.name = nameValue;
		this.shortName = shortNameValue;
	}
	
	// Getter for name
	public String getName()
	{
		return this.name;
	}
	
	// Setter for name
	public void setName(String name) 
	{
		this.name = name;
	}
	
	// Getter for shortName
	public String getShortName() 
	{
		return this.shortName;
	}
	
	// Setter for shortName
	public void setShortName(String shortName)
	{
		this.shortName = shortName;
	}
	
	// Getter for exchangeValues
	public HashMap<String, Double> getExchangeValues()
	{
		return this.exchangeValues;
	}
	
	// Setter for exchangeValues
	public void setExchangeValues(String key, Double value)
	{
		this.exchangeValues.put(key, value);
	}
	
	// Set default values for a currency
	public void defaultValues() 
	{
		String currency = this.name;
		
		switch (currency)
		{	
			case "French Euro":
				this.exchangeValues.put("EUR", 1.00);
				this.exchangeValues.put("YEN", 125.07);
				this.exchangeValues.put("WON", 1275.79);
				this.exchangeValues.put("PHP", 59.59);
				this.exchangeValues.put("SGD", 1.54);
				break;
			case "Japanese Yen":
				this.exchangeValues.put("EUR", 0.008);
				this.exchangeValues.put("YEN", 1.00);
				this.exchangeValues.put("WON", 10.20);
				this.exchangeValues.put("PHP", 0.48);
				this.exchangeValues.put("SGD", 0.012);
				break;
			case "Korean Won":
				this.exchangeValues.put("EUR", 0.0008);
				this.exchangeValues.put("YEN", 0.098);
				this.exchangeValues.put("WON", 1.00);
				this.exchangeValues.put("PHP", 0.047);
				this.exchangeValues.put("SGD", 0.0012);
				break;
			case "Philippine Peso":
				this.exchangeValues.put("EUR", 0.017);
				this.exchangeValues.put("YEN", 2.10);
				this.exchangeValues.put("WON", 21.40);
				this.exchangeValues.put("PHP", 1.00);
				this.exchangeValues.put("SGD", 0.026);
				break;
			case "Singapore Dollar":
				this.exchangeValues.put("EUR", 0.65);
				this.exchangeValues.put("YEN", 81.10);
				this.exchangeValues.put("WON", 827.03);
				this.exchangeValues.put("PHP", 38.65);
				this.exchangeValues.put("SGD", 1.00);
				break;
		}
	}
	
	// Initialize currencies
	public static ArrayList<CurrencyRates> init()
	{
		ArrayList<CurrencyRates> currencies = new ArrayList<CurrencyRates>();
				
		currencies.add( new CurrencyRates("French Euro", "EUR") );
		currencies.add( new CurrencyRates("Japanese Yen", "YEN") );
		currencies.add( new CurrencyRates("Korean Won", "WON") );
		currencies.add( new CurrencyRates("Philippine Peso", "PHP") );
		currencies.add( new CurrencyRates("Singapore Dollar", "SGD") );
		
		for (Integer i =0; i < currencies.size(); i++)
		{
			currencies.get(i).defaultValues();
		}		
		
		return currencies;
	}
	
	// Convert a currency to another
	public static Double convert(Double amount, Double exchangeValue)
	{
		Double price;
		price = amount * exchangeValue;
		price = Math.round(price * 100d) / 100d;
		
		return price;
	}
}
