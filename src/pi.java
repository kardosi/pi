
public class pi {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double pi=2;
		for(double i=1; i<=10000;i++)
		{
			double bal=(2*i)/(2*i-1);
			double jobb=(2*i)/(2*i+1);
			pi=pi*bal*jobb;
			System.out.println("pi: "+pi);
		}
		
		double PI=0;
		double divider=1;
		for(int i=0; i<10000; i++)
		{
			double valami=1/divider;
			if((i%2)==0)
			{
				PI+=valami;
			}
			else
			{
				PI-=valami;
			}
			divider+=2;
		}
		System.out.println("PI: "+PI*4);
		
		
		

	}

}
