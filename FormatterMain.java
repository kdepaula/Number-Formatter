
public class FormatterMain {

	public static void main(String[] args) 
	{
		DefaultFormatter d = new DefaultFormatter();
		DecimalFormatter dec = new DecimalFormatter();
		BaseTwoFormatter b = new BaseTwoFormatter();
		System.out.println(d.formatter(100000000));
		System.out.println(dec.formatter(300000));
		System.out.println(b.formatter(12));

	}

}