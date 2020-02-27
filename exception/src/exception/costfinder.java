package exception;

public class costfinder 
{
	public static double computecost(float[] arr) {
		double res=0;
		switch((int)arr[1]) {
		case 1:
				res=1200;
				break;
		case 2:
				res=1500;
				break;
		case 3:
				res=1800;
				break;
		case 4:
				res=2500;
				break;
		
		}
		return res*arr[0];
		
	}
}
