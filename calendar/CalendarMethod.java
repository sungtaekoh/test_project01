package calendar;

public class CalendarMethod {
 
	private int year =2000;
	private int month =1;
	private int day =1;
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
