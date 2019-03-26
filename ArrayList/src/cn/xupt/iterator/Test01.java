package cn.xupt.iterator;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Test01 {
	public static void main(String[]args) {
		List list=new ArrayList();
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		
		//通过索引遍历List
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
			
		//通过迭代器遍历List
			for(Iterator iter2=list.iterator();iter2.hasNext();) {
				String str=(String)iter2.next();
				System.out.println(str);
				iter2.remove();
			}
			System.out.println(list.size()+"******");
			Set set =new HashSet();
			set.add("高一");
			set.add("高二");
			set.add("高三");
			
			//通过迭代器遍历set
			Iterator iter =set.iterator();
			while(iter.hasNext()) {
				for(Iterator ite=set.iterator();iter.hasNext();) {
					String str = (String) iter.next();
					System.out.println(str);
				}
			}
		}
	}
}
