package Converters;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

public enum EpochConverter {
	INSTANCE;
	
	public void DateToEpoch(String input) {
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy/dd/MM HH:mm:ss");
		LocalDateTime localTime = LocalDateTime.parse(input, dateTimeFormatter);
		Instant zoneOffset = localTime.toInstant(ZoneOffset.UTC);
		System.out.println(zoneOffset.toEpochMilli() / 1000);
	}

}
