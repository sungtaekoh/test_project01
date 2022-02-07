package calendar;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class CalendarMainClass {
	HashMap map = new HashMap();
	CalendarMethod cal = new CalendarMethod();
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
			
			
			
			boolean bool1 = true;
			boolean bool2 = true;
			boolean bool3 = true;
			boolean bool4 = true;
			int year =0;
			int month =0;
			int day =0;
			int pYear =0;
			int pMonth =0;
			int pDay =0;
			String s = null;//일정 입력 변수 스케쥴
			String d = null;//삭제일정 변수
			
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
							Iterator it = map.keySet().iterator();
							if(it.hasNext()==true) {
								while(it.hasNext()==true) {
									String key = (String)it.next();
									System.out.println(key+" : "+map.get(key));
								}	
							}else {
								System.out.println("존재하는 일정이 없습니다.");
							}
							}
							else if(num4 == 2) {//일정 추가
								System.out.println("추가 할 일정을 입력해 주세요.");
								System.out.println("날짜 입력");
								
								System.out.println("년도 : ");
								pYear = input.nextInt();
								cal.setpYear(pYear);
								System.out.println("월 : ");
								pMonth = input.nextInt();
								cal.setpMonth(pMonth);
								System.out.println("일 : ");
								pDay = input.nextInt();
								cal.setpDay(pDay);
								System.out.println("일정 입력 : ");
								s = input.next();
								cal.setS(s);
								map.put(s, cal.pDate());
								System.out.println(s+" : "+cal.pDate()+" 일정이 등록되었습니다.");
							}
							else if(num4 == 3) {//일정 삭제
								System.out.println("삭제할 일정을 입력해 주세요.");
								System.out.println("입력 : ");
								d = input.next();//삭제 변수 : d
								if(map.containsKey(d)== true) {
									map.remove(d);
									System.out.println("성공적으로 일정이 삭제되었습니다.");
								}else {
									System.out.println("존재하지 않는 일정입니다.");
								}
							}
							else if(num4 == 4) {//종료하기
								System.out.println("달력을 종료합니다.");
								System.exit(0);
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
			
			
			
			}//메인

	public void calc() {//특정 날짜가 되었을때 알람을 넣어주는 기능
		}
	
	
	}//클래스
	
