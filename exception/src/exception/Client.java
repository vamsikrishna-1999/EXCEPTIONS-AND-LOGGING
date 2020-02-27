package exception;
import org.apache.logging.log4j.*;


import java.io.IOException;



public class Client {
	static Logger logger=LogManager.getLogger();

	public static void main(String[] args) throws IOException {
		
		logger.info("About to take inputs for interest finder");
		float[] interestparams=inputsoutputsforinterest.takeinputs();
		logger.info("Starting computation of interest");
		String interest=String.valueOf(interestfinder.computeinterest(interestparams));
		inputsoutputsforinterest.printoutput(interest);
		logger.info("Interest finder completed");
		
		
		logger.info("About to take inputs for construction cost calculator");
		float[] constructionparams=ioconstruction.takeinputs();
		
		String cost=String.valueOf(costfinder.computecost(constructionparams));
		ioconstruction.printoutput(cost);
		logger.info("Construction cost calculator completed");
				
		
		
	}

}