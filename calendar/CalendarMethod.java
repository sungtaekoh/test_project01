package calendar;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class CalendarMethod {
 
	private int year =2000;
	private int month =1;
	private int day =1;
	
	private int pYear =2000;
	private int pMonth =1;
	private int pDay =1;
	private String s = null;
	
	public void setS(String s) {
		this.s = s;
	}
			
	
	public String pDate() {
		return (String)(pYear+"�� "+pMonth+"�� "+pDay+"��");
	}
	
	public int getpYear() {
		return pYear;
	}
	public void setpYear(int pYear) {
		this.pYear = pYear;
	}
	public int getpMonth() {
		return pMonth;
	}
	public void setpMonth(int pMonth) {
		this.pMonth = pMonth;
	}
	public int getpDay() {
		return pDay;
	}
	public void setpDay(int pDay) {
		this.pDay = pDay;
	}
	public int getYear() {
		if(year<1) {
			System.out.println("�� �̻� ���� �� �����ϴ�.");
			return year =1;
		}else {
			
		}
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMonth() {
		if(month<1) {
			System.out.println("�� �̻� ���� �� �����ϴ�.");
			return month =1;
		}else {
			
		}
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getDay() {
		if(day<1) {
			System.out.println("�� �̻� ���� �� �����ϴ�.");
			return day =1;
		}else {
			
		}
		return day;
	}
	
	public void setDay(int day) {
		this.day = day;
	}
	
	public void date() {
		System.out.println("���� ��¥ : "+getYear()+"��"+getMonth()+"��"+getDay()+"��");
	}
	
	
}
