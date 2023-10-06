package banking.arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

import banking.array.Account;

public class BankArrayList {
	
	//통장 계좌를 저장할 자료 구조의 객체 생성
	static List<Account> accountList = new ArrayList<>();
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		boolean sw = true;
		
		while(sw) {
			try {
				System.out.println("======================================================================");
				System.out.println("1.계좌 생성 | 2.계좌 목록 | 3.예금 | 4.출금 | 5.계좌 삭제 | 6.계좌 검색 | 7. 종료");
				System.out.println("======================================================================");
				System.out.print("선택>");
				
				//메뉴 선택
				int selectNo = Integer.parseInt(scanner.nextLine());
				
				if(selectNo == 1) {
					createAccount();    //계좌 생성
				}else if(selectNo == 2) {
					getAccountList();   //계좌 목록
				}else if(selectNo == 3) {
					deposit();   //입금
				}else if(selectNo == 4) {
					withdraw();  //출금
				}else if(selectNo == 5) {
					removeAccount();  //계좌 삭제
				}else if(selectNo == 6) {
					selectAccount();  //계좌 검색
				}else if(selectNo == 7) {
					sw = false;    //종료
				}else {
					System.out.println("지원되지 않는 기능입니다. 다시 입력해 주세요");
				}
			}catch(NumberFormatException e) {
				//e.printStackTrace();
				System.out.println("올바른 숫자를 입력해주세요.");
			}
		}//while 끝
		System.out.println("프로그램을 종료합니다.");
		scanner.close();
	}//main 끝
	
	private static void createAccount() {
		System.out.println("-----------------------------");
		System.out.println("계좌 생성");
		System.out.println("-----------------------------");
		
		while(true) {
			System.out.print("계좌 번호(숫자만:00-00-000): ");
			String ano = scanner.nextLine();
			String regExp = "\\d{2}-\\d{2}-\\d{3}";  //정규 표현식
			boolean result = Pattern.matches(regExp, ano);
			if(result) {
				//중복 계좌가 있는지 체킹
				if(findAccount(ano) != null) { //중복 계좌가 있으면
					System.out.println("이미 등록된 계좌입니다. 다시 입력해 주세요.");
				}else { //중복 계좌가 없으면
					System.out.print("계좌주: ");
					String owner = scanner.nextLine();
					
					System.out.print("초기 입금액: ");
					int balance = Integer.parseInt(scanner.nextLine());
					
					//입력받은 내용을 매개변수로 계좌 생성함
					Account newAccount = new Account(ano, owner, balance); 
					accountList.add(newAccount);  //리스트에 저장
					System.out.println("결과: 계좌가 생성되었습니다.");
					break;
				}
			}else {
				System.out.println("계좌번호 형식이 아닙니다. 다시 입력해 주세요");
			}
		}//while 끝
	}//createAccount() 끝
	
	private static void getAccountList() {
		System.out.println("--------------------------------------------");
		System.out.println("계좌 목록");
		System.out.println("--------------------------------------------");
		
		//계좌 목록 조회
		for(int i=0; i<accountList.size(); i++) {
			 Account account = accountList.get(i);
				System.out.print("계좌번호: " + account.getAno() + "\t");
				System.out.print("계좌주: " + account.getOwner() + "\t");
				System.out.println("잔고: " + account.getBalance());
		}
	}//getAccountList() 끝
	
	private static void deposit() {
		System.out.println("--------------------------------------------");
		System.out.println("입금");
		System.out.println("--------------------------------------------");
		
		while(true) {
			System.out.print("계좌 번호: ");
			String ano = scanner.nextLine();
		
			if(findAccount(ano) != null) { //찾는 계좌가 있으면
				Account account = findAccount(ano); //계좌 객체 생성
				
				System.out.print("입금액: ");
				int money = Integer.parseInt(scanner.nextLine());
				
				account.setBalance(account.getBalance() + money);
				System.out.println("결과: 정상 처리되었습니다.");
				break; //while문 빠져나옴
			}else {
				System.out.println("결과: 계좌가 없습니다. 다시 입력해 주세요");
			}
		}//while 끝
	}//deposit() 끝
	
	private static void withdraw() {
		System.out.println("--------------------------------------------");
		System.out.println("출금");
		System.out.println("--------------------------------------------");
		
		while(true) { //계좌 번호 재입력
			System.out.print("계좌 번호: ");
			String ano = scanner.nextLine();
		
			if(findAccount(ano) != null) {
				while(true) { //출금액 재입력
					Account account = findAccount(ano);
					
					System.out.print("출금액: ");
					int money = Integer.parseInt(scanner.nextLine());
				
					if(money > account.getBalance()) { //출금액이 잔고보다 많으면
						System.out.println("잔액이 부족합니다. 다시 입력해 주세요.");
					}else {
						account.setBalance(account.getBalance() - money);
						System.out.println("결과: 정상 처리되었습니다.");
						break;
					}
				}//안쪽 while
				break;
			}else {
				System.out.println("결과: 계좌가 없습니다. 다시 입력해주세요");
			}
		}//바깥쪽 while 끝
	}
	
	//계좌 삭제
	private static void removeAccount() {
		System.out.println("--------------------------------------------");
		System.out.println("                계좌 삭제                     ");
		System.out.println("--------------------------------------------");
		
		while(true) {
			System.out.print("계좌 번호: ");
			String ano = scanner.nextLine();
		
			if(findAccount(ano) != null) { //찾는 계좌가 있으면
				for(int i=0; i<accountList.size(); i++) {
					//1.이미 등록된 계좌를 가져와서 
					//2.외부에서 입력한 계좌와 일치하는지 비교함
					String dbAno = accountList.get(i).getAno();
					if(dbAno.equals(ano)) {
						//accountList.remove(i);  //계좌 삭제(인덱스)
						Account account = accountList.get(i);
						accountList.remove(account);  //해당 계좌 객체로 삭제
						System.out.println("결과: 계좌가 삭제 되었습니다.");
						break;
					}
				}//for 끝
				break;
			}else {
				System.out.println("결과: 계좌가 없습니다. 다시 입력해 주세요");
			}
		}//while 끝
	}
	
	//특정 계좌 검색
	private static void selectAccount() {
		//계좌 번호와 일치하는 계좌 검색
		System.out.println("--------------------------------------------");
		System.out.println("                계좌 검색                     ");
		System.out.println("--------------------------------------------");
		
		while(true) {
			System.out.print("계좌 번호: ");
			String ano = scanner.nextLine();
		
			if(findAccount(ano) != null) { //찾는 계좌가 있으면
				for(int i=0; i<accountList.size(); i++) {
					//1.이미 등록된 계좌를 가져와서 
					//2.외부에서 입력한 계좌와 일치하는지 비교함
					String dbAno = accountList.get(i).getAno();
					if(dbAno.equals(ano)) {
						//accountList.remove(i);  //계좌 삭제(인덱스)
						Account account = accountList.get(i);
						System.out.println("결과: 계좌가 검색 되었습니다.");
						
						System.out.print("계좌번호: " + account.getAno() + "\t");
						System.out.print("계좌주: " + account.getOwner() + "\t");
						System.out.println("잔고: " + account.getBalance());
						break;
					}
				}//for 끝
				break;
			}else {
				System.out.println("결과: 계좌가 없습니다. 다시 입력해 주세요");
			}
		}//while 끝
	}
	
	private static Account findAccount(String ano) {
		Account account = null;  
		for(int i=0; i<accountList.size(); i++) {
			//1.이미 등록된 계좌를 가져와서 
			//2.외부에서 입력한 계좌와 일치하는지 비교함
			String dbAno = accountList.get(i).getAno();
			if(dbAno.equals(ano)) {
				account = accountList.get(i);  //계좌 객체 생성
				break;
			}
		}
		return account;
	}
}
