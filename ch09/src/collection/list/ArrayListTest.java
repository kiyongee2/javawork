package collection.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		// String 자료형으로 데이터 관리(CRUD)
		// 순서가 있고, 중복 데이터 저장할 수 있음
		List<String> vegeList = new ArrayList<>();
		
		//자료 생성(추가-Create: add())
		vegeList.add("양파");  //0번 인덱스에 저장
		vegeList.add("마늘");  //1번
		vegeList.add("감자");  //2번
		vegeList.add("양파");  //3번
		
		//특정 자료 조회(Read: get())
		System.out.println(vegeList.get(1));
		
		//리스트 객체의 개수
		System.out.println("총 객체수: " + vegeList.size());
		
		//객체 수정(Update: set())
		vegeList.set(2, "상추");
		
		//객체 삭제(Delete: remove())
		if(vegeList.contains("마늘"))  //안전하게 포함되어 있는지 확인함
			vegeList.remove("마늘");
		
		System.out.println("총 객체수: " + vegeList.size());
		
		//전체 자료 조회(Read: get())
		for(int i = 0; i < vegeList.size(); i++) { //리스트를 순회하면서
			String vege = vegeList.get(i);  //객체를 가져와서
			System.out.println(vege);       //출력함
		}
		
		System.out.println(vegeList);
	}
}
