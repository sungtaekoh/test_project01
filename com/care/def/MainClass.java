package com.care.def;

import java.util.Scanner;

import TV.TvMethod;
import washer.WasherMethod;

public class MainClass {//�ڹ� �̴�������Ʈ
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	int num;
	System.out.println("----- ������ǰ -----");
	while(true) {
		System.out.println("1.T V");
		System.out.println("2.��Ź��");
		System.out.println("3.�޷�"); //+�ð� ���� �޷�(����� ����ǥ��)
		System.out.println(">>> : ");
		num = input.nextInt();
		switch(num) {//TV
		case 1:
			TvMethod tv = new TvMethod();
			tv.TVdisplay();
			break;
		case 2://��Ź��
			WasherMethod wahser = new  WasherMethod ();
			wahser.display();
			break;
		case 3://�޷�
			System.out.println("�޷�");
			break;
			
		}
		
	}
	
	
	
	
	}
}
