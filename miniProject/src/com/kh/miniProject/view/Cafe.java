package com.kh.miniProject.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Cafe extends JPanel {
	private JFrame start;

	private JPanel cafe;

	public Cafe(JFrame start) {
		this.start = start;
		cafe = this;
		this.setBounds(0, 0, 960, 720);
		this.setLayout(null);
//		JLabel cafeBack = new JLabel(
//				new ImageIcon(new ImageIcon("images/��ȭ��.PNG").getImage().getScaledInstance(960, 720, 0)));
//		cafeBack.setBounds(0, 0, 960, 720);
		this.setBackground(Color.ORANGE);
		System.out.println("�г� ����");
		
		cafeInit();
		
		


	}

	public void cafeInit() {
		System.out.println("cafe ���� ����");
		cafe.setVisible(true);
		JButton exit = new JButton();
		exit.setLocation(850, 50);
		exit.setSize(30, 30);
		exit.setText("x");
		exit.addActionListener(new ChangeMain());

		cafe.add(exit);

	}

	class ChangeMain implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			ChangePanel.ChangePanel(start, cafe, new MiniMap(start));
		}

	}
	

}
