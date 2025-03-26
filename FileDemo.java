import java.io.*;

public class FileDemo {
	public static void main(String[] a)
	{
		
		String[] name = {"MCA","BCA","BBA","MBA"};
		
		try(BufferedWriter writer = new BufferedWriter
				(new FileWriter("ABC.txt")))
		{
			for(String n : name)
			{
				writer.write(n);
				writer.newLine();
			}
			writer.close();
			System.out.print("Data Stored...!");
		}
		catch(IOException e)
		{System.out.print(e);}
		
	
		
		try(BufferedReader reader = new BufferedReader
				(new FileReader("ABC.txt")))
		{
			String data;
			
			while((data = reader.readLine()) != null)
			{
				System.out.println(data);
			}
			reader.close();
				
		}catch(IOException e)
		{
			System.out.print(e);
		}
	}
}








