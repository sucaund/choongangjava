package edu.java.message;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Scrollbar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.LineBorder;

public class MessageGUI extends JFrame {

	JPanel northPanel = new JPanel();
	JPanel southPanel = new JPanel();

	public MessageGUI() {
		init();
	}

	void init() {
		this.setTitle("messagegui");
//		전체 크기는 BorderLayout으로 잡음
		this.setLayout(new BorderLayout());
		this.setBounds(0, 0, 400, 400);

		JScrollPane scrollPane = new JScrollPane();
//		스크롤을 존재하게....
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

//        20행 30열 짜리 텍스트 에어리어 만듬
		JTextArea textArea = new JTextArea(20, 30);
		scrollPane.setViewportView(textArea);



//        버튼 샌성
		JButton comeButton = new JButton("come data!");

//        scrollPane과 comeButton을 gui에 추가와 위치지정
		this.add(scrollPane, BorderLayout.CENTER);
		this.add(comeButton, BorderLayout.SOUTH);

//        버튼을 눌렀을떄 반응 (이벤트)
		comeButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				BufferedReader br = null;
				try {
//					
					br = new BufferedReader(new FileReader("c:/java_logs/log_2031121.txt"));
					String printStr = "";
					String readLine = "";
					while ((readLine = br.readLine()) != null) {
						printStr  += readLine + "\n";
					}
					textArea.setText(printStr );

				} catch (IOException e1) {
					// TODO 자동 생성된 catch 블록
					e1.printStackTrace();
				}
			}//actionPerformed
		}//addActionListener
	);//new ActionListener

		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setVisible(true);

	}

	private String readFile(String string) {
		// TODO 자동 생성된 메소드 스텁
		return null;
	}

	public static void main(String[] args) {
		new MessageGUI();
	}

}
