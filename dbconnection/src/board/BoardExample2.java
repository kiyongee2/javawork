package board;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class BoardExample2 {
	
	private Scanner scanner = new Scanner(System.in);
	private Connection conn;
	private PreparedStatement pstmt;
	
	//db 연결관련 변수
	private String driverClass = "oracle.jdbc.OracleDriver";
	private String url = "jdbc:oracle:thin:@localhost:1521/xe";
	private String user = "c##mydb";
	private String password = "pwmydb";
	
	//생성자
	public BoardExample2() {
		try {
			Class.forName(driverClass);
			conn = DriverManager.getConnection(url, user, password);
			//System.out.println("db 연결 성공!!" + conn);
		} catch (Exception e) {
			e.printStackTrace();
			exit();
		}
	}
	
	public void list() {
		System.out.println();
		System.out.println("[게시글 목록]");
		System.out.println("--------------------------------------------------------");
		System.out.printf("%-4s%-12s%-12s%-40s \n", "no", "writer", "date", "title");
		System.out.println("--------------------------------------------------------");
		
		//db - board 테이블의 모든 게시글 가져오기
		try {
			String sql = "SELECT bno, btitle, bcontent, bwriter, bdate "
					+ "FROM board ORDER BY bno DESC";
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) { //게시글이 있는 동안 반복(다음 행으로 이동)
				Board board = new Board();
			    //db의 값을 가져와서 board에 세팅
				board.setBno(rs.getInt("bno"));
				board.setBwriter(rs.getString("bwriter"));
				board.setBdate(rs.getDate("bdate"));
				board.setBtitle(rs.getString("btitle"));
				
				//게시글 출력
				System.out.printf("%-4s%-12s%-12s%-40s \n", 
						board.getBno(), 
						board.getBwriter(),
						board.getBdate(),
						board.getBtitle()
				);
			}//while 끝
			rs.close();
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
			exit();
		}
		
		mainMenu(); //mainMenu() 메서드 호출
	}
	
	public void mainMenu() {
		System.out.println("--------------------------------------------------------");
		System.out.println("1.Create | 2.Read | 3.Clear | 4.Exit");
		System.out.print("선택: ");
		
		String menuNo = scanner.nextLine();
		
		switch(menuNo) {
		case "1":
			create(); break;
		case "2":
			read(); break;
		case "3":
			clear(); break;
		case "4":
			exit(); break;
		}
	}
	
	public void create() {
		System.out.println("create() 메서드 실행됨");
		list();
	}
	
	public void read() {
		System.out.println("read() 메서드 실행됨");
		list();
	}
	
	public void clear() {
		System.out.println("clear() 메서드 실행됨");
		list();
	}
	
	public void exit() {
		System.out.println("*** 게시판을 종료합니다. ***");
		System.exit(0);   //즉시 종료
	}

	public static void main(String[] args) {
		BoardExample2 board1 = new BoardExample2();
		board1.list();
	}

}
