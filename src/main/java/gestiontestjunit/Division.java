package gestiontestjunit;

import java.util.logging.Logger;

public class Division extends Operations{
	
	public long division(long a, long b){
		if(b == 0){
			Logger logger= Logger.getLogger("InfoLogging");
			logger.info("************************connexion a la base******************************");
          System.out.println("merci ");
			throw new IllegalArgumentException("La division par b = 0 est impossible");
		}else{
			
			return a/b;
		}
		
	}

}
