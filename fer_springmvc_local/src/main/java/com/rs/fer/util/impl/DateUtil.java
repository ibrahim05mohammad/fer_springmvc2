package com.rs.fer.util.impl;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
	public static String getCurrentDate() {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-YYYY");
		return simpleDateFormat.format(new Date());
	}
}
