package edu.java.gui;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.plaf.basic.BasicOptionPaneUI.ButtonActionListener;

public class JCEvent implements ActionListener {

	JTextField textField;
	JCLogic jcLogic;

	public JCEvent() {
		// TODO 자동 생성된 생성자 스텁
	}

	public JCEvent(JTextField textField, JCLogic jcLogic) {
		this.textField = textField;
		this.jcLogic = jcLogic;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		String sc = e.getActionCommand();
		jcLogic.content += sc;
		if ("ENTER".equals(sc)) {
			textField.setText(
					String.valueOf( jcLogic.add(jcLogic.content))
					);
		}

	}

}

//		누른 버튼 값을 텍스트 필드에다가 구현!!!!
