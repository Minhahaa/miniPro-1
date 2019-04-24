package com.kh.miniProject.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Movie extends JPanel {
	private JFrame start;
	
	private JPanel movie;

	public Movie(JFrame start) {
		this.start = start;
		movie = this;
		this.setBounds(0, 0, 960, 720);
		this.setLayout(null);
//		JLabel MovieBack = new JLabel(
//				new ImageIcon(new ImageIcon("images/��ȭ��.PNG").getImage().getScaledInstance(960, 720, 0)));
//		MovieBack.setBounds(0, 0, 960, 720);
		this.setBackground(Color.cyan);
		System.out.println("�г� ����");
		
		movieInit();
		
		
		
//		mf.addKeyListener(new KeyAdapter() {
//
//			@Override
//			public void keyTyped(KeyEvent e) {
//				int num = 0;
//
//				if (e.getKeyCode() == KeyEvent.VK_SPACE) {
//					num = 1;
//				}
//
//			}
//
//		});
		

	}
	public void movieInit() {
		System.out.println("movie ���� ����");
		movie.setVisible(true);
		JButton exit = new JButton();
		exit.setLocation(890, 20);
		exit.setSize(30, 30);
		exit.setText("x");
		exit.addActionListener(new ChangeMain());
//		exit.addMouseListener(new MouseAdapter() {
//			@Override
//			public void mouseClicked(MouseEvent e) {
//				ChangePanel cp = new ChangePanel(mf , movie);
//				MiniMap mm = new MiniMap(mf);
//				
//				
//				cp.replacePanel(mm);
//			}
//		});
		
		
		movie.add(exit);
		
		
	}
	class ChangeMain implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			ChangePanel.ChangePanel(start, movie, new MiniMap(start));
		}
		
		
		
	}
}
