
package com.kh.miniProject.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ThemePark extends JPanel {
	private JFrame start;

	private JPanel themePark;

	public ThemePark(JFrame start) {
		this.start = start;
		themePark = this;
		this.setBounds(0, 0, 960, 720);
		this.setLayout(null);
//				JLabel ThemeParkBack = new JLabel(
//						new ImageIcon(new ImageIcon("images/��ȭ��.PNG").getImage().getScaledInstance(960, 720, 0)));
//				ThemeParkBack.setBounds(0, 0, 960, 720);
		this.setBackground(Color.ORANGE);
		System.out.println("�г� ����");

		ThemeParkInit();

	}

	public void ThemeParkInit() {
		System.out.println("ThemePark ���� ����");
		themePark.setVisible(true);
		JButton exit = new JButton();
		exit.setLocation(850, 50);
		exit.setSize(30, 30);
		exit.setText("x");
		exit.addActionListener(new ChangeMain());

		themePark.add(exit);

	}

	class ChangeMain implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			ChangePanel.ChangePanel(start, themePark, new MiniMap(start));
		}

	}
}
