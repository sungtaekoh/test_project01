package washer;

import java.util.Scanner;

public class WasherMethod {
	private int wash1 =0;//��Ź
	private int wash2 =0;//���
	private int dry =0;//Ż��
	public int getWash1() {
		return wash1;
	}
	public void setWash1(int wash1) {
		this.wash1 = wash1;
	}
	public int getWash2() {
		return wash2;
	}
	public void setWash2(int wash2) {
		this.wash2 = wash2;
	}
	public int getDry() {
		return dry;
	}
	public void setDry(int dry) {
		this.dry = dry;
	}
	
	public void Lod1() {//���� �ε�
		System.out.println("===== ��Ź�Ⱑ �������ϴ�. =====");
		System.out.println("��ø� ��ٷ��ּ���.");
		try {
			for(int i =3; i>0;i--) {
				Thread.sleep(1000);
				System.out.println("Loding..."+i);
			}
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void lod2() {//��Ź�ð� �ε�
		try {
			for(int i =5; i>0;i--) {
				Thread.sleep(500);
				System.out.println("���� �ð� : "+i);
			}
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void display() {
		Scanner input = new Scanner(System.in); 
		WasherMethod ex = new WasherMethod();
		
		int wash1 = 0;
		int wash2 = 0;
		int dry = 0;
		int cnt =0;
		boolean bool = true;
		
		while(bool) {
			System.out.println("1.��Ź�� ON");
			System.out.println("2.��Ź�� OFF");
			int num1 = input.nextInt();
				switch(num1) {
				case 1:
					if(cnt ==0 ) {
					ex.Lod1();
					cnt = cnt+1;
					}else {
						
					}
					System.out.println("1.��Ź�ϱ�");
					System.out.println("2.���");
					System.out.println("3.Ż��");
					System.out.println("4.����");
					int num2 = input.nextInt();
					if(num2 == 1) {//1. ��Ź�ϱ�
						System.out.println("��Ź�� �ð��� �Է����ּ���.");
						System.out.println("�Է� : ");
						wash1 = input.nextInt();
						ex.setWash1(wash1);
						System.out.println(ex.getWash1()+"�� ��Ź�� ���۵˴ϴ�.");
						ex.lod2();
						System.out.println("��Ź�� �Ϸ� �Ǿ����ϴ�.");
					}else if(num2 == 2) {//2.���
						System.out.println("��� �ð��� �Է��� �ּ��� : ");
						System.out.println("�Է� : ");
						wash2 = input.nextInt();
						ex.setWash2(wash2);
						System.out.println(ex.getWash2()+"�� ����� �����մϴ�");
						ex.lod2();
						System.out.println("����� �Ϸ� �Ǿ����ϴ�.");
					}else if(num2 == 3) {//3.Ż��
						if(ex.getWash2()>0) {
							System.out.println("Ż���� ���۵˴ϴ�.");
							System.out.println("Ż�� �ð��� �Է����ּ���");
							System.out.println("Ż�� �ð� �Է� : ");
							dry = input.nextInt();
							ex.setDry(dry);
							System.out.println(ex.getDry()+"�� Ż���� �����մϴ�.");
							ex.lod2();
							System.out.println("Ż���� �Ϸ�Ǿ����ϴ�.");
						}else {
							System.out.println("����� ���� ������ �ֽʽÿ�");
						}
					}else if(num2 == 4) {//4.����
						System.out.println("��Ź�⸦ �����մϴ�. ");
						bool = false;
					}else {//�� ���� �Է�
						System.out.println("�߸��� �Է��Դϴ�.");
					}
					break;
				case 2:
					System.out.println("��Ź�⸦ �����մϴ�.");
					System.exit(0);
					break;
				}
		}

	}
	
}
