package Task;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class Days {
   public static void main(String[] args) {
	LocalDate Dob = LocalDate.of(1998, Month.DECEMBER, 13);
	LocalDate Now = LocalDate.now();
	long Days = ChronoUnit.DAYS.between(Dob, Now);
	System.out.println(Dob+ "   " +Now);
	System.out.println("Total number of Days you lived--" + Days);
   }    
}

