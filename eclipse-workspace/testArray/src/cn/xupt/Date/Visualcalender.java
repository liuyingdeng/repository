package cn.xupt.Date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/** 
 * ���ӻ���������
 * @author Administrator
 */
public class Visualcalender {
	public static void main(String[] args) {
		String temp="2019-3-6";
		DateFormat format=new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date date=format.parse(temp);
			Calendar calendar=new  GregorianCalendar();
			calendar.setTime(date);
			
			calendar.set(calendar.DATE,1);
			System.out.println(calendar.get(calendar.DAY_OF_WEEK));
			System.out.println();
			int maxDate=calendar.getActualMaximum(calendar.DATE);
			System.out.println("��\tһ\t��\t��\t��\t��\t��");
			for(int i=0;i<calendar.get(calendar.DAY_OF_WEEK)-1 ;i++) {
				System.out.print("\t");
			}
			int j=0;
			for(int i=1;i<=maxDate;i++) {
				System.out.print(i+"\t");
				j++;
				int w=calendar.get(calendar.DAY_OF_WEEK);
				if(w==calendar.SATURDAY) {
					System.out.print('\n');
					}
				calendar.add(Calendar.DATE,1);
				}
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}