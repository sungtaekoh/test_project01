package com.care.def;

import java.util.Scanner;

import TV.TvMethod;
import washer.WasherMethod;

public class MainClass {//자바 미니프로젝트
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	int num;
	System.out.println("----- 가전제품 -----");
	while(true) {
		System.out.println("1.T V");
		System.out.println("2.세탁기");
		System.out.println("3.달력"); //+시계 라디오 달력(년월일 일정표기)
		System.out.println(">>> : ");
		num = input.nextInt();
		switch(num) {//TV
		case 1:
			TvMethod tv = new TvMethod();
			tv.TVdisplay();
			break;
		case 2://세탁기
			WasherMethod wahser = new  WasherMethod ();
			wahser.display();
			break;
		case 3://달력
			System.out.println("달력");
			break;
			
		}
		
	}
	
	
	
	
	}
}
