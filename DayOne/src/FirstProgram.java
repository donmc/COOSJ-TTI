import java.util.*;

import com.improving.Converter;


class FirstProgram {

	public static void main(String[] args) {

		double farenheit, celsius, feet, meters;
		boolean keepGoing = true;
		Scanner input = new Scanner(System.in);
		
		String name = new String("Don");
		name = name.toUpperCase();
		System.out.println(name);

		while (keepGoing) {
			System.out.println("Choose:");
			System.out.println("1. Convert Farenheit to Celsius");
			System.out.println("2. Convert Celsius to Farenheit");
			System.out.println("3. Convert Feet to Meters");
			System.out.println("4. Convert Meters to Feet");
			System.out.println("5. Exit\n");

			System.out.print("Your choice: ");
			int choice = input.nextInt();
			switch (choice) {
			
			case 1:
			    System.out.print("Enter farenheit value: ");
			    farenheit = input.nextDouble();
			    Converter myConverter = new Converter("North America");
			    celsius = myConverter.convertFtoC(farenheit);
			    System.out.printf("%4.1f F = %4.1f C\n",farenheit, celsius);
			 	break;
			case 2:
			    System.out.print("Enter celsius value: ");
			    celsius = input.nextDouble();
			    farenheit = (celsius * (9.0 / 5) + 32);
			    System.out.printf("%4.1f C = %4.1f F\n",celsius, farenheit);
			 	break;
			case 3:
			    System.out.print("Enter feet: ");
			    feet = input.nextDouble();
			    meters = feet * 0.3048;
			    System.out.printf("%4.1f ft = %4.1f meters\n",feet, meters);
			 	break;
			case 4:
			    System.out.print("Enter meters : ");
			    meters = input.nextDouble();
			    feet = meters / 0.3048;
			    System.out.printf("%4.1f meters = %4.1f ft\n",meters, feet);
			 	break;
			case 5: 
				keepGoing = false;
				break;

			}// end switch
		} // end while

	}//end main
	


}
