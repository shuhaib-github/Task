package Task;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Day 
{
	public static void main(String[] args) throws ParseException 
	{
		String s = "2000/05/14";
		SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
		Date d = format.parse(s);
		
		int D= d.getDay();
		
		switch (D) {
		  case 0:
		    System.out.println("Sunday");
		    break;
		  case 1:
		    System.out.println("Monday");
		    break;
		  case 2:
		    System.out.println("Tuesday");
		    break;
		  case 3:
		    System.out.println("Wednesday");
		    break;
		  case 4:
		    System.out.println("Thursday");
		    break;
		  case 5:
		    System.out.println("Friday");
		    break;
		  case 6:
		    System.out.println("Saturday");
		    break;
		}
		
		
	}
}



