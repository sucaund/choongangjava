package edu.java.gui;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.ImageFilter;

import javax.swing.border.Border;

//현재 클래스 생성자 구성내용은 클래스가 프레임 자체를 상속받아 프레임 소속으로 만들었으므로
//GUIExer1는 프레임 그자체이다.
public class GUIExer1 extends Frame {
	Image image;
	GUIExer1() {
		this.setTitle("처음 만들어보는 프레임");
		this.setBackground(Color.ORANGE);
		this.setSize(400, 400);
		this.setLayout(new BorderLayout());
//		x눌렀을시 창이 닫히는!
		this.addWindowListener(new WindowAdapter() {
		public void windowClosing(WindowEvent e) {
				System.out.println(e.getSource().toString());
				dispose();
			}
		});
		
		
//		해당프레임의 구성요소 안에 추가한다 버튼을
		Button button = new Button("버튼");
//		버튼또한 컨테이너에 속하므로 컨테이너 메소드를 사용할수 있다
		button.setBackground(Color.BLUE);
		button.setSize(100, 100);
//	버튼을 눌렀을시 일어나는!
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼이 눌렸어요!");
			}
		});
		
//		this(생성자 구성요소)를 통해 add안에 버튼을!
		this.add(button,BorderLayout.NORTH);
//		텍스트 입력박스
TextField tf =new TextField("여기입력",10);
Button button2 =new Button("확인");
//BorderLayout 에대한 이해 필요!
Panel panel = new Panel(new BorderLayout());
panel.add(tf, BorderLayout.WEST);
panel.add(button2, BorderLayout.EAST);
this.add(panel,BorderLayout.SOUTH);

button2.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
	System.out.println(tf.getText());
	System.out.println("가 입력됬어요!");
	}
});

//이미지 추가 ??? toolkit은 어디서 나온 걸까?
//1.이미지 경로 추가
String imgPath ="C:/data/연어.jpg";
image =Toolkit.getDefaultToolkit().getImage(imgPath);

this.setVisible(true);
//		this.pack();
	
	}//GUIExer1 생성자 안의 구성요소

//	메인 실행문!
	public static void main(String[] args) {

		new GUIExer1();
	}
	
//	이름 그대로 그리는 개체 사진을 그려넣었다?!
	public void paint(Graphics g) {
		g.drawImage(image,0,0,this);
		
	}
}
