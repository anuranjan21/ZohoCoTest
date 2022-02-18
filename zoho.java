import java.io.*;
import java.util.scanner;
import java.lang.String;

public class main
{
	public static void main(String[] args)
	{
		
			Scanner sc = new Scanner(System.in);
           		System.out.println("Enter the String : ");
			String s = sc.nextLine();
           		int l = s.length();
           		
          		int mid = l/2;           	
			for(int i=1; i<=l;i++)
           		{
				int c = 0
				int j = mid

              			while (c < i && j < l)
               			{
                   			System.out.print("%c ",s.charAt(j));
					j ++;
					c ++;
               			}
              			if (i < l)
				System.out.print("\n");
				else
					System.out.println(s.substring(0,mid-1));
           		}         

       		
	}
}