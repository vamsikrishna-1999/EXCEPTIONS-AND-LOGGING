package exception;
import java.io.IOException;
import java.util.Scanner;

public class ioconstruction {

	public static float[] takeinputs() throws IOException {
		Scanner sc=new Scanner(System.in);
		System.out.write("\nWelcome to module-construction cost estimator!".getBytes());
		float[] arr=new float[2];
		System.out.write("Enter area of house".getBytes());
		arr[0]=sc.nextFloat();
		System.out.write(("Choose any material standard 1.Standard Materials\n"
				+"2.Above Standard Materials\n"
				+ "3.High Standard Material\n"
				+ "4.High Standard Material"+
				"\n 5.High Standar Material with full automation").getBytes());
		arr[1]=sc.nextFloat();
		
		
		return arr;
	}
	
	public static void printoutput(String s) throws IOException {
		System.out.write(s.getBytes());
	}
}