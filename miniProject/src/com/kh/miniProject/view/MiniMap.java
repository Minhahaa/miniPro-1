package com.kh.miniProject.view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MiniMap extends JPanel {
	private JFrame start;
	private JPanel MiniMap;
	private JPanel main;
	// ImageIcon background;

	public MiniMap(JFrame start) {
		this.start = start;
		main = this;
		MiniMap = this;
		MiniMap.setBounds(0, 0, 960, 720);
		this.setBackground(Color.PINK);
		
		
		ImageIcon icon = new ImageIcon("E:/eclipse-workspace3/miniProject/miniMap.png");
	       this.setSize(960, 720);
	       
	    
	       
	        //배경 Panel 생성후 컨텐츠페인으로 지정      
//	       MiniMap = new JPanel() {
//	            public void paintComponent(Graphics g) {
//	                g.drawImage(icon.getImage(), 0, 0,960,720, null);
//	                setOpaque(false); 
//	                super.paintComponent(g);
//	            }
//	        };

		
	        this.setLayout(null);

		JLabel placeName1 = new JLabel("영화관");
		placeName1.setLocation(455, 260);
		placeName1.setSize(150, 50);
		JLabel placeName2 = new JLabel("카페");
		placeName2.setLocation(130, 160);
		placeName2.setSize(150, 50);
		JLabel placeName3 = new JLabel("공원");
		placeName3.setLocation(260, 110);
		placeName3.setSize(150, 50);
		JLabel placeName4 = new JLabel("바닷가");
		placeName4.setLocation(275, 460);
		placeName4.setSize(150, 50);
		JLabel placeName5 = new JLabel("식당");
		placeName5.setLocation(660, 160);
		placeName5.setSize(150, 50);
		JLabel placeName6 = new JLabel("번화가");
		placeName6.setLocation(455, 500);
		placeName6.setSize(150, 50);
		JLabel placeName7 = new JLabel("노래방");
		placeName7.setLocation(55, 240);
		placeName7.setSize(150, 50);
		JLabel placeName8 = new JLabel("술집");
		placeName8.setLocation(560, 10);
		placeName8.setSize(150, 50);
		JLabel placeName9 = new JLabel("꽃집");
		placeName9.setLocation(610, 430);
		placeName9.setSize(150, 50);
		JLabel placeName10 = new JLabel("놀이공원");
		placeName10.setLocation(190, 280);
		placeName10.setSize(150, 50);

		JButton place1 = new JButton();
		place1.setLocation(450, 300);
		place1.setSize(50, 50);



		JButton place2 = new JButton();
		place2.setLocation(120, 200);
		place2.setSize(50, 50);

		JButton place3 = new JButton();
		place3.setLocation(250, 150);
		place3.setSize(50, 50);

		JButton place4 = new JButton();
		place4.setLocation(270, 500);
		place4.setSize(50, 50);

		JButton place5 = new JButton();
		place5.setLocation(650, 200);
		place5.setSize(50, 50);

		JButton place6 = new JButton();
		place6.setLocation(450, 540);
		place6.setSize(50, 50);

		JButton place7 = new JButton();
		place7.setLocation(50, 280);
		place7.setSize(50, 50);

		JButton place8 = new JButton();
		place8.setLocation(550, 50);
		place8.setSize(50, 50);

		JButton place9 = new JButton();
		place9.setLocation(600, 470);
		place9.setSize(50, 50);

		JButton place10 = new JButton();
		place10.setLocation(190, 320);
		place10.setSize(50, 50);

		JButton place11 = new JButton();
		place11.setLocation(850,50);
		place11.setSize(30,30);
		place11.setText("x");
		
		place11.addActionListener(new ChangeMain());
		place1.addActionListener(new ChangeMovie());
		place2.addActionListener(new ChangeCafe());
		place3.addActionListener(new ChangePark());
		place4.addActionListener(new ChangeBeach());
		place5.addActionListener(new ChangeRestaurant());
		place6.addActionListener(new ChangeHotPlace());
		place7.addActionListener(new ChangeSiningRoom());
		place8.addActionListener(new ChangePub());
		place9.addActionListener(new ChangeFlowerShop());
		place10.addActionListener(new ChangeThemePark());
		
		this.add(place1);
		this.add(place2);
		this.add(place3);
		this.add(place4);
		this.add(place5);
		this.add(place6);
		this.add(place7);
		this.add(place8);
		this.add(place9);
		this.add(place10);
		this.add(place11);
		this.add(placeName1);
		this.add(placeName2);
		this.add(placeName3);
		this.add(placeName4);
		this.add(placeName5);
		this.add(placeName6);
		this.add(placeName7);
		this.add(placeName8);
		this.add(placeName9);
		this.add(placeName10);

	}
	class ChangeMain implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			ChangePanel.ChangePanel(start, main, new Main(start));
		}

	}

	class ChangeMovie implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			ChangePanel.ChangePanel(start, MiniMap, new Movie(start));
		}

	}

	class ChangePark implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			ChangePanel.ChangePanel(start, MiniMap, new Park(start));
		}

	}
	class ChangeCafe implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			ChangePanel.ChangePanel(start, MiniMap, new Cafe(start));
		}

	}
	class ChangeBeach implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			ChangePanel.ChangePanel(start, MiniMap, new Beach(start));
		}

	}
	class ChangeRestaurant implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			ChangePanel.ChangePanel(start, MiniMap, new Restraurant(start));
		}

	}
	class ChangeHotPlace implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			ChangePanel.ChangePanel(start, MiniMap, new HotPlace(start));
		}

	}
	
	class ChangeSiningRoom implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			ChangePanel.ChangePanel(start, MiniMap, new SingingRoom(start));
		}

	}
	class ChangePub implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			ChangePanel.ChangePanel(start, MiniMap, new Pub(start));
		}

	}
	class ChangeFlowerShop implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			ChangePanel.ChangePanel(start, MiniMap, new FlowerShop(start));
		}

	}
	class ChangeThemePark implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			ChangePanel.ChangePanel(start, MiniMap, new ThemePark(start));
		}

	}
	
}
