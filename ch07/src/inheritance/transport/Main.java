package inheritance.transport;

public class Main {

	public static void main(String[] args) {
		// Person 객체 생성
		Person sohee = new Person("박소희", 10000);
		Person daeho = new Person("이대호", 20000);
		
		// Bus 객체 생성
		Bus bus100 = new Bus("bus100");
		
		// Taxi 객체 생성
		Taxi 카카오택시 = new Taxi("카카오택시");
		
		//버스 타기
		sohee.take(bus100, 1500);
		daeho.take(bus100, 1500);
		
		//택시 타기
		sohee.take(카카오택시, 4800);
		
		//사람 정보 출력
		sohee.showPersonInfo();
		daeho.showPersonInfo();
		
		//차량 정보 출력
		bus100.showInfo();
		카카오택시.showInfo();
	}
}
