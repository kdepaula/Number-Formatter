
public class DefaultFormatter implements NumberFormatter
{
	public String formatter(int a)
	{
		String format = "";
		String num = "" + a;
		
		for(int i = num.length(); i > 0; i--)
		{
			format = num.substring(i-1, i) + format;
			if(i%3 == 0)
			{
				format = "," + format;
			}
		}
		return format;
	}
}
