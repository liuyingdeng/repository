package cn.xupt.SortTest;

/**
 * 关于冒泡排序的内容以及优化。
 * @author Administrator
 *
 */
public class BubbleSort {
	/**
	 * 对于一组给定的数组，利用双层For循环，外层的for主要是确定趟数，而内层的for确定对于每一趟应该交换的次数
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
	 * 优化一：在代码中加入一个标记，当其中没有发生交换时，直接跳出循环
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
	 * 当一次交换完成后，第二次的交换可以进行到第一次交换的最后一次发生交换的位置。
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
