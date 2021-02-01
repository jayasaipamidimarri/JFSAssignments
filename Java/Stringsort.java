import java.util.Arrays;
import java.util.Scanner;
 
public class Stringsort
{
    public static void main(String[] args) 
    {
        int n;
        String name;
        Scanner s = new Scanner(System.in);
         
        
        System.out.print("Enter number of strings to be sorted : ");
        n = s.nextInt();
         
         
        String str[] = new String[n];
       
         
  
        System.out.println("Enter the Strings one by one:");
	s.nextLine();
        for(int i = 0; i < n; i++)
        {
            str[i] = s.nextLine();
        }
      
        
        
        for (int i = 0; i < n; i++) 
        {
            for (int j = i + 1; j < n; j++) 
            { 
                if (str[i].compareTo(str[j]) > 0) 
                {
                    name = str[i];
                    str[i] = str[j];
                    str[j] =name ;
                }
            }
        }
         
       
        System.out.print("Strings in Sorted Order: " + Arrays.toString(str));
    }
}