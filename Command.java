
public class Command {

	public static void main(String[] arg)
	{
		int[] cat = {1,2,3,4};
		String[] name= {"A","B","C","D"};
		int[] unit = {85,275,55,356};
		double[] rate = {1,1.75,2.5,3};
		
		for(int i=0;i<cat.length; i++)
		{
			System.out.println(cat[i]+"  "+name[i]+"   "+(unit[i]*rate[i]));
		}
	}
}


