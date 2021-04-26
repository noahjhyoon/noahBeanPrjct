package noah.bean.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class sampleTestController {
	
	private static final Logger logger = LoggerFactory.getLogger(sampleTestController.class);
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.debug("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	@RequestMapping(value = "/sampleTest01", method = RequestMethod.GET)
	public String sampleTest01(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		return "/sampleTest01";
	}
	
	@RequestMapping(value = "sampleTest/sampleTest02", method = RequestMethod.GET)
	public String sampleTest02(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		return "sampleTest/sampleTest02";
	}
	
}
