package washer;

import java.util.Scanner;

public class WasherMethod {
	private int wash1 =0;//세탁
	private int wash2 =0;//행굼
	private int dry =0;//탈수
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
	
	public void Lod1() {//시작 로딩
		System.out.println("===== 세탁기가 켜졌습니다. =====");
		System.out.println("잠시만 기다려주세요.");
		try {
			for(int i =3; i>0;i--) {
				Thread.sleep(1000);
				System.out.println("Loding..."+i);
			}
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void lod2() {//세탁시간 로딩
		try {
			for(int i =5; i>0;i--) {
				Thread.sleep(500);
				System.out.println("남은 시간 : "+i);
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
			System.out.println("1.세탁기 ON");
			System.out.println("2.세탁기 OFF");
			int num1 = input.nextInt();
				switch(num1) {
				case 1:
					if(cnt ==0 ) {
					ex.Lod1();
					cnt = cnt+1;
					}else {
						
					}
					System.out.println("1.세탁하기");
					System.out.println("2.행굼");
					System.out.println("3.탈수");
					System.out.println("4.종료");
					int num2 = input.nextInt();
					if(num2 == 1) {//1. 세탁하기
						System.out.println("세탁할 시간을 입력해주세요.");
						System.out.println("입력 : ");
						wash1 = input.nextInt();
						ex.setWash1(wash1);
						System.out.println(ex.getWash1()+"분 세탁이 시작됩니다.");
						ex.lod2();
						System.out.println("세탁이 완료 되었습니다.");
					}else if(num2 == 2) {//2.행굼
						System.out.println("행굼 시간을 입력해 주세요 : ");
						System.out.println("입력 : ");
						wash2 = input.nextInt();
						ex.setWash2(wash2);
						System.out.println(ex.getWash2()+"분 행굼을 시작합니다");
						ex.lod2();
						System.out.println("행굼이 완료 되었습니다.");
					}else if(num2 == 3) {//3.탈수
						if(ex.getWash2()>0) {
							System.out.println("탈수가 시작됩니다.");
							System.out.println("탈수 시간을 입력해주세요");
							System.out.println("탈수 시간 입력 : ");
							dry = input.nextInt();
							ex.setDry(dry);
							System.out.println(ex.getDry()+"분 탈수를 시작합니다.");
							ex.lod2();
							System.out.println("탈수가 완료되었습니다.");
						}else {
							System.out.println("행굼을 먼저 시작해 주십시오");
						}
					}else if(num2 == 4) {//4.종료
						System.out.println("세탁기를 종료합니다. ");
						bool = false;
					}else {//잘 못된 입력
						System.out.println("잘못된 입력입니다.");
					}
					break;
				case 2:
					System.out.println("세탁기를 종료합니다.");
					System.exit(0);
					break;
				}
		}

	}
	
}
