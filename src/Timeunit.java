import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;

public class Timeunit {

	public static void main(String args[]){
	ZonedDateTime x2 = ZonedDateTime.now();
	System.out.println("zoned time"+x2);
	System.out.println("system time "+ System.currentTimeMillis());
	System.out.println(Calendar.getInstance().getTimeZone());
	System.out.println(Calendar.getInstance().getTime());
	System.out.println(Calendar.getInstance().getFirstDayOfWeek());
	}
}
