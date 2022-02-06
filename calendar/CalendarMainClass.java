package calendar;

import java.util.HashMap;
import java.util.Scanner;

public class CalendarMainClass {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		HashMap map = new HashMap();
		CalendarMethod cal = new CalendarMethod();
		
		boolean bool1 = true;
		boolean bool2 = true;
		boolean bool3 = true;
		boolean bool4 = true;
		int year =0;
		int month =0;
		int day =0;
		String key = null;
		String val = null;
		
		while(bool1) {
			System.out.println("1.달력 ON");
			System.out.println("2.달력 OFF");
			int num1 = input.nextInt();
			if(num1 == 1) {//1.달력 시작
				while(bool2) {
					System.out.println("1.날짜 변경하기");
					System.out.println("2.일정 변경하기");
					int num2 =input.nextInt();
					if(num2 == 1) {//날짜 변경하기
						while(bool3) {
						System.out.println("1.년 +1");
						System.out.println("2.년 -1");
						System.out.println("3.월 +1");
						System.out.println("4.월 -1");
						System.out.println("5.일 +1");
						System.out.println("6.일 -1");
						System.out.println("7.종료하기");
						int num3 =input.nextInt();
						if(num3 == 1) {//년 +1
							System.out.println("년 +1");
							year = cal.getYear()+1;
							cal.setYear(year);
							year =0;
							cal.date();
						}
						else if(num3 == 2) {//년 =1
							System.out.println("년 -1");
							year = cal.getYear()-1;
							cal.setYear(year);
							year =0;
							cal.date();
						}
						else if(num3 == 3) {//월 +1
							System.out.println("월 +1");
							month = cal.getMonth()+1;
							cal.setMonth(month);
							month =0;
							cal.date();
						}
						else if(num3 == 4) {//월 -1
							System.out.println("월 -1");
							month = cal.getMonth()-1;
							cal.setMonth(month);
							month =0;
							cal.date();
						}
						else if(num3 == 5) {//일 +1
							System.out.println("일 +1");
							day = cal.getDay()+1;
							cal.setDay(day);
							day =0;
							cal.date();
						}
						else if(num3 == 6) {//일 -1
							System.out.println("일 -1");
							day = cal.getDay()-1;
							cal.setDay(day);
							day =0;
							cal.date();
						}
						else if(num3 == 7) {//종료
							System.out.println("달력을 종료합니다");
							System.exit(0);
						}else {//잘 못 입력
							System.out.println("잘 못 된 입력입니다.");
						}
						}
					
					}else if(num2 == 2) {//일정 변경하기
						System.out.println("1.일정 확인");
						System.out.println("2.일정 추가");
						System.out.println("3.일정 삭제");
						System.out.println("4.종료하기");
						int num4 = input.nextInt();
						if(num4 == 1) {//일정 확인
							
						}
						else if(num4 == 2) {//일정 추가
							System.out.println("추가 할 일정을 입력해 주세요.");
							System.out.println("날짜 입력");
							System.out.println("년도 : ");
							year = input.nextInt();
							System.out.println("월 : ");
							month = input.nextInt();
							System.out.println("일 : ");
							day = input.nextInt();
							System.out.println("일정 입력 : ");
							map.put(key, val);
						}
						else if(num4 == 3) {//일정 삭제
							
						}
						else if(num4 == 4) {//종료하기
							
						}
						else {//잘 못 입력
							System.out.println("잘 못 된 입력입니다.");
						}
					}
					
					
				}
			}else if(num1 == 2) {//2. 달력 종료
				System.out.println("달력을 종료합니다.");
			}else {//잘 못 입력한 경우
				System.out.println("잘 못 입력하셨습니다.");
			}
			
			
			
		}
		
		
	}
}
