package cn.xupt.plane;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import cn.xupt.plane.GameFrame2.PaintThread;

public class MyFrame extends Frame {
	/**
	 * 加载窗口
	 */
	public void launchFrame() {
		setSize(Constant.GAME_WIDTH,Constant.GAME_HEIGHT);
		setLocation(100,100);
		setVisible(true);
		
		new PaintThread().start();   //启动重画线程
		addWindowListener(new WindowAdapter(){
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
	// 利用双缓冲技术消除屏幕闪烁。现在用的是AWT技术，这个技术是比较老旧的，swing自己就解决了此问题。
	private Image offScreenImage=null;
	public void update (Graphics g) {
		if(offScreenImage==null) {
			offScreenImage=this.createImage(Constant.GAME_HEIGHT,Constant.GAME_WIDTH);
		}
		Graphics goff=offScreenImage.getGraphics();
		paint(goff);
		g.drawImage(offScreenImage,0,0,null);
	}
	
	
	/**
	 * 定义一个重画窗口线程类，是一个内部类。
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
	
}
