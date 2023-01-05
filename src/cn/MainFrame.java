package cn;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainFrame extends JFrame {
	private JPanel pnlMain;
	private JLabel lblImg;
	public MainFrame() {
		pnlMain = new JPanel(null) {
			@Override
			protected void paintComponent(Graphics g) {
				// TODO Auto-generated method stub
				Image img = new ImageIcon("images/背景.jpg").getImage();
				g.drawImage(img,0,0,550,459,this);
			}
		};
		lblImg = new JLabel(new ImageIcon("images/飞机.jpg"));
		init();
	}
	private void init() {
		// TODO Auto-generated method stub
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(550, 489);

		Image img = new ImageIcon("images/飞机.jpg").getImage();
		this.setIconImage(img);

		pnlMain.setBackground(new Color(120,100,75));
		lblImg.setBounds(200,300,27,39);

		this.setTitle("飞机大战");
		
		pnlMain.add(lblImg);

		this.add(pnlMain);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new MainFrame();
	}
}
