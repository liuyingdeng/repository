package cn.xupt.TestArrayList;

import java.util.LinkedList;

/**
 * 自定义Map升级版
 * 提高查询效率
 */
public class SxtMap002 {
	LinkedList[] arr=new LinkedList[9];//Map的底层结构：数据+链表
	int size;
	public void get(Object key,Object value) {
		SxtEntry e =new SxtEntry(key,value);
		int hash=key.hashCode();
		hash =hash<0?-hash:hash;
		int a=hash%arr.length;
		if(arr[a]==null) {
			LinkedList list=new LinkedList();
			arr[a]=list;
			list.add(e);
		}else {
			LinkedList list= arr[a];
			for(int i=0;i<list.size();i++) {
				SxtEntry e2=(SxtEntry)list.get(i);
				if(e2.key.equals(key)) {
					e2.value=value;//键值重复直接覆盖
					return;
				}
			}
			arr[a].add(e);
		}
	}
	public Object get(Object key) {
		int a=key.hashCode()%arr.length;
		if(arr[a]!=null) {
			LinkedList list=arr[a];
			for(int i=0;i<list.size();i++) {
				SxtEntry e=(SxtEntry)list.get(i);
				if(e.key.equals(key)) {
					return e.value;
				}
			}
		}
		return null;
	} 

	public static void main(String[] args) {
		SxtMap001 m = new SxtMap001();
		m.put("高琪", new Wife("杨幂"));
		m.put("高琪", new Wife("李四"));
		Wife w = (Wife) m.get("高琪");
		System.out.println(w.name); 
	}

}
