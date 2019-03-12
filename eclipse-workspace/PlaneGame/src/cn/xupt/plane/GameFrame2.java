package cn.xupt.plane;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * ��Ϸ���ڲ�����
 * @author Administrator
 *
 */

public class GameFrame2 extends Frame {  //GUI��̣�AWT��swing�ȡ�
	
	Image img=GameUtil.getImage("images/sun01.jpg");
	
	public void launchFrame() {
		setSize(1200,800);
		setLocation(100,100);
		setVisible(true);
		
		new PaintThread().start();   //�����ػ��߳�
		addWindowListener(new WindowAdapter(){
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
	private double x,y;
	private boolean left;
	private boolean up;
	@Override
	public void paint(Graphics g) {
		g.drawImage(img,(int)x,(int)y,null);
		if(left) {
			x-=50;
		}else {
			x+=50;
		}
		if(x>1200-500) {
			left=true;
		}
		if(x<0) {
			left=false;
		}
		if(up) {
			y-=50;
		}else {
			y+=50;
		}
		if(y>800-500) {
			up=true;
		}
		if(y<0) {
			up=false;
		}	
	}
	
	/**
	 * ����һ���ػ������߳��࣬��һ���ڲ��ࡣ
	 * @author Administrator
	 *
	 */
	class PaintThread extends Thread{
		public void run() {
			while(true) {
				repaint();
				try {
					Thread.sleep(40);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public static void main(String[] args) {
		GameFrame2 gf=new GameFrame2();
		gf.launchFrame();
		
	}
}