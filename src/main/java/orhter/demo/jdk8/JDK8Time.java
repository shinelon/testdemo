package orhter.demo.jdk8;

import java.time.Clock;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.MonthDay;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class JDK8Time {

	public static void main(String[] args) {
		new JDK8Time(). UDateToLocalDateTime();
		
		LocalDate today = LocalDate.now();
		System.out.println("Today's Local date : " + today);

		// LocalDate today = LocalDate.now();
		int year = today.getYear();
		int month = today.getMonthValue();
		int day = today.getDayOfMonth();
		System.out.printf("Year : %d Month : %d day : %d \t %n", year, month, day);

		LocalDate dateOfBirth = LocalDate.of(2010, 01, 14);
		System.out.println("Your Date of birth is : " + dateOfBirth);

		LocalDate date1 = LocalDate.of(2010, 01, 14);
		if (date1.equals(dateOfBirth)) {
			System.out.printf("Today %s and date1 %s are same date %n", today, date1);
		}

		// LocalDate dateOfBirth = LocalDate.of(2010, 01, 14);
		MonthDay birthday = MonthDay.of(dateOfBirth.getMonth(), dateOfBirth.getDayOfMonth());
		MonthDay currentMonthDay = MonthDay.from(today);
		if (currentMonthDay.equals(birthday)) {
			System.out.println("Many Many happy returns of the day !!");
		} else {
			System.out.println("Sorry, today is not your birthday");
		}

		LocalTime time = LocalTime.now();
		System.out.println("local time now : " + time);

		// LocalTime time = LocalTime.now();
		LocalTime newTime = time.plusHours(2); // adding two hours
		System.out.println("Time after 2 hours : " + newTime);

		LocalDate nextWeek = today.plus(1, ChronoUnit.WEEKS);
		System.out.println("Today is : " + today);
		System.out.println("Date after 1 week : " + nextWeek);

		LocalDate previousYear = today.minus(1, ChronoUnit.YEARS);
		System.out.println("Date before 1 year : " + previousYear);
		LocalDate nextYear = today.plus(1, ChronoUnit.YEARS);
		System.out.println("Date after 1 year : " + nextYear);

		// Returns the current time based on your system clock and set to UTC.
		Clock clock = Clock.systemUTC();
		System.out.println("Clock : " + clock);

		// Returns time based on system clock zone Clock defaultClock =
		Clock.systemDefaultZone();
		System.out.println("Clock : " + clock);

		LocalDate tomorrow = LocalDate.of(2014, 1, 15);
		if (tomorrow.isAfter(today)) {
			System.out.println("Tomorrow comes after today");
		}
		LocalDate yesterday = today.minus(1, ChronoUnit.DAYS);
		if (yesterday.isBefore(today)) {
			System.out.println("Yesterday is day before today");
		}

		System.out.println("123:"+getToday());
	}

	public static String getToday() {
		LocalDateTime arrivalDate = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
		//DateTimeFormatter.BASIC_ISO_DATE
		return arrivalDate.format(formatter);
	}
	// 01. java.util.Date --> java.time.LocalDateTime
	public void UDateToLocalDateTime() {
	java.util.Date date = new java.util.Date();
	Instant instant = date.toInstant();
	ZoneId zone = ZoneId.systemDefault();
	LocalDateTime localDateTime = LocalDateTime.ofInstant(instant, zone);
	System.out.println(localDateTime.toString());
	}

	// 02. java.util.Date --> java.time.LocalDate
	public void UDateToLocalDate() {
	java.util.Date date = new java.util.Date();
	Instant instant = date.toInstant();
	ZoneId zone = ZoneId.systemDefault();
	LocalDateTime localDateTime = LocalDateTime.ofInstant(instant, zone);
	LocalDate localDate = localDateTime.toLocalDate();
	}

	// 03. java.util.Date --> java.time.LocalTime
	public void UDateToLocalTime() {
	java.util.Date date = new java.util.Date();
	Instant instant = date.toInstant();
	ZoneId zone = ZoneId.systemDefault();
	LocalDateTime localDateTime = LocalDateTime.ofInstant(instant, zone);
	LocalTime localTime = localDateTime.toLocalTime();
	}

	// 04. java.time.LocalDateTime --> java.util.Date
	public void LocalDateTimeToUdate() {
	LocalDateTime localDateTime = LocalDateTime.now();
	ZoneId zone = ZoneId.systemDefault();
	Instant instant = localDateTime.atZone(zone).toInstant();
	java.util.Date date = Date.from(instant);
	}

	// 05. java.time.LocalDate --> java.util.Date
	public void LocalDateToUdate() {
	LocalDate localDate = LocalDate.now();
	ZoneId zone = ZoneId.systemDefault();
	Instant instant = localDate.atStartOfDay().atZone(zone).toInstant();
	java.util.Date date = Date.from(instant);
	}

	// 06. java.time.LocalTime --> java.util.Date
	public void LocalTimeToUdate() {
	LocalTime localTime = LocalTime.now();
	LocalDate localDate = LocalDate.now();
	LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);
	ZoneId zone = ZoneId.systemDefault();
	Instant instant = localDateTime.atZone(zone).toInstant();
	java.util.Date date = Date.from(instant);
	}
}
