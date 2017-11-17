
public class Digits_of_number {
	public static void main(String[] args) // Method: main
	{
	    double x = 3.14159265358979;
	    System.out.println((x+"") instanceof String);
	    for (int i = 1; i < (x+"").length()-1; i++) {
	      System.out.printf("%."+i+"f  \n", x);
	}

	
}
}