package orhter.demo.instance.sort;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		if (o1.getScore() > o2.getScore())
			return -1;
		else if (o1.getScore() < o2.getScore())
			return 1;
		else {
			if (o1.getAge() > o2.getAge())
				return 1;
			else if (o1.getAge() < o2.getAge())
				return -1;
			else
				return 0;
		}
	}

}
