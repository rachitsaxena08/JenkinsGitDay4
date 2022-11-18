import java.util.*;
import java.time.*;

public class Welcome
{

	public static void main(String[] args)
	{
		LocalDate date = LocalDate.now();
		LocalTime time = LocalTime.now();
		System.out.println(date +  "," +  time);
	}
}