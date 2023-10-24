package windowinherit;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ButtonEvent extends JFrame{
	
	//생성자
	public ButtonEvent() {
		//프레임 생성(상속을 받으면 frame 객체 생성을 안해도 됨)
		//JFrame frame = new JFrame();
		this.setTitle("인사하는 프로그램");
		//this.setSize(250, 150); //프레임 크기 설정 안함
		this.setLocation(200, 100);
		
		//컴포넌트 생성 - 위쪽-입력상자, 버튼, 아래쪽-레이블
		JTextField text = new JTextField();
		text.setPreferredSize(new Dimension(200, 40));
		text.setFont(new Font("함초롬돋움", Font.PLAIN, 30)); //보통 굵기로 30포인트 크기
		text.setForeground(new Color(0x00ff00));  //색상 표현법 - 1.16진수, 2-(255, 255, 255)
		text.setBackground(Color.black);
		
		JButton button = new JButton("확인");
		
		JLabel label = new JLabel("Hello~");
		label.setPreferredSize(new Dimension(200, 50));
		label.setFont(new Font("함초롬돋움", Font.PLAIN, 25));
		
		//프레임에 객체 추가 - BorderLayout 배치
		this.add(text, BorderLayout.CENTER);
		this.add(button, BorderLayout.EAST);
		this.add(label, BorderLayout.SOUTH);
		
		//액션 이벤트
		ActionListener listener = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String username = text.getText();
				label.setText("Hello~ " + username);
			}
		};
		button.addActionListener(listener);
		
		this.pack();   //프레임 역할
		//디스플레이
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //종료
	    this.setVisible(true);
	}
	
	public static void main(String[] args) {
		//생성자를 통해 구현
		ButtonEvent event = new ButtonEvent();
	}

}
