package com.kh.miniProject.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import com.kh.miniProject.view.Beach.ChangeMain;

public class Beach extends JPanel {
	private JFrame start;

	private JPanel beach;

	public Beach(JFrame start) {
		this.start = start;
		beach = this;
		this.setBounds(0, 0, 960, 720);
		this.setLayout(null);
//		JLabel BeachBack = new JLabel(
//				new ImageIcon(new ImageIcon("images/��ȭ��.PNG").getImage().getScaledInstance(960, 720, 0)));
//		BeachBack.setBounds(0, 0, 960, 720);
		this.setBackground(Color.yellow);
		System.out.println("�г� ����");
		
		BeachInit();
		
		


	}

	public void BeachInit() {
		System.out.println("Beach ���� ����");
		beach.setVisible(true);
		JButton exit = new JButton();
		exit.setLocation(850, 50);
		exit.setSize(30, 30);
		exit.setText("x");
		exit.addActionListener(new ChangeMain());

		beach.add(exit);

	}

	class ChangeMain implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			ChangePanel.ChangePanel(start, beach, new MiniMap(start));
		}

	}
}

