import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class P16 {
	public static void main(String[] args) throws IOException
	{
		System.out.println("�п�J���");
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		char letter = str.charAt(0);
		
		switch(letter)
		{
		case 1:
		{
			System.out.println("��J���Oa");
			break;
		}
		case 2:
		{
			System.out.println("��J���Ob");
			break;
		}
		default:
		{
			System.out.println("�п�Ja��b");
			break;
		}
		}
	}
}
