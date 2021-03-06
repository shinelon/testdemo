package orhter.demo.jdk8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class jdk8Stream {
	public static void main(String[] args) {
		streamdemo3();
		Article a1 = new Article("title1", "author1",
				Arrays.asList("tags11", "tags12", "tags13").stream().collect(Collectors.toList()));
		Article a2 = new Article("title2", "author2",
				Arrays.asList("tags21", "tags22", "tags23").stream().collect(Collectors.toList()));
		Article a3 = new Article("title3", "author3",
				Arrays.asList("tags21", "tags22", "tags23").stream().collect(Collectors.toList()));
		List<Article> la = Arrays.asList(a1, a2,a3);
		la.forEach(System.out::println);
		Map<String, List<Article>> ma = la.stream().collect(Collectors.groupingBy(Article::getAuthor));
		Map<String,List<String>> map=la.stream().collect(Collectors.groupingBy(Article::getAuthor,Collectors.mapping(Article::getAuthor, Collectors.toList())));
		System.out.println("map:"+map.toString());
		Map<String, String> mm = la.stream().collect(Collectors.toMap(Article::getTitle, Article::getAuthor));
		System.out.println("mm:"+mm.toString());
		mm.forEach((k,v)->System.out.println("k:"+k+" v:"+v));
		mm.merge("title13", "author1", (newv,oldv)->newv.concat(oldv));
		mm.forEach((k,v)->System.out.println("merge-k:"+k+" v:"+v));
	}

	public static void streamdemo1(String... numbers) {
		List<String> list = Arrays.asList(numbers);
		List<Integer> r = list.stream().map(e -> new Integer(e)).distinct().filter(e -> e > 2).filter(e -> e < 5)
				.sorted().collect(Collectors.toList());
		System.out.println(r.toString());
	}

	public static void streamdemo2(String... numbers) {
		List<String> list = Arrays.asList(numbers);
		Optional<String> r = list.stream().map(e -> new String(e)).reduce((s1, s2) -> s1 + "#" + s2);
		// .collect(Collectors.toList());
		System.out.println(r.get());
	}
	public static void streamdemo3(){
		int count=Stream.of(1,2,3).reduce(0, (acc,element)->acc+element);
		System.out.println(count);
		//Assert.assertEquals(6,count);
	}
}
