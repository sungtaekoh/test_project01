package TV;

import java.util.Scanner;

public class TvMethod {

	private int channel = 0;
	private int volume =0;
	
	public int getChannel() {
		if(channel == 3) {
			System.out.println("OBS채널입니다");
		}else if(channel ==5) {
			System.out.println("kbs채널입니다");
		}else if(channel == 7){
			System.out.println("YTN채널입니다");
		}else {
			
		}
			
		return channel;
	}
	public void setChannel(int channel) {
		this.channel = channel;
	}
	public int getVolume() {
		if(volume > 5) {
			System.out.println("너무 큰 음량은 귀건강에 해로울 수 있습니다");
		}else if (volume <= 0){
			System.out.println("가장 낮은 볼륨입니다.");
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
			System.out.println("1.티비 ON");
			System.out.println("2.티비 OFF");
			System.out.println("입력 : \n >>>");
			int num1 = input.nextInt();
			while(bool) {
			switch(num1) {
			case 1://티비 ON
				System.out.println("1.티비 채널 +1");
				System.out.println("2.티비 채널 -1");
				System.out.println("3.티비 볼륨 +1");
				System.out.println("4.티비 볼륨 -1");
				System.out.println("5.채널 입력 :  ");
				System.out.println("6.티비OFF");
				System.out.println("입력 : \n >>>");
				int num2 = input.nextInt();
				if(num2 == 1) {//티비 채널 +1
					System.out.println("채널 +1");
					channel = channel +1;
					ex.setChannel(channel);
					System.out.println("현재 채널 : "+ex.getChannel());
				}else if(num2 == 2) {//티비 채널 -1
					System.out.println("채널 -1");
					channel = channel -1;
					ex.setChannel(channel);
					System.out.println("현재 채널 : "+ex.getChannel());
				}else if(num2 == 3) {//티비 볼륨 +1
					System.out.println("볼륨 +1");
					volume = volume +1;
					ex.setVolume(volume);
					System.out.println("현재 볼륨 : "+ex.getVolume());
				}else if(num2 == 4) {//티비 볼륨 -1
					System.out.println("볼륨 -1");
					volume = volume -1;
					ex.setVolume(volume);
					System.out.println("현재 볼륨 : "+ex.getVolume());
				}else if(num2 == 5) {//채널 입력
					System.out.println("채널 입력 : ");
					int num3 = input.nextInt();
					channel = num3;
					ex.setChannel(channel);
					System.out.println(channel+"로 이동합니다");
					try {
						Thread.sleep(3000);//로딩시간
					}catch (Exception e) {
					}
					System.out.println("현재 채널 : "+ex.getChannel());
				}else if(num2 == 6) {//종료하기
					System.out.println("티비를 끕니다");
					System.exit(0);
				}
				break;
			case 2://티비 OFF
				break;
			}
				
			}
		}
	
		}
	
}
