package cn.xupt.SortTest;

/**
 * ����ð������������Լ��Ż���
 * @author Administrator
 *
 */
public class BubbleSort {
	/**
	 * ����һ����������飬����˫��Forѭ��������for��Ҫ��ȷ�����������ڲ��forȷ������ÿһ��Ӧ�ý����Ĵ���
	 */
	for(int i=0;i<=a.length;i++) {
		for(int j=0;j<=a.length-i-1;j++) {
			if(a[j]>a[j+1]) {
				int temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
		}
		
	}
	/**
	 * �Ż�һ���ڴ����м���һ����ǣ�������û�з�������ʱ��ֱ������ѭ��
	 */
	int tag;
	for(int i=0;i<=a.length;i++) {
		tag==0;
		for(int j=0;j<=a.length-i-1;j++) {
			if(a[j]>a[j+1]) {
				int temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
				tag==1;
			}
			if(tag==0) break;
		}
	}
	/**
	 * ��һ�ν�����ɺ󣬵ڶ��εĽ������Խ��е���һ�ν��������һ�η���������λ�á�
	 */
	int tag;
	int flag=a.length-1;
	for(int i=0;i<=a.length;i++) {
		tag==0;
		for(int j=0;j<=flag;j++) {
			if(a[j]>a[j+1]) {
				int temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
				tag==1;
				flag=j;
			}
			if(tag==0) break;
		}
	}
}
