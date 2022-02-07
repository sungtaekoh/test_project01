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
		return (String)(pYear+"년 "+pMonth+"월 "+pDay+"일");
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
			System.out.println("더 이상 낯출 수 없습니다.");
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
			System.out.println("더 이상 낯출 수 없습니다.");
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
			System.out.println("더 이상 낯출 수 없습니다.");
			return day =1;
		}else {
			
		}
		return day;
	}
	
	public void setDay(int day) {
		this.day = day;
	}
	
	public void date() {
		System.out.println("현재 날짜 : "+getYear()+"년"+getMonth()+"월"+getDay()+"일");
	}
	
	
}
