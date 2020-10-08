package com.pe.web.movie.app.utilitario;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Util {

	public static String convertToStringDate(LocalDateTime date) {

		DateTimeFormatter formatter = DateTimeFormatter
				.ofPattern("dd-MM-yyyy HH:mm:ss");
		return  date.format(formatter);
	}
}
