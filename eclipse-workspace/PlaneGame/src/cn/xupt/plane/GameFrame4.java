package cn.xupt.plane;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * ��Ϸ���ڵ�����������Ƕȷ��к�ֹͣ
 * @author Administrator
 */

public class GameFrame4 extends Frame {  //GUI��̣�AWT��swing�ȡ�
	
	Image img=GameUtil.getImage("images/sun02.jpg");
	
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
	private double degree=3.14/3;
	private double speed=100;
	
	@Override
	public void paint(Graphics g) {
		g.drawImage(img,(int)x,(int)y,null);
		
		if(speed>0) {
			speed -=1;
		}else {
			speed=0;
		}
		
		x+=speed*Math.cos(degree);
		y+=speed*Math.sin(degree);
		
		if(y>700||y<50) {
			degree=-degree;
		}
		if(x<0||x>1000) {
			degree=Math.PI-degree;
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
		GameFrame4 gf=new GameFrame4();
		gf.launchFrame();
		
	}
}