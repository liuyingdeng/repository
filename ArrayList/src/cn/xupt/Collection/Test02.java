package cn.xupt.Collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test02 {
	public static void printEmpName(List<Map> list) {
		for(int i=0;i<list.size();i++) {
			Map tempMap=list.get(i);
			System.out.println(tempMap.get("name")+"--"+tempMap.get("salary"));
		}
	}
	public static void main(String[] args) {
		//һ��Map��Ӧһ�м�¼
		Map map=new HashMap();
		map.put("id",0301);
		map.put("name", "����");
		map.put("salary", 3050);
		map.put("department", "��Ŀ��");
		map.put("hareDate", "2016-06");
		
		Map map2=new HashMap();
		map2.put("id",0302);
		map2.put("name", "��ʿ��");
		map2.put("salary", 3500);
		map2.put("department", "��ѧ��");
		map2.put("hareDate", "2016-09");
		
		Map map3=new HashMap();
		map3.put("id",0301);
		map3.put("name", "����");
		map3.put("salary", 3550);
		map3.put("department", "��ѧ��");
		map3.put("hareDate", "2016-09");
		
		List<Map> list=new ArrayList<Map>();
		list.add(map);
		list.add(map2);
		list.add(map3);
		printEmpName(list);
	}
}
