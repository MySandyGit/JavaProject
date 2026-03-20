package com.Bank;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class dateandtime {
	
	LocalDateTime todayDateandTime = LocalDateTime.now();
		String DandT() {

		//----data and time format print section
			
			DateTimeFormatter formatter =
			        DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

			String formatted = todayDateandTime.format(formatter);
			//System.out.println(formatted);
      return formatted;
	}
}
