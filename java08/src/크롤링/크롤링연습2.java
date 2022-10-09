package 크롤링;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 크롤링연습2 {

	public static void main(String[] args) {
		//1. 사이트에 연결해서, html문서를 다 가지고 온다.
		try {
			Document doc = Jsoup.connect("https://finance.naver.com/item/main.naver?code=005930").get();
//			System.out.println(doc);
			//Elements는 ArrayList의 자식
//			Elements list = doc.select(".code"); //class가 nav인 태그를 다 찾아서 묶어서 가지고 온다.
//			System.out.println(list.size());
//			System.out.println(list.get(0));
//			System.out.println(list.get(1));
			Elements list = doc.select(".blind");
//			Elements list = doc.select("태그명");
//			Elements list = doc.select(".클래스명");
//			Elements list = doc.select("태그명.클래스명");
			
			System.out.println(list.size());
//			System.out.println(list);
			for (int i = 0; i < list.size(); i++) {
				Element tag = list.get(i);
				System.out.println(i + ": " + tag);
			}
			//현재가
//			Element tag = list.get(16);
//			System.out.println(tag.text());
			
			//전일가, 고가
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
