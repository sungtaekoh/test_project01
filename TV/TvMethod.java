package TV;

import java.util.Scanner;

public class TvMethod {

	private int channel = 0;
	private int volume =0;
	
	public int getChannel() {
		if(channel == 3) {
			System.out.println("OBSä���Դϴ�");
		}else if(channel ==5) {
			System.out.println("kbsä���Դϴ�");
		}else if(channel == 7){
			System.out.println("YTNä���Դϴ�");
		}else {
			
		}
			
		return channel;
	}
	public void setChannel(int channel) {
		this.channel = channel;
	}
	public int getVolume() {
		if(volume > 5) {
			System.out.println("�ʹ� ū ������ �Ͱǰ��� �طο� �� �ֽ��ϴ�");
		}else if (volume <= 0){
			System.out.println("���� ���� �����Դϴ�.");
			return volume =0;
		}else {
			
		}
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	
public void TVdisplay() {
		
		Scanner input = new Scanner(System.in);
		TvMethod ex = new TvMethod();
		
		boolean bool = true;
		int channel =0;
		int volume = 0;
		
		while(bool) {
			System.out.println("1.Ƽ�� ON");
			System.out.println("2.Ƽ�� OFF");
			System.out.println("�Է� : \n >>>");
			int num1 = input.nextInt();
			while(bool) {
			switch(num1) {
			case 1://Ƽ�� ON
				System.out.println("1.Ƽ�� ä�� +1");
				System.out.println("2.Ƽ�� ä�� -1");
				System.out.println("3.Ƽ�� ���� +1");
				System.out.println("4.Ƽ�� ���� -1");
				System.out.println("5.ä�� �Է� :  ");
				System.out.println("6.Ƽ��OFF");
				System.out.println("�Է� : \n >>>");
				int num2 = input.nextInt();
				if(num2 == 1) {//Ƽ�� ä�� +1
					System.out.println("ä�� +1");
					channel = channel +1;
					ex.setChannel(channel);
					System.out.println("���� ä�� : "+ex.getChannel());
				}else if(num2 == 2) {//Ƽ�� ä�� -1
					System.out.println("ä�� -1");
					channel = channel -1;
					ex.setChannel(channel);
					System.out.println("���� ä�� : "+ex.getChannel());
				}else if(num2 == 3) {//Ƽ�� ���� +1
					System.out.println("���� +1");
					volume = volume +1;
					ex.setVolume(volume);
					System.out.println("���� ���� : "+ex.getVolume());
				}else if(num2 == 4) {//Ƽ�� ���� -1
					System.out.println("���� -1");
					volume = volume -1;
					ex.setVolume(volume);
					System.out.println("���� ���� : "+ex.getVolume());
				}else if(num2 == 5) {//ä�� �Է�
					System.out.println("ä�� �Է� : ");
					int num3 = input.nextInt();
					channel = num3;
					ex.setChannel(channel);
					System.out.println(channel+"�� �̵��մϴ�");
					try {
						Thread.sleep(3000);//�ε��ð�
					}catch (Exception e) {
					}
					System.out.println("���� ä�� : "+ex.getChannel());
				}else if(num2 == 6) {//�����ϱ�
					System.out.println("Ƽ�� ���ϴ�");
					System.exit(0);
				}
				break;
			case 2://Ƽ�� OFF
				break;
			}
				
			}
		}
	
		}
	
}
