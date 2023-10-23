package layouts;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class LoginWindow {

	public static void main(String[] args) {
		// 로그인 창 만들기
		JFrame frame = new JFrame("로그인");
		frame.setSize(300, 250); 
		frame.setLocation(200, 100);
		frame.setLayout(null);
		
		//레이블
		JLabel lbl1 = new JLabel("아이디");
		lbl1.setSize(80, 30);
		lbl1.setLocation(30, 30);
		frame.add(lbl1);  //패널에 추가
		
		//입력상자
		JTextField txt1 = new JTextField();
		txt1.setSize(130, 30);
		txt1.setLocation(110, 30);
		frame.add(txt1);
		
		//레이블
		JLabel lbl2 = new JLabel("비밀번호");
		lbl2.setSize(80, 30);
		lbl2.setLocation(30, 70);
		frame.add(lbl2);
		
		//입력상자
		JTextField txt2 = new JTextField();
		txt2.setSize(130, 30);
		txt2.setLocation(110, 70);
		frame.add(txt2);
		
		//로그인 버튼
		JButton btn = new JButton("로그인");
		btn.setSize(80, 30);
		btn.setLocation(100, 120);
		frame.add(btn);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
