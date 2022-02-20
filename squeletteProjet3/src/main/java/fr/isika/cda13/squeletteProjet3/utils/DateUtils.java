package fr.isika.cda13.squeletteProjet3.utils;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class DateUtils {

	public static Date formDate(int year, int month, int day) {
		LocalDate dateSaisie = LocalDate.of(year, month, day);
		return Date.from(dateSaisie.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant());
	}

	public static Date getTodaysDate() {
		return Date.from(LocalDate.now().atStartOfDay().atZone(ZoneId.systemDefault()).toInstant());
	}

}
