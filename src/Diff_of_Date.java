import java.text.*;
import java.util.Date;
public class Diff_of_Date {

	public static void main(String args[]){
		  String dateStart = "11/03/14 09:29:58";
		    String dateStop = "11/03/16 09:33:43";

		    SimpleDateFormat format = new SimpleDateFormat("yy/MM/dd HH:mm:ss");

		    Date d1 = null;
		    Date d2 = null;
		    try {
		        d1 = format.parse(dateStart);
		        d2 = format.parse(dateStop);
		    } catch (ParseException e) {
		        e.printStackTrace();
		    }
		    
		    System.out.println("into the class");
		    api_out.raj.println("hi printed with the api");
	        long diff = d2.getTime() - d1.getTime();
	        long diffSeconds = diff / 1000 % 60;
	        long diffMinutes = diff / (60 * 1000) % 60;
	        long diffHours = diff / (60 * 60 * 1000);
	        int diffInDays = (int) ((d2.getTime() - d1.getTime()) / (1000 * 60 * 60 * 24));

	            System.out.println("Difference in number of days (2) : " + diffInDays);
	            System.out.println("diff is "+diff);
	            System.out.println(diffHours);
	            System.out.println(diffSeconds);
	            System.out.println(diffMinutes);
	            return;
	}
	}
	
