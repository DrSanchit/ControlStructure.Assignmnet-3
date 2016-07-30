
public class PatternLoop 
{

	public static void main(String[] args) 
	{
		
		int a,b, counter=1;
		if (counter>0)
		{
		for (a=1; a<=5; a++)
		{
			for (b=1;b<=a;b++)
			{
			System.out.print(b);	
			}
			System.out.println();

		}
		counter=counter-1;
		}
					
		while (counter==0)
			{
			for (a=4; a>=1; a--)
				{
					for (b=1; b<=a; b++)
					{
						System.out.print(b);
					}
					System.out.println();
				}
				counter++;
			}
}
}

		
	
	

