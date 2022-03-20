package Utility;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Date {

	public void DateDDMMYYY() {
		DateFormat dateFormat = new SimpleDateFormat("DDMMYYYY");
		Calendar cal = Calendar.getInstance();
		String dDate = dateFormat.format(cal.getTime());
	}

	public void DateandTime() {
		DateFormat dateFormat = new SimpleDateFormat("DDMMYYYYHHMMSS");
		Calendar cal = Calendar.getInstance();
		String TDate = dateFormat.format(cal.getTime());
	}

	public void Time() {
		DateFormat dateFormat = new SimpleDateFormat("HHMMSS");
		Calendar cal = Calendar.getInstance();
		String SDate = dateFormat.format(cal.getTime());
	}

}
