package orhter.demo.listtraversal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LitstDemo {
	
	
	public static void main(String[] args) {
			List l1=new LinkedList<>();
			l1.add("1");
			l1.add("2");
			l1.add("3");
			List l2=new LinkedList<>();
			l2.add("4");
			l2.add("2");
			l2.add("3");
			
			System.out.println(intersect(l1,l2));
			
	}
	/**
     * 求ls对ls2的差集,即ls中有，但ls2中没有的
     * 
     * @param ls
     * @param ls2
     * @return 
     */
    public static List diff(List ls, List ls2) {
        List list = new ArrayList(Arrays.asList(new Object[ls.size()]));
        Collections.copy(list, ls);
        list.removeAll(ls2);
        return list;
    }

    /**
     * 求2个集合的交集
     * 
     * @param ls
     * @param ls2
     * @return
     */
    public static List intersect(List ls, List ls2) {
        List list = new ArrayList(Arrays.asList(new Object[ls.size()]));
        Collections.copy(list, ls);
        list.retainAll(ls2);
        return list;
    }

    /**
     * 求2个集合的并集
     * 
     * @param ls
     * @param ls2
     * @return
     */
    public static List union(List ls, List ls2) {
        List list = new ArrayList(Arrays.asList(new Object[ls.size()]));
        Collections.copy(list, ls);//将ls的值拷贝一份到list中
        list.removeAll(ls2);
        list.addAll(ls2);
        return list;
    }

}
