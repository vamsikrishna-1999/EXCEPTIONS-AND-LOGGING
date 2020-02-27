package exception;

public class interestfinder 
{

	public static float computeinterest(float[] arr) 
	{
		float res=0;
		if (arr[3]==1)
		{
			res=arr[0]*((arr[1]*arr[2]));
		}
		else if (arr[3]==2) 
		{
			res=(float) (arr[0]*(Math.pow(((arr[1]/arr[4])), arr[2]*arr[4])));
		}
		return res;
	}
}