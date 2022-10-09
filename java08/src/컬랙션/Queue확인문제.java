package 컬랙션;

import java.util.ArrayList;
import java.util.LinkedList;

import javax.annotation.processing.AbstractProcessor;

public class Queue확인문제 {

	public static void main(String[] args) {
		
		LinkedList exam = new LinkedList();
		exam.add("국어");
		exam.add("수학");
		exam.add("영어");
		exam.add("컴퓨터");
		
		exam.remove();
		System.out.println("1일차 시험본 후 남은 과목: " + exam);

		exam.remove();
		System.out.println("2일차 시험본 후 남은 과목: " + exam);
		
		exam.remove();
		System.out.println("3일차 시험본 후 남은 과목: " + exam);
		
		//for문도 가능..
//		for (int i = 0; i <= exam.size(); i++) {
//			exam.remove();
//			System.out.println(i + 1 + "일차 시험본 후 남은 과목: " + exam);
//		}
		
	}

}
