import java.util.Scanner;
public class Day
{
public static void main(String args[])
{ 
 Scanner scanner = new Scanner(System.in);
 System.out.println("Enter a number (1-7) for the day of the week:");
 int Day = scanner.nextInt();
switch (Day)
{
case 1 :System.out.println("sunday");break;
case 2 :System.out.println("Monday");break;
case 3 :System.out.println("Tuesday");break;
case 4 :System.out.println("wednesday");break;
case 5 :System.out.println("Thursday");break;
case 6 :System.out.println("Friday");break;
case 7 :System.out.println("Saturday");break;
default:System.out.println("Invalid input");
}
}
}
