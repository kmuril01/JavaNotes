/* Whem a number comes before a string */
import java.util.Scanner;
public class NumberFirst
{
    public static void main(String[] args)
    {
			String name;
			int age;
				Scanner inputDevice = new Scanner(System.in);
			System.out.print("Please enter your name >> ");
				name = inputDevice.nextLine();    
			System.out.print("Enter your age >> ");
				age = inputDevice.nextInt();
			System.out.println("Your name is " + name +
				" and you are " + age + " years old.");	
		}
}