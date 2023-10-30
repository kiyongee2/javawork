package datascraping;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class ExchangeRate {

	public static void main(String[] args) {
		try {
			//환율 정보를 가져올 웹 페이지 url 
			String url = "https://finance.naver.com/marketindex/";
			
			//Connection 객체 생성
			//Connection conn = Jsoup.connect(url);
			
			//접속 페이지의 데이터 가져오기
			Document doc = Jsoup.connect(url).get();
			System.out.println(doc);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
