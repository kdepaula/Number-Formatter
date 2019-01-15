
public class BaseTwoFormatter implements NumberFormatter
{
	public String formatter(int a)
	{
		
		String format = "";
		format = (a%2) + format;
		int i = a/2;
		while(i != 0)
		{
			format =  (i % 2) + format;
			i = i/2;
		}
		
		return format;
	}
}
