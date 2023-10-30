package scraping;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class StockInfo {

	public static void main(String[] args) {
		//네이버 증권 사이트에서 주식 정보 가져오기
		//네이버 증권 > 국내증시 > 상승
		//url 가져오기
		String url = "https://finance.naver.com/sise/sise_rise.naver";
		
		//연결하기
		Connection conn = Jsoup.connect(url);
		
		//url의 데이터 정보 가져오기
		try {
			Document doc = conn.get();
			//System.out.println(doc.html());
			
			if(doc != null) { //data가 있으면 실행
				//Elements elements = doc.select(".type_2 tbody tr");
				Elements elements = doc.select("table[class='type_2'] tbody tr");
				for(Element element : elements) {
					String stock = element.text();  //문자열 변수에 저장
					System.out.println(stock);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
