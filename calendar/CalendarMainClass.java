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
							
						}
						else if(num4 == 2) {//���� �߰�
							System.out.println("�߰� �� ������ �Է��� �ּ���.");
							System.out.println("��¥ �Է�");
							System.out.println("�⵵ : ");
							year = input.nextInt();
							System.out.println("�� : ");
							month = input.nextInt();
							System.out.println("�� : ");
							day = input.nextInt();
							System.out.println("���� �Է� : ");
							map.put(key, val);
						}
						else if(num4 == 3) {//���� ����
							
						}
						else if(num4 == 4) {//�����ϱ�
							
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
		
		
	}
}
