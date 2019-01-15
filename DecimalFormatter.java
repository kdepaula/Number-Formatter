

public class DecimalFormatter implements NumberFormatter
{
	public String formatter(int a)
	{
		String format = "";
		String num = "" + a;
		for(int i = num.length() - 1; i >= 0; i--)
		{
			format = num.charAt(i) + format;
			if((num.length() - i)%3 == 0 && i != 0)
			{
				format = "." + format;
			}
		}
		return format;
	}
}