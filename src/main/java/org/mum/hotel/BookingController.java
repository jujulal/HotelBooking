package org.mum.hotel;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BookingController {
	@RequestMapping(value = "/booking", method = RequestMethod.GET)
	public String booking(Locale locale, Model model) {
		
		return "booking/bookingForm";
	}
	@RequestMapping(value="/bookingConfirm", method=RequestMethod.POST)
	public String bookingConfirm(Locale locale, Model model){
	
		return "booking/bookingConfirm";
	}

}
