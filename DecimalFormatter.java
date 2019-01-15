
public class DecimalFormatter implements NumberFormatter
{
	public String formatter(int a)
	{
		String format = "";
		String num = "" + a;
		
		for(int i = 0; i < num.length(); i++)
		{
			format += num.substring(i, i+1);
			if(i%3 == 0)
			{
				if(i != num.length() - 1)
				format += ".";
			}
		}
		return format;
	}
}
