package cn.xupt.plane;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * 游戏窗口的物体沿任意角度飞行和停止
 * @author Administrator
 */

public class GameFrame5 extends MyFrame {  //GUI编程：AWT，swing等。
	
	Image img=GameUtil.getImage("images/sun02.jpg");
	
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
	
	public static void main(String[] args) {
		GameFrame5 gf=new GameFrame5();
		gf.launchFrame();
		
	}
}
