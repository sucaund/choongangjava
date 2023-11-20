package edu.java.gui;

import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Rectangle;

import javax.naming.InitialContext;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class GUIExer2 extends JFrame {

	public GUIExer2() {

		init();
	}

	private void init() {
//	프레임 행열 지정
		this.setLayout(new GridLayout(3, 2));
//		프레임 크기
		this.setBounds(new Rectangle(500, 400));
		this.setTitle("스윙 JFRAME");
//		해당사항을 추가하지 않으면 창종료시 메모리만 남아있으므로!
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
// 초기 옵션 선택 화면
		JOptionPane.showConfirmDialog(this, "확인해 주세요!");

		
		//// 글자
		JTextField jt =new JTextField();
		jt.setSize(60, 60);
		this.add(jt);
////버튼 
		JButton jButton= new JButton("확인");
		jButton.setSize(100,50);
		this.add(jButton);
		JButton jButton2= new JButton("확인");
		jButton.setSize(100,50);
		this.add(jButton2);

		this.setVisible(true);
	}// init

	public static void main(String[] args) {
		new GUIExer2();
	}
}
