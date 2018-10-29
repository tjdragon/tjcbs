package tjcbs.utils;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

import org.apache.commons.lang3.RandomStringUtils;

import com.google.gson.GsonBuilder;

public class CBSUtils {
	public static String toJSON(final Object o) {
		final GsonBuilder gsonBuilder = new GsonBuilder().serializeSpecialFloatingPointValues().disableHtmlEscaping();
		final String json = gsonBuilder.create().toJson(o);
		return json;
	}
	
	public static <T> T fromJSON(final String json, final Class<T> clazz) {
		final GsonBuilder gsonBuilder = new GsonBuilder().serializeSpecialFloatingPointValues().disableHtmlEscaping();
		return gsonBuilder.create().fromJson(json, clazz);
	}
	
	public static final String uuid() {
		final String uuid = UUID.randomUUID().toString();
		return uuid.replace("-", "");
	}
	
	public static final String uuid(final int length) {
		return RandomStringUtils.random(length);
	}
	
	public static final double round(final double value, final int decimals) {
		final BigDecimal bd = new BigDecimal(value).setScale(decimals, RoundingMode.HALF_UP);
	    return bd.doubleValue();
	}
	
	public static final String format(final LocalDate localDate, final String pattern) {
		final DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern); // yyyyMMdd
		final String formattedString = localDate.format(formatter);
		return formattedString;
	}
	
	public static final String format(final LocalDateTime localDateTime, final String pattern) {
		final DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern); // HHmm
		final String formattedString = localDateTime.format(formatter);
		return formattedString;
	}
	
	public static final int getTimeNow() {
		return Integer.parseInt(format(LocalDateTime.now(), "HHmm"));
	}
}
