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
			String s = null;//���� �Է� ���� ������
			String d = null;//�������� ����
			
			while(bool1) {
				System.out.println("1.�޷� ON");
				System.out.println("2.�޷� OFF");
				int num1 = input.nextInt();
				if(num1 == 1) {//1.�޷� ����
					while(bool2) {
						System.out.println("1.��¥ �����ϱ�");
						System.out.println("2.���� �����ϱ�");
						int num2 =input.nextInt();
						if(num2 == 1) {//��¥ �����ϱ�
							while(bool3) {
							System.out.println("1.�� +1");
							System.out.println("2.�� -1");
							System.out.println("3.�� +1");
							System.out.println("4.�� -1");
							System.out.println("5.�� +1");
							System.out.println("6.�� -1");
							System.out.println("7.�����ϱ�");
							int num3 =input.nextInt();
							if(num3 == 1) {//�� +1
								System.out.println("�� +1");
								year = cal.getYear()+1;
								cal.setYear(year);
								year =0;
								cal.date();
							}
							else if(num3 == 2) {//�� =1
								System.out.println("�� -1");
								year = cal.getYear()-1;
								cal.setYear(year);
								year =0;
								cal.date();
							}
							else if(num3 == 3) {//�� +1
								System.out.println("�� +1");
								month = cal.getMonth()+1;
								cal.setMonth(month);
								month =0;
								cal.date();
							}
							else if(num3 == 4) {//�� -1
								System.out.println("�� -1");
								month = cal.getMonth()-1;
								cal.setMonth(month);
								month =0;
								cal.date();
							}
							else if(num3 == 5) {//�� +1
								System.out.println("�� +1");
								day = cal.getDay()+1;
								cal.setDay(day);
								day =0;
								cal.date();
							}
							else if(num3 == 6) {//�� -1
								System.out.println("�� -1");
								day = cal.getDay()-1;
								cal.setDay(day);
								day =0;
								cal.date();
							}
							else if(num3 == 7) {//����
								System.out.println("�޷��� �����մϴ�");
								System.exit(0);
							}else {//�� �� �Է�
								System.out.println("�� �� �� �Է��Դϴ�.");
							}
							}
						
						}else if(num2 == 2) {//���� �����ϱ�
							System.out.println("1.���� Ȯ��");
							System.out.println("2.���� �߰�");
							System.out.println("3.���� ����");
							System.out.println("4.�����ϱ�");
							int num4 = input.nextInt();
							if(num4 == 1) {//���� Ȯ��
							Iterator it = map.keySet().iterator();
							if(it.hasNext()==true) {
								while(it.hasNext()==true) {
									String key = (String)it.next();
									System.out.println(key+" : "+map.get(key));
								}	
							}else {
								System.out.println("�����ϴ� ������ �����ϴ�.");
							}
							}
							else if(num4 == 2) {//���� �߰�
								System.out.println("�߰� �� ������ �Է��� �ּ���.");
								System.out.println("��¥ �Է�");
								
								System.out.println("�⵵ : ");
								pYear = input.nextInt();
								cal.setpYear(pYear);
								System.out.println("�� : ");
								pMonth = input.nextInt();
								cal.setpMonth(pMonth);
								System.out.println("�� : ");
								pDay = input.nextInt();
								cal.setpDay(pDay);
								System.out.println("���� �Է� : ");
								s = input.next();
								cal.setS(s);
								map.put(s, cal.pDate());
								System.out.println(s+" : "+cal.pDate()+" ������ ��ϵǾ����ϴ�.");
							}
							else if(num4 == 3) {//���� ����
								System.out.println("������ ������ �Է��� �ּ���.");
								System.out.println("�Է� : ");
								d = input.next();//���� ���� : d
								if(map.containsKey(d)== true) {
									map.remove(d);
									System.out.println("���������� ������ �����Ǿ����ϴ�.");
								}else {
									System.out.println("�������� �ʴ� �����Դϴ�.");
								}
							}
							else if(num4 == 4) {//�����ϱ�
								System.out.println("�޷��� �����մϴ�.");
								System.exit(0);
							}
							else {//�� �� �Է�
								System.out.println("�� �� �� �Է��Դϴ�.");
							}
						}
						
						
					}
				}else if(num1 == 2) {//2. �޷� ����
					System.out.println("�޷��� �����մϴ�.");
				}else {//�� �� �Է��� ���
					System.out.println("�� �� �Է��ϼ̽��ϴ�.");
				}
				
			}
			
			
			
			}//����

	public void calc() {//Ư�� ��¥�� �Ǿ����� �˶��� �־��ִ� ���
		}
	
	
	}//Ŭ����
	
