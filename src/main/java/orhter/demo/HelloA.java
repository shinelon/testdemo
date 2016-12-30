package orhter.demo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class HelloA {
	public static void main(String args[]) {
		System.out.println(getToday());
//		distinctPrimary("1","2","3","4","5","5","6");
	}
	public static String getToday() {
        LocalDateTime arrivalDate = LocalDateTime.now();
        return arrivalDate.format(DateTimeFormatter.BASIC_ISO_DATE);
    }
	public static void distinctPrimary(String... numbers) {
		List<String> list = Arrays.asList(numbers);
		List<Integer> r = list.stream()
				.map(e -> new Integer(e))
				.distinct()
				.filter(e->e>2)
				.filter(e->e<5)
				.collect(Collectors.toList());
		System.out.println(r.toString());
	}

}
