package cn.xupt.Collection;

import java.util.ArrayList;
import java.util.List;

public class Test01 {
	public static void main(String[] args) {
		Employee e1=new Employee(0301,"����",3000,"��Ŀ��","2003-09");
		Employee e2=new Employee(0302,"��ʿ��",3000,"��Ŀ��","2006-09");
		Employee e3=new Employee(0303,"����",3000,"��Ŀ��","2004-09");
		
		List<Employee> list=new ArrayList<Employee>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		printEmpName(list);
	}
	public static void printEmpName(List<Employee> list) {
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).getName());
		}
	}
}