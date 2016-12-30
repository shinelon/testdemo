package orhter.demo.listtraversal;

import java.util.ArrayList;
import java.util.ListIterator;

public class Listtest {
	public static void main(String[] args) {
	    ArrayList<String> list = new ArrayList<String>();
	    list.add("A");
	    list.add("B");
	    list.add("C");
	     
	    System.out.println("........��һ�ֱ�����ʽ��for����......");
	    for (Object li : list) {
	      System.out.println(li);
	    }
	     
	    System.out.println("........�ڶ��ֱ�����ʽ��ListIterator��������......");
	    ListIterator<String> it = list.listIterator();
	    while (it.hasNext()) {
	      Object obj = it.next();
	      System.out.println(obj);
	    }
	  }
}

