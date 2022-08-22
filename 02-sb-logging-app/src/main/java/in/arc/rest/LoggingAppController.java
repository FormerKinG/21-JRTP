package in.arc.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoggingAppController {
	
	private Logger logger = LoggerFactory.getLogger(LoggingAppController.class);
	
	@GetMapping("/welcome")
	public String getMessage() {
		logger.info("inside getMessage Logger App Controller");
		System.out.println("LoggingAppController.getMessage()");
		logger.info("processing msg");
		String msg="Welcome to Logging App Demo";
		logger.info("executed getMessage from Logger App Controller");
		return msg;
	}

}
