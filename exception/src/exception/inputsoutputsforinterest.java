package exception;

import java.io.IOException;
import java.util.Scanner;
import java.io.IOException;

public class inputsoutputsforinterest  {
	
	
	public static float[] takeinputs() throws IOException {
		Scanner sc=new Scanner(System.in);
		System.out.write("Welcome to Module-Interest Calculator!".getBytes());
		float[] arr=new float[5];
		System.out.write("Enter principle".getBytes());
		arr[0]=sc.nextFloat();
		System.out.write("Enter interest".getBytes());
		arr[1]=sc.nextFloat();
		System.out.write("Enter time".getBytes());
		arr[2]=sc.nextFloat();
		System.out.write("Choose any option 1.simple interest 2.compound interest".getBytes());
		arr[3]=sc.nextFloat();
		if (arr[3]==2) {
			System.out.write("Enter number of times interest applied per time period".getBytes());
			arr[4]=sc.nextFloat();
		}
		arr[2]=(float)arr[2]/100;
		return arr;
	}
	
	public static void printoutput(String s) throws IOException {
		System.out.write(s.getBytes());
	}
	
}