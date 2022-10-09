package 크롤링;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 크롤링연습4 {

	public static void main(String[] args) {
		//1. 사이트에 연결해서, html문서를 다 가지고 온다.
		try {
			Document doc = Jsoup.connect("https://finance.naver.com/item/main.naver?code=005930").get();
//			System.out.println(doc);
			//Elements는 ArrayList의 자식
//			Elements list = doc.select("td.first").select(".blind"); //class가 nav인 태그를 다 찾아서 묶어서 가지고 온다.
//			System.out.println(list);
//			Element tag = list.get(0);
//			System.out.println(tag.text());
//			String yesterday = tag.text(); //
			System.out.println("------------------------------");
			System.out.println("회사명: 삼성전자");
			
			Elements list = doc.select("td.first").select(".blind");
			Element tag = list.get(0);
			System.out.println("현재가: " + tag.text());
			
			Elements list2 = doc.select("div.today").select(".blind");
			Element tag2 = list2.get(0);
			System.out.println("전일가: " + tag2.text());
			String today = tag2.text();

			Elements list3 = doc.select("td.first").select(".blind");
			Element tag3 = list3.get(1);
			System.out.println("시가: " + tag3.text());
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
